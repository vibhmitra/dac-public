import React, { Component } from "react";

/**  export default class Navbar extends Component {        // this is also valid
        render() {
            return (
                <>                  // this is also valid
                </>
            );
        }
 }


 export default Navbar; // ehre we need to add these -> {} when import
 export {Navbar};   // now we dont need to use these -> {} to import

 */

class Navbar extends Component {
    render() {
        return (
            <React.Fragment>
                <nav className="navbar navbar-expand-lg navbar-light bg-light">
                    <div className="container-fluid">
                        <a className="navbar-brand" href="/">Navbar</a>
                        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>
                        <div className="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul className="navbar-nav me-auto mb-2 mb-lg-0">

                                <li className="nav-item">
                                    <a className="nav-link active" aria-current="page" href="/">Home</a>
                                </li>

                                <li className="nav-item">
                                    <a className="nav-link" href="/">About</a>
                                </li>

                                <li className="nav-item dropdown">
                                    <a className="nav-link dropdown-toggle" href="/" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                        Dropdown
                                    </a>
                                    <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <li><a className="dropdown-item" href="/">Action</a></li>
                                        <li><a className="dropdown-item" href="/">Another action</a></li>
                                        <li><a className="dropdown-item" href="/">Something else here</a></li>
                                    </ul>
                                </li>

                            </ul>
                        </div>
                    </div>
                </nav>
            </React.Fragment>
        );
    }
}

export default Navbar;
