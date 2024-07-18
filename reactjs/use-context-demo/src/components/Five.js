import { useContext } from "react";
import NameContext from "./NameContext";

const Five=()=>{
    const name=useContext(NameContext);
    return <div>
        Hello {name}!
    </div>
}
export default Five;