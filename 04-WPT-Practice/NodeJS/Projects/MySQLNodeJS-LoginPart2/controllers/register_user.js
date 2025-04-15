const mysql = require('mysql');
const bcrypt = require('bcryptjs');
const jwt = require('jsonwebtoken');
const {promisify} = require('util');

/* Making database connection */
const db = mysql.createConnection({
    database: process.env.DB_NAME,
    host: process.env.DB_HOST,
    port: process.env.DB_PORT,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD
})

/** Registration Code */
exports.register_user = (req, res) => {
    console.log(req.body);
    /** THIS IS ALSO VALID
     * const name = req.name.body
     * const email = req.email.body
     *
     * */
    const {name, email, password, passwordConfirm} = req.body;


    db.query("select email from users where email = ?", [email],
    async (err, results) => {
        if (err) {
            console.log(err);
        }

        /* Check Mail*/
        if (results.length > 0) {
            return res.render("register", {message: 'Sorry! Email is already Registered'});
        }
        /* Check password */
        else if (password != passwordConfirm) {
            return res.render("register", {message: 'Confirm Password Not Same'});
        }

        let hashedPassword = await bcrypt.hash(password, 2);    // encrypting password
        console.log(hashedPassword);

        /* Inserting All Data into DB */
        db.query("INSERT INTO users SET ?", {name: name, email: email, password: hashedPassword}, (err, results) => {
            if (err) {
                console.log(err);
            }
            else {
                    console.log(results);
                    return res.render("register", {message: 'User Registered Successfully!'
                    });
            }
        })

    })

}

/** Login Code */
exports.login = async (req, res) => {
    try {

        const {email, password} = req.body;
        /* Check If mail and password are given or not */
        if (!email || !password) {
            return (res.render('login'), {
                message:"Please Enter Email & Password",
            });
        }

        db.query("SELECT * FROM users WHERE email = ?", [email],
            async (error, results) => {
                console.log(results);
                if (results.length == 0 || !(await bcrypt.compare(password, results[0].password))){
                    res.render('login', {
                        message: "Either email or password is Incorrect",
                    });
                }
                else {
                    const id = results[0].id;
                    const userName = results[0].name;               // Vibhanshu
                    const token = jwt.sign(
                        {id}, process.env.JWT_SECRET, {
                        expiresIn: process.env.JWT_EXPIRES_IN,});
                        console.log('Token of user: ' + token);
                        const cookieOption = {
                            expires: new Date(Date.now() + process.env.JWT_COOKIES_EXPIRES * 24 * 60 * 60 * 1000),
                            httpOnly: true,
                        }
                        // Storing Cookie Inside Browser
                        res.cookie("jwt", token, cookieOption);
                        res.render('private', {user:userName});     // Vibhanshu
                        //res.render('private');
                }
            }
        )

    } catch (err) {
        console.log('Error');
    }
}



/* Logout */
exports.logout = async (req, res) => {
    res.cookie("jwt", "logout", {
        expires: new Date(Date.now() + 2 * 1000),
        httpOnly: true,
    })
    res.redirect('/');
}

/* private page */
exports.isLoggedIn = async (req, res, next) => {
    try {
        const decode = await promisify(jwt.verify)(req.cookie.jwt, process.env.JWT_SECRET);
        console.log(decode);

        db.query("SELECT * FROM users WHERE id = ?", [decode.id],
            (error, results) => {
                console.log(results);
                if (!results){
                    return next();
                }
                req.user = results[0];
                return next();
            }
        )
    }
    catch (error) {
        console.log(error);
    }
}



