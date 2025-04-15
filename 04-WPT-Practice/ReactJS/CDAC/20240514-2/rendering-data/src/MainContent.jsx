import React from "react";

class MainContent extends React.Component {
    state = {
        pageTitle: "Customers",
        customerCount: 10,
        customers: [
            { id: 1, name: "Johnson", phone: "+1 202-918-2132", address: { city: "Australia" }, photo: "https://picsum.photos/id/177/80/80" },
            { id: 2, name: "Emma", phone: "+1 206-660-6674", address: { city: "Neverland" }, photo: "https://picsum.photos/id/64/80/80" },
            { id: 3, name: "Evie", phone: "", address: { city: "New york" }, photo: "https://picsum.photos/id/325/80/80" },
        ]
    }

    render() {
        return (
            <div>
                <h4 className="border-bottom m-2, p-2">
                    {this.state.pageTitle}
                    <span className="badge bg-warning text-primary" >
                        {this.state.customerCount}
                    </span>
                    <button className="btn btn-info" onClick={this.onChangeContent}>Change</button>
                </h4>
                <div className="p-4 d-flex">
                <table className="table table-striped table-responsive w-auto mw-700 table-bordered align-middle" >
                    <thead>
                        <tr>
                            <th>ID No.</th>
                            <th>Photo</th>
                            <th>Name</th>
                            <th>Phone Number</th>
                            <th>City</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.customers.map((cust) => {
                                return (
                                    <tr>
                                        <td>{cust.id}</td>
                                        <td><img src={cust.photo} alt="Image" /></td>
                                        <td>{cust.name}</td>
                                        <td>
                                            {cust.phone ? (cust.phone) : (<div className="bg-warning p-1 text-center">Not Available</div>)}
                                        </td>
                                        <td>{cust.address.city}</td>
                                    </tr>
                                )
                            })
                        }
                    </tbody>
                </table> 
                </div>
            </div >


        )
    }


    onChangeContent = () => {
        this.setState({
            customerCount: 40,
        })
    }

}


export default MainContent;