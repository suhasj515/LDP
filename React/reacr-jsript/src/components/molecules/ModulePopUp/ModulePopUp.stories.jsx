
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

        const obj={
            component:"img",
            width:"100%",
            objectFit:"fill",
            image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
            alt: "The Grid by Matt Watkinson",
            titleBook: "The Grid",
            authorBook: "Matt Watkinson 34",
            timeBook: "15-minute read",
            status: "Reading"
        }
    
      return(<ModulePopUp  open="true"/>
      )
  }
  