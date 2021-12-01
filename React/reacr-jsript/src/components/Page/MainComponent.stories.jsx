import React from 'react';
import { MainComponent } from './MainComponent';

export default {
    title: 'Page/MainComponent',
    component: MainComponent,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const MainComponent1 = (props)=>{
      return(
      <MainComponent />
      )
  }
  