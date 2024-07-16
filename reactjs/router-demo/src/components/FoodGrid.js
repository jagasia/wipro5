import { useEffect, useState } from "react";
import FoodService from "../services/FoodService";

const FoodGrid=()=>
{
    const [foods, setFoods]=useState([]);
    useEffect(()=>{
        FoodService.getAllFoods()
        .then((response)=>{
            setFoods(response.data);
        })
        .catch((error)=>{
            console.log(error)
        })
    },[])
    return <div>
        <table className="table table-bordered table-striped table-hover">
            <thead>
                <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Category</th>                    
                </tr>
            </thead>
            <tbody>
                {
                    foods.map((f)=><tr>
                        <td>{f.id}</td>
                        <td>{f.name}</td>
                        <td>{f.price}</td>
                        <td>{f.category}</td>
                        
                    </tr>)
                }
            </tbody>
        </table>
    </div>
}
export default FoodGrid;