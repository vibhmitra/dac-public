import React from 'react';
// import Product from '';

const ProductList = () => {
    const products = [
        { name: "Sony Camera", price: "33.33" },
        { name: "Headphones", price: "13.32" },
        { name: "LOL", price: "55.32" }
    ];

    return (
        <div>
            {products.map((key, index) => (
                <div key={index}>
                    <h2>Index: {index}</h2>
                    <h3>Name: {key.name}</h3>
                    <h6>Price: {key.price}</h6>
                </div>
            ))}
        </div>
    );
}

export default ProductList;
