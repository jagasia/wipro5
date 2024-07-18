import { Component } from "react";

const HocBlue = (OriginalComponent) => { 
    class NewComponent extends Component{ 
  
        // Logic here 
  
        render() { 
            // Pass the callable props to Original component 
            return <OriginalComponent name="enclosed by HOc" color="blue"  />  
        } 
    } 
    // Returns the new component 
    return NewComponent 
} 
  
export default HocBlue;