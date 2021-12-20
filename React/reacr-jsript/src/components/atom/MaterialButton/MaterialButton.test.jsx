
import {render,screen,fireEvent} from "@testing-library/react"
import MaterialButton from "./MaterialButton"
import React from "react"




test("Material Button test", ()=>{
    const bookListd=[{
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
    }]  

    const setBookObj= () =>{

    }

   
    
    render(<MaterialButton bookList={{
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
    }} setBookObj={setBookObj}/>)


    expect(screen.getByTestId('b1').textContent).toBe("Reading")
    // const mockCallBack = jest.fn();
    fireEvent.click(screen.getByTestId('b1'))


    // render(<MaterialButton bookList={{
    //     component:"img",
    //     width:"100%",
    //     objectFit:"fill",
    //     image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
    //     alt: "The Grid by Matt Watkinson",
    //     titleBook: "The Grid",
    //     authorBook: "Matt Watkinson 34",
    //     timeBook: "15-minute read",
    //     status: "Finsihed",
    //     category:"Science"
    // }} />)

    // screen.debug()
    // expect(screen.getAllByTestId('b1').length).toBe(2)
    
})

test("MAterial Button Finished", () =>{

  

    render(<MaterialButton bookList={{
        component:"img",
        width:"100%",
        objectFit:"fill",
        image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
        alt: "The Grid by Matt Watkinson",
        titleBook: "The Grid",
        authorBook: "Matt Watkinson 34",
        timeBook: "15-minute read",
        status: "Finished",
        category:"Science"
    }} />)


    expect(screen.getAllByTestId('b2')).toBe(1)


    render(<MaterialButton bookList={{
        component:"img",
        width:"100%",
        objectFit:"fill",
        image:"https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg",
        alt: "The Grid by Matt Watkinson",
        titleBook: "The Grid",
        authorBook: "Matt Watkinson 34",
        timeBook: "15-minute read",
        status: "",
        category:"Science"
    }} />)


    expect(screen.getAllByTestId('b1').length).toBe(2)

})