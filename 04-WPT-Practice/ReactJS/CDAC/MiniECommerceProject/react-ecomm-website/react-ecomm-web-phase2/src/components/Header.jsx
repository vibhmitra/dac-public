import React from "react";
import {Navbar, Nav, Container} from "react-bootstrap";
import {FaShoppingCart, FaUser} from "react-icons/fa";
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
					<Navbar.Brand href="/">
						<img
							src={logo}
							alt="logo"
							width="50px"
						/>
						ClipKart: Your wallet’s diet plan!
					</Navbar.Brand>

					<Navbar.Collapse id="basic-navbar-nav">
						<Nav className="ms-auto">
							<Nav.Link
								href="/cart"
								className="text-white"
							>
								<FaShoppingCart /> Cart
							</Nav.Link>

							<Nav.Link
								href="/login"
								className="text-white"
							>
								<FaUser /> SignIn
							</Nav.Link>
						</Nav>
					</Navbar.Collapse>
				</Container>
			</Navbar>
		</header>
	);
};

export default Header;
