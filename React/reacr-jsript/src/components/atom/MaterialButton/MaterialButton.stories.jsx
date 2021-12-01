import React from 'react';
import MaterialButton from './MaterialButton';

export default {
    title: 'Atoms/MaterialButton',
    component: MaterialButton
  };

  export const MaterialButton1 = (props)=>{
      const obj= {component:"img",
      image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
      alt: "The Grid by Matt Watkinson",
      maxWidth:'200px',
      status:'Reading'

    }
      
      return(
      <MaterialButton bookList={obj}>Button text</MaterialButton>
      )
  }
  