import React from 'react';
import BottomPart from '/home/suhasj/LDP/React/reacr-jsript/src/components/templets/BottomBooksgrid/BottomPart.js';

export default {
    title: 'Template/BottomBooksGrid',
    component: BottomPart,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const BottomBooksGrid = ()=>{
    const BookObj2 = {
        bookList: [
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
                alt: "The Grid by Matt Watkinson",
                titleBook: "The Grid",
                authorBook: "Matt Watkinson 34",
                timeBook: "15-minute read",
                status: "Reading"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/5f201b9f6cee07000751e9c2/1_1/470.jpg",
                alt: "Social Empathy by Elizabeth Segal",
                titleBook: "Social Empathy",
                authorBook: "Elizabeth Segal",
                timeBook: "15-minute read",
                status: "Finished"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/61446c476cee070007e05181/1_1/470.jpg",
                alt: "Rogue Waves by Jonathan Brill",
                titleBook: "Rogue Waves",
                authorBook: "Jonathan Brill",
                timeBook: "15-minute read",
                status: "Reading"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/58506baa3e967900044cb0cc/1_1/470.jpg",
                alt: "Daniel J. Siegel & Tina...",
                titleBook: "The Whole-Brain Child",
                authorBook: "Daniel J. Siegel & Tina...",
                timeBook: "15-minute read",
                status: "Reading"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/616814026cee0700089d6a92/1_1/470.jpg",
                alt: "Tom Eisenmann",
                titleBook: "Why Startups Fail",
                authorBook: "Tom Eisenmann",
                timeBook: "15-minute read",
                status: "Reading"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/616e8b316cee0700076e6ce9/1_1/470.jpg",
                alt: "Vivek Ramaswamy",
                titleBook: "Woke, Inc.",
                authorBook: "Vivek Ramaswamy",
                timeBook: "15-minute read",
                status: "Reading"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/55914c9030383300070a0000/1_1/470.jpg",
                alt: "Kelly Leonard & Tom Yorton",
                titleBook: "Yes, And",
                authorBook: "Kelly Leonard & Tom Yorton",
                timeBook: "15-minute read",
                status: "Finished"
            }
            
        ]
    }
      return(<BottomPart BookObj={BookObj2} />
      )
  }
  