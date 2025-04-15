import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import { useFormik } from 'formik';

const ValidateEmployee = (empData) => {
  const errors = {};
  if (!empData.Id) {
    errors.Id = "Please Enter Employee ID";
  } else if (empData.Id.length > 6) {
    errors.Id = 'Employee ID Cannot Exceeds More than 6 Digits';
  } else if (!/[0-9]$/.test(empData.Id)) {
    errors.Id = "Employee ID Must Be A Number";
  }

  if (!empData.Name) {
    errors.Name = 'Please Enter the Name';
  } else if (empData.Name.length > 25) {
    errors.Name = "Name is Pretty Big!";
  }

  return (errors);
}


const EmployeeComponent = () => {
  const formik = useFormik({
    initialValues: {
      Id: '',
      Name: '',
    },
    validate: ValidateEmployee,
    onSubmit: (values) => {
      alert(JSON.stringify(values));
    }
  });

  return (
    <div>
      <h2>
        EmployeeForm
      </h2>
      <form onSubmit={formik.handleSubmit}>
        {/* for employee id */}
        <p>
          <label htmlFor='Id'>Employee ID : </label>
          <input type='text' name='Id' id='Id' value={formik.values.Id} onChange={formik.handleChange} onBlur={formik.handleBlur}></input>

          {formik.touched.Id && formik.errors.Id ? (
            <span style={{ color: "red" }}>{formik.errors.Id}</span>
          ) : null}
        </p>

        {/* for employee name */}
        <p>
          <label htmlFor='name'>Employee Name : </label>
          <input type='text' name='Name' id='Name' value={formik.values.Name} onChange={formik.handleChange} onBlur={formik.handleBlur}></input>

          {formik.touched.Name && formik.errors.Name ? (
            <span style={{ color: "red" }}>{formik.errors.Name}</span>
          ) : null}
        </p>

        {/* button */}
        <button type='submit'>Submit</button>
      </form>
    </div>
  );
}

const element = <EmployeeComponent />

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  element
);