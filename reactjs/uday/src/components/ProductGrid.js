import { useEffect, useState } from "react";
import ProductService from "../services/ProductService";

const ProductGrid=()=>{

    const [products, setProducts]=useState([]);

    //we need a life cycle hook to call that service
    useEffect(()=>{
        //call service here
        ProductService.fnGetAllProducts()
        .then((response)=>{            
            setProducts(response.data);            
        })
        .catch((error)=>{
            console.log(error);
        })
    },[]);
    return <div>        
    <table className="table table-bordered table-striped table-hover">
        <thead>
            <tr>
                <th>Id</th><th>Name</th><th>Price</th>
            </tr>
        </thead>
        <tbody>
            {
                products.map((p)=>
                    <tr>
                        <td>{p.id}</td>
                        <td>{p.name}</td>
                        <td>{p.price}</td>
                    </tr>
                )
            }
        </tbody>
    </table>
    </div>
}
export default ProductGrid;