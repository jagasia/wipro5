import { useContext } from "react";
import NameContext from './NameContext';
const Five=()=>
{
    
    const ctx = useContext(NameContext);
    return <div>
        Hi this is {ctx}!
    </div>
}
export default Five;