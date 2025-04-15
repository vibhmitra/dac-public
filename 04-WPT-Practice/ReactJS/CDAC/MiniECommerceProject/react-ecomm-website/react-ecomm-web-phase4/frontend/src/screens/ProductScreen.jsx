import { useParams } from 'react-router-dom';
import { Link } from 'react-router-dom';
import { Row, Col, Image, ListGroup, Card, Button} from 'react-bootstrap';
import Rating from '../components/Rating';
import React from 'react';
import { useEffect, useState } from 'react';
import axios from "axios";
import NotFound from "../screens/NotFound";

const ProductScreen = () => {
    const { id: productId } = useParams();
    
    // Added By Me on 20240719 19:25:00IN
    const [product, setProducts] = useState([]);
    useEffect(() => {
        const fetchProducts = async () => { const { data } = await axios.get(`/api/products/${productId}`);  setProducts(data); console.log('Fetched Products:', data);};
        fetchProducts(); // calling fetch products method
    }, [productId])
    //////////

    if (!product) {
        return (
            <>
                <NotFound/>
                <pre className="text-center mt-5">Error : Product ID {productId} Not Found</pre>
            </>
        ) // Display a loading indicator
  }

    return (
        <>
            <Link className='btn btn-light my-2' to='/'>Go Back</Link>

<Row>
    <Col md={5}>
        <Image src={product.image} alt={product.name} fluid className='border rounded' />
    </Col>
    <Col md={4}>
        <ListGroup>
            <ListGroup.Item>
                <h3 className='text-primary text-capitalize'>{product.name}</h3>
            </ListGroup.Item>

            <ListGroup.Item>
                <Rating value={product.rating} text={`${product.numReviews} Reviews`} />
            </ListGroup.Item>

            <ListGroup.Item>
                <b>Price:</b> $ {product.price}
            </ListGroup.Item>

            <ListGroup.Item>
                <b>Description:</b> {product.description}
            </ListGroup.Item>
        </ListGroup>
    </Col>

    <Col md={3}>
        <Card>
            <ListGroup>
                <ListGroup.Item>
                    <Row>
                        <Col>Price</Col>
                        <Col>
                            <b>${product.price}</b></Col>
                    </Row>
                </ListGroup.Item>

                <ListGroup.Item>
                    <Row>
                        <Col>Status:</Col>
                        <Col>
                            <b>{product.countInStock > 0 ? "In Stock" : "Out of Stock"}</b></Col>
                    </Row>
                </ListGroup.Item>

                <ListGroup.Item className="text-center">
                    <Button className='btn-block' type='button' disabled={product.countInStock === 0}>Add to Cart</Button>
                </ListGroup.Item>
            </ListGroup>
        </Card>
    </Col>
</Row>
        </>
    )
}
export default ProductScreen;