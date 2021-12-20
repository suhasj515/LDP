
import React from 'react';
import ModulePopUp from './ModulePopUp';


export default {
    title: 'Molecules/ModulePopUp',
    component: ModulePopUp,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const ModulePopUp1 = ()=>{


    
      return(<ModulePopUp  open="true"/>
      )
  }
  