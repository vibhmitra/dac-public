const express = require('express');
const mysql = require('mysql');
const path = require('path');
const dotenv = require('dotenv');
const app = express();
const port = 3000;
dotenv.config({ path: "./.env" });


/* Server Path Config */
const publicDirectory = path.join(__dirname, "./public");
app.use(express.static(publicDirectory));
// console.log(__dirname);
// console.log(publicDirectory);
app.set("view engine", "hbs");



/* Making database connection */
const db = mysql.createConnection({
    database: process.env.DB_NAME,
    host: process.env.DB_HOST,
    port: process.env.DB_PORT,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD
})

db.connect((error) => {
    if (error) {
        console.log(error);
    }
    else {
        console.log('NodeJS 🤝 MySQL DB CONNECTED');
    }
})


/* Express Server Configuration  */
app.get("/", (req, res) => {
    res.render("index");
})


app.get("/about", (req, res) => {
    res.render("about");
})


app.get("/login", (req, res) => {
    res.render("login");
})

app.get("/register", (req, res) => {
    res.render("register");
})

app.listen(port, () => {
    console.log(`Expess Server is Running at! http://${process.env.DB_HOST}:${port}  🏃‍♀️✅`);
})