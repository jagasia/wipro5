import axios from "axios";

class FoodService
{
    URL="http://localhost:5000/food"

    getAllFoods()
    {
        return axios.get(this.URL)
    }
    findFoodById(id)
    {
        return axios.get(this.URL+"/"+id)
    }
    addFood(food)
    {
        return axios.post(this.URL,food);
    }
    updateFood(food)
    {
        return axios.put(this.URL,food);
    }
    delete(id)
    {
        return axios.delete(this.URL+"/"+id)
    }

    getAllCategories()
    {
        return axios.get(this.URL+"/categories");
    }
}
export default new FoodService();