import { useEffect, useState } from "react";
import FoodService from "../services/FoodService";

const Food = () => {
    const [id, setId] = useState();
    const [name, setName] = useState();
    const [price, setPrice] = useState();
    const [category, setCategory] = useState();
    const [categories, setCategories] = useState([])

    useEffect(() => {
        FoodService.getAllCategories()
            .then((response) => {
                setCategories(response.data)
            })
            .catch((error) => {
                console.log(error)
            })
    }, [])

    function fnAdd()
    {
        var food={            
            "name": "",
            "price": 0,
            "category": ""
        }
        food.name=name;
        food.price=price;
        food.category=category;
        FoodService.addFood(food)
        .then((response)=>{
            console.log(response.data)
            window.location.reload(false)
        })
        .catch((error)=>{
            console.log(error)
        })
    }
    return <div>{category}<br />
        Id:<input type="number" id="id" className="form-control" onChange={(event) => setId(event.target.value)} />
        Name:<input type="text" id="name" className="form-control" onChange={(event) => setName(event.target.value)} />
        Price:<input type="number" id="price" className="form-control" onChange={(event) => setPrice(event.target.value)} />
        Category:<input list="myselect" id="myoptions" className="form-select" onChange={(event) => setCategory(event.target.value)} />
        <datalist id="myselect">
            {
                categories.map((c) => <option>{c}</option>)
            }
        </datalist>
        <br/>
        <input type="button" value="Add" className="btn btn-success" onClick={fnAdd} />&nbsp;
        <input type="button" value="Update" className="btn btn-warning" />&nbsp;
        <input type="button" value="Delete" className="btn btn-danger" />&nbsp;
    </div> 
}

export default Food;