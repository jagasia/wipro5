import { Component } from "react";

class Login extends Component
{
    constructor(props)
    {
        super(props);
        this.state={username:'dummy',password:'dummy',status:''};
        this.fnUpdate=this.fnUpdate.bind(this);
        this.fnLogin=this.fnLogin.bind(this);
    }

    fnLogin()
    {
        if(this.state.username==this.state.password)
        {
            //failed
            this.setState({status:'Login failed'})
        }else{
            //success
            this.setState({status:'Login successful'})
        }
    }

    fnUpdate(event)
    {
        // alert(event.target.name)
        this.setState({[event.target.name]:event.target.value})
    }

    render(){
        return <div>
            Username:<input type="text" name="username" className="form-control" onChange={this.fnUpdate} />
            Password:<input type="password" name="password" className="form-control" onChange={this.fnUpdate} />
            <br/>
            <input type="button" value={'Login'} className="btn btn-info" onClick={this.fnLogin} />
            <br/>
            Username: {this.state.username} <br/>
            Password: {this.state.password} <br/>
            <br/>
            <div>
                {this.state.status}
            </div>
        </div>
    }
}
export default Login;