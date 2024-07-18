import { useFormik } from "formik";
import * as Yup from 'yup';

const Product=()=>{
    const formik=useFormik({
        initialValues:{id:0,name:'',price:0},
        validationSchema:Yup.object({
            id:Yup.string().required("Id is mandatory"),
            name:Yup.string().required("Name is mandatory"),
            price:Yup.string().required("Price is mandatory")
        })
    },

    );
return <div>
<form onSubmit={formik.handleSubmit}>
Id:<input type="text" id="id" className={`form-control ${formik.errors.id && "is-invalid"}`} onChange={formik.handleChange} value={formik.values.id} />
{   formik.errors.id && <p className="text-danger">{formik.errors.id}</p> }
Name:<input type="text" id="name" className={`form-control ${formik.errors.name && "is-invalid"}`} onChange={formik.handleChange} value={formik.values.name}  />
{   formik.errors.name && <p className="text-danger">{formik.errors.name}</p> }
Price:<input type="text" id="price" className={`form-control ${formik.errors.price && "is-invalid"}`} onChange={formik.handleChange} value={formik.values.price}  />
{   formik.errors.price && <p className="text-danger">{formik.errors.price}</p> }
<br/>
<input type="submit" value="Submit" className="btn btn-info"  />
</form>
</div>
}
export default Product;