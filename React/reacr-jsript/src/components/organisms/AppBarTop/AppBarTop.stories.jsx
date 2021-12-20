import React from 'react';
import AppBarTop from '/home/suhasj/LDP/React/reacr-jsript/src/components/organisms/AppBarTop/AppBarTop.js';

export default {
    title: 'Organism/AppBarTop',
    component: AppBarTop,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const AppBarTop1 = ()=>{
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
  const [BookObj,setBookObj]=React.useState(BookObj2)
  

  const [open, setOpen] = React.useState(false);
  const handleClickOpen = () => {
    setOpen(true);
    console.log(open,"opennmain")
  };

  const handleClose = () => {
    setOpen(false);
  };
  var btitle=""
  var bauthor=""
  var burl=""
  const bTitle =(e) =>{
      btitle=e.target.value
      console.log(btitle,"titlebok")
    }
  const bAuthor =(e) =>{
      bauthor=e.target.value
      console.log(bauthor,"authorbok")
    }
  const bUrl =(e) =>{
      burl=e.target.value
      console.log(BookObj.bookList)
    }



    const addBook=()=>{
      const extraBook ={
          component:"img",
          width:"100%",
          objectFit:"fill",
          image:burl,
          alt: "Choose Possibility by Sukhinder Singh Cassidy",
          titleBook: btitle,
          authorBook: bauthor,
          timeBook: "16-minute read",
          status: "Reading"
        }
      setBookObj((prevState) =>({
          bookList:[...prevState.bookList,extraBook]
        }))
        setOpen(false)
  }

    
      return(<AppBarTop addBook={addBook} bTitle={bTitle} bAuthor={bAuthor} bUrl={bUrl} handleClickOpen={handleClickOpen} handleClose={handleClose} open={open}/>
      )
  }
  