import axios from "axios";
class ProductService {
    URL = 'http://localhost:4000/products'

    fnGetAllProducts() {
        return axios.get(this.URL);
    }


    fnAddProduct(product) {
        return axios.post(this.URL, product);
    }

    fnUpdateProduct(product)
    {
        return axios.put(this.URL+"/"+product.id,product);
    }

    fnDeleteProduct(id)
    {
        return axios.delete(this.URL+"/"+id);
    }
}


//this is not a component. Note "new" and ()
export default new ProductService();