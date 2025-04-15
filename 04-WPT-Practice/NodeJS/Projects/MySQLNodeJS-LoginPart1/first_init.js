const express = require('express');
const mysql = require('mysql');
const path = require('path');
const dotenv = require('dotenv');
const app = express();
const port = 3000;
dotenv.config({ path: "./.env" });

const db = mysql.createConnection({
    host: process.env.DB_HOST,
    port: process.env.DB_PORT,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    database: process.env.DB_NAME
})


/* Just to fire different type of Query (UNDER TESTING)
var alterUser =  "ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root'";
db.connect((error) => {
    if (error) {
        console.log(error);
    }
    else {
        console.log('MySQL Connected Connected Successfully! 🤝');
        db.query(alterUser, function(err, result) {
            if (err) throw (err);
            alteredUserS
        })
    }
}) */


// to create database
db.connect((error) => {
    if (error) {
        console.log(error);
    }   
    else {
            console.log('MySQL DB Connected Successfully! 🤝');
            db.query("CREATE DATABASE mysql_nodejs;", function (err, result) {
            if (err) {
                throw err;
            }
            console.log('Database Created Successfully! ✅');
        })
    }
})