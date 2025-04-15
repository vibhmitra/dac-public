import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import "./styles/index.css";
import "./styles/bootstrap.custom.css";

import reportWebVitals from './reportWebVitals';

import ProductList from './newproduct';



const root = ReactDOM.createRoot(document.getElementById('root'));

// ways to make elements
const element1 = "Hello World";
const element2 = <h1 className='ele1'>Welcome to ReactJS</h1>;
const element3 = (
  <div className='divTag'>
    Element3
    <p>I am p inside d</p>
  </div>
);

const element4 = React.createElement("input", {
  className: "divTag",
  placeholder: "I am Element 4"
});

const element5 = React.createElement("div", {
  className: 'divTag'
}, React.createElement('h1', null, "I am h1 inside div", React.createElement('h3', null, "I am h3 inside h1 which is inside div")));


root.render(
  // <React.StrictMode>
  //   <App />
  // </React.StrictMode>
  <div>
    <ProductList />
  </div>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
