import { useState } from "react";
import NameContext from "./NameContext";
import Two from "./Two";

const One=()=>{
    const [name, setName]=useState('Krish')
    return <div>
        <NameContext.Provider value={name}>
            <Two/>
        </NameContext.Provider>
    </div>
}
export default One;