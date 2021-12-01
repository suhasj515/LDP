import React from 'react';
import SwitchTab from './SwitchTab';

export default {
    title: 'organism/SwitchTab',
    component: SwitchTab,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const SwitchTab1 = (props)=>{
    const BookObj2 = {
        bookList: [
            
            
        ]
    }
      
      return(
      <SwitchTab BookObj={BookObj2} />
      )
  }
  