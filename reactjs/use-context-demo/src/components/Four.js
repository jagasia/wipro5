import { useContext } from "react";
import Five from "./Five";
import NameContext from "./NameContext";

const Four=()=>{
    const nm=useContext(NameContext)
    return <div>
        in Four: it is {nm}
        <Five/>
    </div>
}
export default Four;