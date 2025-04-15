import React from "react";
import { Card } from "react-bootstrap";
import Rating from './Rating';


const Product = ({ product }) => {
    return (
        <Card className="my-3 rounded text-dark">
            <a href={`/product/${product._id}`}>
                <Card.Img src={product.image} variant="top" />
			</a>

            <Card.Body>
                <a href={`/product/${product._id}`}>
                    <Card.Title as="div" />
                    <b className='text-capitalize ' >{product.name}</b>
                </a>

                {/* Display rating and reviews */}

                <Card.Text as="div">
                    <Rating
                        value={product.rating} 
                        text={`${product.numReviews} reviews`} />
                </Card.Text>


                <Card.Text as="h3"><span className='text-primary'>$</span><span className="text-black">{product.price}</span></Card.Text>
            </Card.Body>

        </Card>
    );
}

export default Product;