import {render,screen,waitFor} from "@testing-library/react"
import React from 'react'
import { MainComponent } from "./MainComponent"
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import { Provider } from "react-redux"


test("Main Component Test",()=>{

    render(<MainComponent/>)

     screen.debug()


     
    expect(screen.getByTestId("loading").textContent).toBe("loading....")

//     function pausecomp(millis)
// {
//     var date = new Date();
//     var curDate = null;
//     do { curDate = new Date(); }
//     while(curDate-date < millis);
// }

//     act(() =>{
//         pausecomp(5000)
//         render(<MainComponent/>)
//     })
//     expect(screen.getByTestId("loaded").textContent).toBe("loading....")


})

test("wait for element", async ()=> {
    render(<Router>
        <Routes> 
         <Route path='/' component={MainComponent} />
         </Routes>
        </Router>)
    // render(<MainComponent/>)

    // await screen.findByText('My Library')
    screen.debug()
     expect(await screen.findByText('My Library')).toBeVisible()


    // const mainElement= await  waitFor(()=> screen.getByTestId('loaded'))
    // console.log(mainElement)
    // expect(mainElement).toBeVisible()

})