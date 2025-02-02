import { useState } from "react";
import NameContext from './NameContext';
import Two from "./Two";

const One=()=>{
    const [name, setName]=useState('Suresh');
    
    return <div>
        <NameContext.Provider value={name}>
            in one, it is {name}
        <Two/>
        </NameContext.Provider>
        
    </div>
}
export default One;