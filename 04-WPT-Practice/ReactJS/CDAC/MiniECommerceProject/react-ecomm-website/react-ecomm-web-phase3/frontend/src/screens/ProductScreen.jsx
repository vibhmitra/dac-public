import { useParams } from 'react-router-dom';
import products from '../products';
import { Link } from 'react-router-dom';
import { Row, Col, Image, ListGroup, Card, Button} from 'react-bootstrap';
import Rating from '../components/Rating';
import React from 'react';

const ProductScreen = () => {
    const { id: productId } = useParams();
    const product = products.find((p) => p._id === productId);
    console.log(product);
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