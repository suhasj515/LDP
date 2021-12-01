import * as React from 'react';
import Button from '@mui/material/Button';

import { makeStyles } from '@mui/styles';


const MaterialButton =(props) =>{

    const {bookList,setBookObj,key,uid}= props
    const [bookStatus,setBookStatus]=React.useState(bookList.status)
    const changeBook=()=>{
        if(bookStatus==="Reading")
        {

        setBookStatus("Finished")
        setBookObj(prevState =>({
            bookList: prevState.bookList.map(
                el => el.titleBook === uid? { ...el, status: 'Finished' }: el
              )
        }))
        console.log(key)
        bookList.status=bookStatus
        }
        
        else{
            setBookObj(prevState =>({
                bookList: prevState.bookList.map(
                    el => el.titleBook === uid? { ...el, status: 'Reading' }: el
                  )
            }))
        setBookStatus("Reading")
        bookList.status=bookStatus
        }
    }

    const removeBook =() =>{
      setBookObj(prevState =>({
        bookList: prevState.bookList.map(
            el => el.titleBook === uid? { ...el, status: '' }: el
          )
    }))

    }
    const styles = makeStyles({
        Card: {
          width: 300,
          margin: 'auto'
        },
        Media: {
          height: '100%',
          width: '100%'
        },
        Heading: {
            maxHeight: '100px', minWidth:"252px",background: '#0365F2', minHeight: '45px',
    
            padding: '100px 111px',top:'7px', color:'white',textTransform:'capitalize',marginLeft:'-10px'
          
        }
      })
      const classes= styles()
      
    if(bookList.status=="Reading")
    {
    return ( <Button  onClick={changeBook} style={{maxHeight: '100px', minWidth:"263px",background: '#0365F2', minHeight: '45px',
    
   top:'8px', color:'white',marginLeft:'-10px'}} >{bookStatus}</Button>)
    }else if(bookList.status=="Finished"){
        return ( 
            <div style={{display:'flex', alignItems:'self-end'}}>
            <Button onClick={changeBook} style={{maxHeight: '100px', minWidth:"128px",background: '#0365F2', minHeight: '45px', 
    top:'8px', color:'white',marginLeft:'-10px'}}>Read again</Button>
            <Button onClick={removeBook} style={{top:'8px',minHeight: '45px',border: '1px solid #BAC9CF',minWidth:"127px"}}><div style={{marginRight:'56px',marginLeft:'30px'}}>Remove</div></Button>
            </div>
        )
    } else {
      return (<Button  onClick={changeBook} style={{maxHeight: '100px', minWidth:"263px",background: '#0365F2', minHeight: '45px',
    
      padding: '0px 0px',top:'7px', color:'white',marginLeft:'-10px'}} >Add to Library</Button>

      )
    }
}

export default MaterialButton

