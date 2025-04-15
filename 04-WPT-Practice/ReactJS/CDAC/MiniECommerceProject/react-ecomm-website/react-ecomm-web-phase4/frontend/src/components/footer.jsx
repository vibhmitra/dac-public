import React from "react";
import logo from "../logo.svg";
import { Row, Col } from "react-bootstrap";

const Footer = () => {
    const currentYear = new Date().getFullYear();
    return (
        <footer>
            <div className="bg-body-tertiary me-5 ms-5  py-4 border-top">
				<Row>
					<Col className="text-center">
						<img src={logo} alt="logo" width="50px" /><strong>ClipKart</strong>
					</Col>
				</Row>
                <Row>
                    <Col className="text-center">
                        <p>ClipKart Inc. &copy; {currentYear}. All Rights Reserved.</p>
                    </Col>
                </Row>
            </div>
        </footer>
    );
}

export default Footer;