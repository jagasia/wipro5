import { useState } from "react";

function Mathematics()
{
    const [no1, setNo1]=useState(0);
    const [no2, setNo2]=useState(0);
    const [sum, setSum]=useState(0);

    function fnAdd()
    {
        var total=parseInt(no1)+parseInt(no2);
        setSum(total);
    }

    function fnUpdate(event)
    {
        var source=event.target.id;
        switch(source)
        {
            case "no1":
                setNo1(event.target.value);
                break;
            case "no2":
                setNo2(event.target.value);
                break;
        }
        console.log("Now the state is:");
        console.log(no1);
        console.log(no2);
    }
    return <div>
        {no1}:{no2}<br/>
        Sum={sum}<br/>
        Number 1:<input type="number" id="no1" className="form-control" onChange={fnUpdate} />
        Number 2:<input type="number" id="no2" className="form-control" onChange={fnUpdate} /><br/>
        <input type="button" value="Add" className="btn btn-info" onClick={fnAdd} />
    </div>
}
export default Mathematics;