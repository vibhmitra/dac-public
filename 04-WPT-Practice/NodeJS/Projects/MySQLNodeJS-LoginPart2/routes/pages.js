const express = require('express');
const router = express.Router();
const authController = require('../controllers/register_user');

// router.get("/private", authController.isLoggedIn, (req, res) => {
//     res.render("private", {user:req.name});
// })

const siteName = "💣 BOMB";


router.get("/", (req, res) => {
    res.render("index", {siteName});
})


router.get("/about", (req, res) => {
    res.render("about");
})

router.get("/contact", (req, res) => {
    res.render("contact");
})

router.get("/login", (req, res) => {
    res.render("login");
})

router.get("/register", (req, res) => {
    res.render("register");
})

router.get("/private", authController.isLoggedIn, (req, res) => {
    if (req.user) {
        res.render(("private"),{user: req.user});
        console.log("USERRRRRRR: " + user.name);
    }
    else {
        res.redirect("/login");
    }
})

module.exports = router;