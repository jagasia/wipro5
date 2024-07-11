import './App.css';
import Hello from './components/hello';

function App() {
  return (
    <div className="App">
    <div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First ReactJs App</h1>
  <p>created using visual studio code!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      <h3>Column 1</h3>

    </div>
    <div class="col-sm-4">
      <h3>Column 2</h3>
      <Hello />
    </div>
    <div class="col-sm-4">
      <h3>Column 3</h3>        
      
    </div>
  </div>
</div>  
    </div>
    
  );
}

export default App;
