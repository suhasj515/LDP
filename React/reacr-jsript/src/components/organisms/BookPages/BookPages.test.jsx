
import {render,screen} from "@testing-library/react"
import React from "react"
import BookPages from "./BookPages"



test("book page items test", ()=>{
    render(<BookPages/>)

    screen.debug()

    expect(screen.getByTestId("bookpage").title).toBe("")

    
})