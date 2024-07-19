import { useEffect } from 'react';
import './App.css';
import ProductForm from './components/ProductForm';
import ProductGrid from './components/ProductGrid';

function App() {  
  var x=20;
  useEffect(()=>{
    

  });
  return (
    <div className="App">
      <div className='p-5 bg-info text-white text-center'>
        <h2>Product Image Demo</h2>
        <h3>You are accessing this portal from</h3>
        <h4>{
          x
          }</h4>
      </div>
      <div className='row'>
        <div className='col-sm-4'>1</div>
        <div className='col-sm-4'>
          <ProductForm/>
        </div>
        <div className='col-sm-4'>3</div>
      </div>
      <hr/>
      <div className='row'>
        <div className='col-sm-2'>1</div>
        <div className='col-sm-8'>
          <ProductGrid/>
        </div>
        <div className='col-sm-2'>3</div>
      </div>
    </div>
  );
}

export default App;
