import './App.css';
import Login from './components/Login';
import Mathematics from './components/Mathematics';
import ProductGrid from './components/ProductGrid';

function App() {
  return (
    <div className="App">
<div className="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div className="container mt-5">
  <div className="row">
    <div className="col-sm-2">
    </div>
    <div className="col-sm-8">
      <ProductGrid/>
    </div>
    <div className="col-sm-2">
    </div>
  </div>
  <hr/>
  <div className="row">
    <div className="col-sm-4">
      <h3>Column 1</h3>

    </div>
    <div className="col-sm-4">
      <h3>Column 2</h3>
        <Mathematics/>
    </div>
    <div className="col-sm-4">
      <h3>Column 3</h3>        
      <Login/>
    </div>
  </div>
</div>
    </div>
  );
}

export default App;
