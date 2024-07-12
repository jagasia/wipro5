import './App.css';
import About from './components/about';
import Hello from './components/hello';
import Hi from './components/Hi';
import Login from './components/login';

function App() {
  return (
    <div className="App">
    <div className="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First ReactJs App</h1>
  <p>created using visual studio code!</p> 
</div>
  
<div className="container mt-5">
  <div className="row">
    <div className="col-sm-4">
      <h3>Column 1</h3>
    <About />
    </div>
    <div className="col-sm-4">
      <h3>Column 2</h3>
      <Hello backgroundColor="yellow" color="blue" /><br/>
      <Login/>
    </div>
    <div className="col-sm-4">
      <h3>Column 3</h3>        
      <Hi/>
    </div>
  </div>
</div>  
    </div>
    
  );
}

export default App;
