import {render,screen} from "@testing-library/react"
import { MyLibraryBanner } from "./MyLibraryBanner"
import React from "react"

test("Testing My library banner",()=>{

    render(<MyLibraryBanner/>)

    expect(screen.getByTestId("mybanner").textContent).toBe("My Library")
})