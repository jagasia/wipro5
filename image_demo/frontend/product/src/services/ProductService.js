import axios from "axios";

class ProductService
{
    URL="http://localhost:5000/v1/api/product";

    getAllProducts()
    {
        return axios.get(this.URL);
    }

    findProductById(id)
    {
        return axios.get(this.URL+"/"+id);
    }

    addProduct(product)
    {
        return axios.post(this.URL,product);
    }

    updateProduct(product)
    {
        return axios.put(this.URL+"/"+product.id,product);
    }

    deleteProduct(id)
    {
        return axios.delete(this.URL+"/"+id);
    }

    getCategories()
    {
        return axios.get(this.URL+"/categories");
    }
}
export default new ProductService();