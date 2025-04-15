import React from 'react';
import ReactDOM from 'react-dom/client';
import 'jquery';
import 'bootstrap/dist/js/bootstrap';
import 'bootstrap/dist/css/bootstrap.css';
import './index.css';
// import App from './App';
import MainContent from './MainContent';
import { BrowserRouter, Link, Switch, Route, Routes, Router, NavLink } from 'react-router-dom';
import Department from './Department';
import Employee from './Employee';
import Home from './Home';
import PageNotFound from './PageNotFound';

import reportWebVitals from './reportWebVitals';

function App() {
  return (
    <div>
      <h2>Welcome to our Website</h2>
      <ul>
        <li>
          <Link to="/">Home</Link>
        </li>
        <li>
          <Link to="/employee">Employee</Link>
        </li>
        <li>
          <Link to="/Department">Department</Link>
        </li>
      </ul>
      <Routes>
        <Route path='/' Component={Home}></Route>
        <Route path='/employee' Component={Employee}></Route>
        <Route path='/Department' Component={Department}></Route>
        <Route path='*' Component={PageNotFound}></Route>
      </Routes>
    </div>
  )
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
      <MainContent />
    </BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
