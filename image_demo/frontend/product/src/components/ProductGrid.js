import { useEffect, useState } from "react";
import ProductService from "../services/ProductService";

const ProductGrid=()=>{
    const [products, setProducts]=useState([]);

    useEffect(()=>{
        ProductService.getAllProducts()
        .then((response)=>{
            setProducts(response.data)
        })
        .catch()
    },[]);

    return<div>
        <table className="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Category</th>
                    <th>Picture</th>
                </tr>
            </thead>
            <tbody>
                {
                    products.map((p)=><tr>
                        <td>{p.id}</td>
                        <td>{p.name}</td>
                        <td>{p.price}</td>
                        <td>{p.category}</td>
                        <td>
                            <img src={p.picture} width="60" height="60" />
                        </td>
                    </tr>)
                }
            </tbody>
        </table>
    </div>
}
export default ProductGrid;