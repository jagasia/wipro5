import { useEffect, useState } from "react";
import ProductService from "../services/ProductService";

const ProductForm=()=>{
    const [product, setProduct]=useState({});
    const [categories,setCategories]=useState([]);
    const [id, setId]=useState();
    const [name,setName]=useState();
    const [price, setPrice]=useState();
    const [category, setCategory]=useState();
    const [picture, setPicture]=useState();

    useEffect(()=>{
        ProductService.getCategories()
        .then((response)=>{
            setCategories(response.data);
        })
        .catch((error)=>{
            console.log(error)
        })
    },[]);

    function fnAdd()
    {        
        product.id=id;
        product.name=name;
        product.price=price;
        product.category=category;   
        product.picture=picture;
        console.log(picture)
        ProductService.addProduct(product)
        .then((response)=>{
            console.log(response.data)
            window.location.reload(false);
        })
        .catch((error)=>{
            console.log(error)
        })       
    }
    function fnUpdate()
    {        
        product.id=id;
        product.name=name;
        product.price=price;
        product.category=category;   
        product.picture=picture;
        console.log(picture)
        ProductService.updateProduct(product)
        .then((response)=>{
            console.log(response.data)
            window.location.reload(false);
        })
        .catch((error)=>{
            console.log(error)
        })
    }
    function fnDelete()
    {        
        ProductService.deleteProduct(id)
        .then((response)=>{
            console.log(response.data)
            window.location.reload(false);
        })
        .catch((error)=>{
            console.log(error)
        })
    }

    function readFileDataAsBase64(e) {
        const file = e.target.files[0];
    
        return new Promise((resolve, reject) => {
            const reader = new FileReader();
    
            reader.onload = (event) => {
                resolve(event.target.result);
            };
    
            reader.onerror = (err) => {
                reject(err);
            };
    
            reader.readAsDataURL(file);
        });
    }
    function onFileChange(event)
    {
        readFileDataAsBase64(event).then((data)=>{
            setPicture(data);
        })
    }

    return <div>
        <br/>
        Id:<input type="number" id="id" className="form-control" onChange={(event)=>setId(event.target.value)} />
        Name:<input type="text" id="name" className="form-control" onChange={(event)=>setName(event.target.value)} />
        Price:<input type="number" id="price" className="form-control" onChange={(event)=>setPrice(event.target.value)} />
        Category:<input list="myselect" id="category" className="form-select" onChange={(event) => setCategory(event.target.value)} />
        <datalist id="myselect">
            {
                categories.map((c) => <option>{c}</option>)
            }
        </datalist>
        Picture:<input type="file" id="picture" className="form-control" onChange={onFileChange} />
        <br/>
        <input type="button" className="btn btn-success" defaultValue="Add" onClick={fnAdd} />&nbsp;
        <input type="button" className="btn btn-warning" defaultValue="Update" onClick={fnUpdate} />&nbsp;
        <input type="button" className="btn btn-danger" defaultValue="Delete" onClick={fnDelete} />
        <br/>
        <img src={picture} width="100" />
        
    </div>
}
export default ProductForm;