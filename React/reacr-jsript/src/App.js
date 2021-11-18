import logo from './logo.svg';
import './App.css';
import Comp1 from './components/Comp1';
import FunctionalComp from './components/FunctionalComp';
import ClassComp from './components/ClassComp';
import MaterialButton from './components/MaterialButton';
import CardComponent from './components/CardComponent';

function App() {
  return (
    
    <div className="App">
      <FunctionalComp/>
      <ClassComp/>
      <MaterialButton/>
      <CardComponent/>
    </div>
  );
}

export default App;
