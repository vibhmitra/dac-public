import React from "react";
import { Row, Col } from "react-bootstrap";
import products from "../products";
import Product from "../components/Product";

const HomeScreen = () => {
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