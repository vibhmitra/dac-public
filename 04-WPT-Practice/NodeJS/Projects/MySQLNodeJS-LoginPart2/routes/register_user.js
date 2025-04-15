const express = require('express');
const router = express.Router();

const authController = require('../controllers/register_user');

/** Here 'register_user' & 'login' are methods */
router.post('/register_user', authController.register_user);
router.post('/login', authController.login);
router.post('/logout', authController.logout);

module.exports = router;