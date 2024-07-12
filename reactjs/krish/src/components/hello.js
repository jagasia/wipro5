const { Component } = require("react");

class Hello extends Component
{
    constructor(props)
    {
        super(props);
        console.log(props);
    }
    render(){
        return <div>
            {2 * 5}            
            <p style={this.props}>Hello world....</p>
            <input type={'text'} />
        </div>
    }
}
export default Hello;