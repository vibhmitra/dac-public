import React from 'react';
// import ReactDOM from 'react-dom/client';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

import Navbar from './navbar';  // imported from navbar.js



const Employee = (data) => {
  return (
    <div>
      <p>Name: {data.Name}</p>
      <p>Salary: {data.Salary}</p>
      <Department dept={data.dept} />
    </div>
  );
}

const Department = (departInfo) => {
  return (
    <div>
      <p>Department: {departInfo.dept}</p>
    </div>
  );
}

const element = <Employee Name="Zack" Salary="121298" dept="CandleFarming" />



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  // <React.StrictMode>
  //   <Navbar />
  //   <App />
  // </React.StrictMode>
  element
);

// ReactDOM.render(
//   <h1 className='h1tag'>Welcome to ReactJS</h1>, document.getElementById('root')
// )


reportWebVitals();
