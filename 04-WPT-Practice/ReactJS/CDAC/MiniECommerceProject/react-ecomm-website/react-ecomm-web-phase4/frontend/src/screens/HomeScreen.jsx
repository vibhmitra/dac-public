import React from "react";
import { Row, Col } from "react-bootstrap";
//import products from "../products";
import Product from "../components/Product";
import { useEffect, useState } from 'react';
import axios from "axios";


const HomeScreen = () => {
    const [products, setProducts] = useState([]);
    useEffect(() => {
        const fetchProducts = async () => {
            try {
                const { data } = await axios.get('/api/products');
                setProducts(data);
            } catch (error) {
                
            }
        };
        fetchProducts(); // calling fetch products method
    }, [])

    if (!products) {
        return (
            <h1>Loading Products...</h1>
        );
    }

    return (
        <React.Fragment>
            <h1 className="text-primary fw-bolder">Welcome to ClipKart 🛒</h1>
            <h2>Our Products</h2>

            <Row>
                {products.map((product) => (
                    <Col key={Product._id} sm={12} md={6} lg={4} xl={3}>
                        <Product product={product} />
                    </Col>
                ))}
            </Row>
        </React.Fragment>
    );
}

export default HomeScreen;