import { createContext } from 'react';
import './App.css';
import Hello from './components/Hello';
import One from './components/One';
const UserContext=createContext();
function App() {
  return (
    <div className="App">
      <div className='container-fluid p-5 text-white bg-info'>
        <h2>Welcome to HOC demo</h2>
      </div>
      <div className='row'>
        <div className='col-sm-4'>
          <One/>
        </div>
        <div className='col-sm-4'>
          <Hello />
        </div>
        <div className='col-sm-4'>3</div>
      </div>
    </div>
  );
}

export default App;
