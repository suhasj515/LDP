import React from 'react';
import CardImage from './CardImage';

export default {
    title: 'Atoms/CardMedia',
    component: Image,
    // More on argTypes: https://storybook.js.org/docs/react/api/argtypes
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const CardMedia = (props)=>{
      const obj= {component:"img",
      image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
      alt: "The Grid by Matt Watkinson",
      maxWidth:'200px'
    }
      
      return(
      <CardImage bookList={obj} styles={{maxWidth:'200px'}} />
      )
  }
  