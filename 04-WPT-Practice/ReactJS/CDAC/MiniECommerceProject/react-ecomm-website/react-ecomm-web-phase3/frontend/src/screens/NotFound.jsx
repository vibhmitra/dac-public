import React from "react";
import { Link } from 'react-router-dom';

const NotFound = () => {
    return (
        <React.Fragment>
            <div className="text-center">
                <h1 className='text-black'>💩 404 💩</h1>
                <h1>😒 Sorry! Page Not Found 🍕</h1>
                <Link className='btn btn-light my-2' to='/'>Go Back</Link>
            </div>
        </React.Fragment>
    );
}

export default NotFound;