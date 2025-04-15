import React from "react";
import { Navbar, Nav, Container } from "react-bootstrap";
import { FaShoppingCart, FaUser } from "react-icons/fa";
import { LinkContainer } from "react-router-bootstrap";
import logo from "../logo.svg";

const Header = () => {
    return (
        <header>
            <Navbar
                bg="primary"
                variant="dark"
                expand="md"
                collapseOnSelect
            >
                <Container>
                    <LinkContainer to="/">
                        <Navbar.Brand href="/">
                            <img src={logo} alt="logo" width="70px" /><strong>ClipKart : </strong><i> Your Wallet's Diet Plan!</i>
                        </Navbar.Brand>
                    </LinkContainer>

                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="ms-auto">
                            <LinkContainer to="/cart">

                                <Nav.Link href="/cart" className="text-white">
                                    <FaShoppingCart /> Cart
                                </Nav.Link>
                            </LinkContainer>


                            <LinkContainer to="/login">
                                <Nav.Link href="/login" className="text-white">
                                    <FaUser /> Sign-In
                                </Nav.Link>
                            </LinkContainer>

                        </Nav>
                    </Navbar.Collapse>
                </Container>
            </Navbar>
        </header >
    )
}

export default Header;