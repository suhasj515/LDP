import logo from './logo.svg';
import './App.css';
import Comp1 from './components/Comp1';
import FunctionalComp from './components/FunctionalComp';
import ClassComp from './components/ClassComp';
import CardComponent from './components/molecules/CardComponent/CardComponent';
import GridLayoutBooks from './components/organisms/GridLayoutBooks/GridLayoutBooks';
import SwitchTab from './components/organisms/SwitchTab/SwitchTab';
import BottomPart from './components/templets/BottomBooksgrid/BottomPart';
import TypographyText from './components/atom/TypographyText/TypographyText';
import { MyLibraryBanner } from './components/organisms/MyLibraryBanner/MyLibraryBanner';
import AppBarTop from './components/organisms/AppBarTop/AppBarTop';
import { MainComponent } from './components/Page/MainComponent';


function App() {
  return (
    
    <>
      {/* <FunctionalComp/>
      <ClassComp/> */}
      {/* <SwitchTab/> */}
      <MainComponent/>
      {/* <CardComponent/> */}
      {/* <GridLayoutBooks/> */}
    </>
  );
}

export default App;
