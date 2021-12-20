import {render,screen} from "@testing-library/react"
import TypographyText from "./TypographyText"
import React from 'react'

test("text test",()=>{

    render(<TypographyText type="bookTitle" >hi</TypographyText>)

    // screen.debug()
    expect(screen.getByTestId("texttest").firstChild.textContent).toBe("")
})