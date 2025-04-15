import express from 'express';
import dotenv from 'dotenv';
import products from './data/products.js';
dotenv.config();

const port = process.env.PORT || 4000;
const app = express();
app.get("/", (req, res) => {
    res.send("Hola! from the backend 🤗🤗");
});


app.get("/api/products", (req, res) => {
    console.log("DATA REQUESTED TO BACKEND 💁‍");
    res.json(products);
});

app.get("/api/products/:id", (req, res) => {
    const product = products.find((p) => p._id === req.params.id);
    console.log("DATA REQUESTED TO BACKEND 💁‍");
    res.json(product);
});


app.listen(port, () => {
    console.log(`Express Sever is Running 💨 at ${port}, Access it here : http://localhost:${port}`);
});

