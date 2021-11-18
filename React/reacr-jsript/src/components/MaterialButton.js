import * as React from 'react';
import Button from '@mui/material/Button';



const MaterialButton =(props) =>{

    const {bookName}= props
    const [bookStatus,setBookStatus]=React.useState(bookName)
    const changeBook=()=>{
        if(bookStatus=="Reading")
        setBookStatus("Finished")
        else
        setBookStatus("Reading")
    }
    
    return  <Button variant="contained" onClick={changeBook} >{bookStatus}</Button>
}

export default MaterialButton