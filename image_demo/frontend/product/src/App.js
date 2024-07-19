import './App.css';
import ProductForm from './components/ProductForm';
import ProductGrid from './components/ProductGrid';

function App() {
  return (
    <div className="App">
      <div className='p-5 bg-info text-white text-center'>
        <h2>Product Image Demo</h2>
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
