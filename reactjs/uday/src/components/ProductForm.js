import { useState } from "react";
import ProductService from "../services/ProductService";

const ProductForm=()=>{
    const [id, setId]=useState();
    const [name, setName]=useState();
    const [price, setPrice]=useState();

    function fnAdd()
    {
        //call the method of ProductService now
        var product={"id":"","name":"","price":""};
        product.id=id;
        product.name=name;
        product.price=price;
        // console.log("........................")
        // console.log(product);
        // alert(JSON.stringify(product))
        ProductService.fnAddProduct(product)
        .then((response)=>{
            console.log(response.data)
            window.location.reload(false)
        })
        .catch((error)=>{
            console.log(error)
        })
    }

    return <div>
        {id}:{name}:{price}<br/>
        Id:<input type="number" id="id" className="form-control" onChange={(event)=>{setId(event.target.value)}} />
        Name:<input type="text" id="name" className="form-control" onChange={(event)=>{setName(event.target.value)}} />
        Price:<input type="number" id="price" className="form-control" onChange={(event)=>{setPrice(event.target.value)}} />
        <br/>
        <input type="button" value="Add" className="btn btn-success" onClick={fnAdd} />
    </div>
}
export default ProductForm;