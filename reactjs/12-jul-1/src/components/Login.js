import { Component } from "react";

class Login extends Component
{
    constructor(props)
    {
        super(props);
        this.state={username:'dummy',password:'dummy',status:'', uvalid:true, pvalid:true};
        this.fnUpdate=this.fnUpdate.bind(this);
        this.fnLogin=this.fnLogin.bind(this);
        this.fnValidate=this.fnValidate.bind(this);
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

    fnValidate()
    {
        // alert('validating')
        //validate data. username must be atleast 3 chars
        if(this.state.username.length<3)
            {
                    this.setState({uvalid:false})
                    // alert('invalid')
            }else
            this.setState({uvalid:true})
    }
    fnUpdate(event)
    {
        
        // alert(event.target.name)
        this.setState({[event.target.name]:event.target.value})
        this.fnValidate();
    }

    render(){
        let class1='form-control';
        if(this.state.uvalid==false)
        {
            class1+=" is-invalid"
        }
        return <div>
            Username:<input type="text" name="username" className={class1} onKeyUp={this.fnUpdate} onBlur={this.fnValidate} onChange={this.fnValidate}  />
            { !this.state.uvalid && <p style={{color:'red'}}>Username is invalid</p>}
            
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