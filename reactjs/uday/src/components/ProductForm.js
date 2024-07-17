import { useEffect, useRef, useState } from "react";
import ProductService from "../services/ProductService";

const ProductForm=()=>{
    const [id, setId]=useState();
    const [name, setName]=useState();
    const [price, setPrice]=useState();
    const [idError, setIdError]=useState();
    const [nameError, setNameError]=useState();
    const [priceError, setPriceError]=useState();

    const classname=useRef();

    useEffect(()=>{
     classname.id="form-control";
     classname.name="form-control";
     classname.price="form-control";
    });

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

    function fnUpdate()
    {
        var product={"id":"","name":"","price":""};
        product.id=id;
        product.name=name;
        product.price=price;
        // console.log(product)
        ProductService.fnUpdateProduct(product)
        .then((response)=>{
            console.log("Response is "+response.data)
        })
        .catch((error)=>{
            console.log(error)
        })
    }

    function fnDelete()
    {        
        ProductService.fnDeleteProduct(id)
        .then((response)=>{
            console.log("Response is ")
            console.log(response.data)
        })
        .catch((error)=>{
            console.log(error)
        })
    }

    function fnValidateName()
    {
        var first=name.charAt(0);
        
        if(first<'A' || first>'Z')
        {            
            setNameError("First letter must be capital")
            classname.name="form-control is-invalid"
        }else if(name.length<3)
            {
                setNameError("Name cannot be less than 3 characters")
                classname.name="form-control is-invalid"
            }
    }
    function fnValidateNo(event)
    {
        //for id and price, same rule
        var source=event.target.id;
        var value=event.target.value;       
        console.log(source)
        if(source=="id")
        {
            if(value<=0)
            {
                setIdError("Id is invalid")
                classname.id="form-control is-invalid"
            }else{
                setIdError("")
            }
        }else if(source=="price")
        {            
            if(value<=0)
                {
                    setPriceError("Price is invalid")
                    classname.price="form-control is-invalid"
                }else{
                    setPriceError("")
                }
        }
    }


    return<div>
        
        classname.id:{id}:{name}:{price}<br/>
        Id:<input type="number" id="id" className={ classname.id } onChange={(event)=>{setId(event.target.value)}} onKeyUp={fnValidateNo} />
        { idError && <div className="text-danger">{idError}</div>}
        Name:<input type="text" id="name" className={classname.name} onChange={(event)=>{setName(event.target.value)}} onKeyUp={fnValidateName} />
        {nameError && <div className="text-danger">{nameError}</div>}
        Price:<input type="number" id="price" className={classname.price} onChange={(event)=>{setPrice(event.target.value)}} onKeyUp={fnValidateNo} />
        {priceError && <div className="text-danger">{priceError}</div>}
        <br/>
        <input type="button" value="Add" className="btn btn-success" onClick={fnAdd} />
        <input type="button" value="Update" className="btn btn-warning" onClick={fnUpdate} />
        <input type="button" value="Delete" className="btn btn-danger" onClick={fnDelete} />
        ...
    </div>

}
export default ProductForm;