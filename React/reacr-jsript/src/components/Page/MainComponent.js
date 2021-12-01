import React from "react";
import { MyLibraryBanner } from '../organisms/MyLibraryBanner/MyLibraryBanner.js';
import AppBarTop from '../organisms/AppBarTop/AppBarTop.js';
import BottomPart from '../templets/BottomBooksgrid/BottomPart.js';
import {Route,Link,Routes} from "react-router-dom";
import GridCategoryBooks from "../organisms/GridCategoryBook.js";


export const MainComponent =() =>{

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
                status: "Reading",
                category:"Science"
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
                status: "Finished",
                category: "Politics"
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
                status: "Reading",
                category : "Science"
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
                status: "Reading",
                category:"Politics"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/616814026cee0700089d6a92/1_1/470.jpg",
                alt: "Why Startups Fail by Tom Eisenmann",
                titleBook: "Why Startups Fail",
                authorBook: "Tom Eisenmann",
                timeBook: "15-minute read",
                status: "Reading",
                category: "Politics"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/616e8b316cee0700076e6ce9/1_1/470.jpg",
                alt: "Woke, Inc. by Vivek Ramaswamy",
                titleBook: "Woke, Inc.",
                authorBook: "Vivek Ramaswamy",
                timeBook: "15-minute read",
                status: "Reading",
                category: "Politics"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/55914c9030383300070a0000/1_1/470.jpg",
                alt: "Yes, And by Kelly Leonard & Tom Yorton",
                titleBook: "Yes, And",
                authorBook: "Kelly Leonard & Tom Yorton",
                timeBook: "15-minute read",
                status: "Finished",
                category: "Politics"
            },
            {
                component:"img",
                width:"100%",
                objectFit:"fill",
                image:"https://images.blinkist.io/images/books/615efca06cee070007bf9a43/1_1/470.jpg",
                alt: "The Raging 2020s by Alec Ross",
                titleBook: "The Raging 2020s",
                authorBook: "Alec Ross",
                timeBook: "15-minute read",
                status: "",
                category: "Economics"
            }
            
        ]
    }
    const [BookObj,setBookObj]=React.useState(BookObj2)
    const[ExploreB,setExploreB]=React.useState(false)
    const[Category,setCategory]=React.useState("")
    

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
    var bcategory=""
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
        console.log(burl,"urlbok")
      }
      const bCategory =(e) =>{
        bcategory=e.target.value
      }  



      const addBook=()=>{
        const extraBook ={
            component:"img",
            width:"100%",
            objectFit:"fill",
            image:burl,
            alt: btitle+" by "+bauthor,
            titleBook: btitle,
            authorBook: bauthor,
            timeBook: "16-minute read",
            status: "Reading",
            category: bcategory
          }
        setBookObj((prevState) =>({
            bookList:[...prevState.bookList,extraBook]
          }))
          setOpen(false)
    }

    const onclickScience =()=>{

        setExploreB(!ExploreB)
        setCategory("Science")

    }

    const onclickEconomics =()=>{

        setExploreB(!ExploreB)
        setCategory("Economics")

    }
    const onclickPolitics =()=>{

        setExploreB(!ExploreB)
        setCategory("Politics")

    }
    

    return(
        <>
        
        <AppBarTop addBook={addBook} bTitle={bTitle} bAuthor={bAuthor} bCategory={bCategory} bUrl={bUrl} handleClickOpen={handleClickOpen} handleClose={handleClose} BookObj={BookObj} setBookObj={setBookObj} BookObj2={BookObj2} open={open} onclickScience={onclickScience} onclickEconomics={onclickEconomics} onclickPolitics={onclickPolitics} setExploreB={setExploreB}/>
        <div>
        {
            ExploreB ? <GridCategoryBooks category={Category} BookObj={BookObj} setBookObj={setBookObj} />: <><MyLibraryBanner/>
            <BottomPart BookObj={BookObj} setBookObj={setBookObj} onclix="a"/> </>
        }
        </div>

        </>
    )
}