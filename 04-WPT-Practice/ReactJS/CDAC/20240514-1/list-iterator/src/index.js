import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';


const Employee = [
  { Id: 101, name: "Asuna", Location: "New Delhi", Salary: 34343 },
  { Id: 102, name: "Zen", Location: "New York", Salary: 34343 },
  { Id: 103, name: "Kurisu", Location: "London", Salary: 2343 }
];


/**
 * Props is READ ONLY |
 */
function EmployeePrint(props) {
  return (
    <div style={{ border: "2px solid red" }}>
      <p>Employee ID: <b>{props.data.Id}</b> </p>
      <p>Employee Name: <b>{props.data.name}</b> </p>
      <p>Location: <b>{props.data.Location}</b> </p>
      <p>Salary: <b>{props.data.Salary}</b> </p>
    </div>
  );
}

function DisplayEmployeeDetails(props) {
  const list = props.employeeList;    // just declaring a list here  | we will provide data later
  const listElements = list.map((emp) => <EmployeePrint key={emp} data={emp} />);

  return (
    <div>
      {listElements}
    </div>
  );
}


// just calling the DisplayEmployeeDetails
const element = <DisplayEmployeeDetails employeeList={Employee} />


const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <div>
    <DisplayEmployeeDetails employeeList={Employee} />
  </div>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
