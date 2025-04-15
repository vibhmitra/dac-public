import React from "react";

function ListGroup() {
	let items = ["New York", "Delhi", "Tokyo", "Vault"];

	//items = [];

	return (
		<React.Fragment>
			<h1>List</h1>
			{/* {items.length === 0 ? <p>No Item Found 🥵</p> : null} one way to do it */}
			{items.length === 0 && <p>No Item Found 😕</p>}
			<ul className="list-group">
				{items.map((item, index) => (
					<li
						class="list-group-item"
						key={item}
						onClick={(event) => console.log(`Clicked ${item}`, index, event)}
					>
						{item}
					</li>
				))}
			</ul>
		</React.Fragment>
	);
}

export default ListGroup;
