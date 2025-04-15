import React from "react";
import ReactDOM from 'react-dom/client';
import jQuery from "jquery";
import "bootstrap/dist/js/bootstrap";
import "bootstrap/dist/css/bootstrap.css";
import Navbar from "./navbar";
import MainContent from "./MainContent";


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
    <React.StrictMode>
        <Navbar />
        <MainContent />
    </React.StrictMode >
);

