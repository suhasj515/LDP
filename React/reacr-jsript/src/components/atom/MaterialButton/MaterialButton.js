import * as React from 'react';
import Button from '@mui/material/Button';




const MaterialButton =(props) =>{

    const {bookList,setBookObj,uid}= props
    const [bookStatus,setBookStatus]=React.useState(bookList.status)
    const changeBook=()=>{
        if(bookStatus==="Reading")
        {

        setBookStatus("Finished")
        setBookObj(prevState =>(
             prevState.map(
                el => el.titleBook === uid? { ...el, status: 'Finished' }: el
              )
        ))
        console.log(bookList)
        bookList.status=bookStatus
        }
        
        else{
            setBookObj(prevState =>(
                 prevState.map(
                    el => el.titleBook === uid? { ...el, status: 'Reading' }: el
                  )
            ))
        setBookStatus("Reading")
        bookList.status=bookStatus
        }
    }

    const removeBook =() =>{
      setBookObj(prevState =>(
       prevState.map(
            el => el.titleBook === uid? { ...el, status: '' }: el
          )
        ))

    }
    
   
      
    if(bookList.status=="Reading")
    {
    return ( <Button data-testid="b1" onClick={changeBook} style={{maxHeight: '100px', minWidth:"263px",background: '#0365F2', minHeight: '45px',
    
   top:'8px', color:'white',marginLeft:'-10px'}} >{bookStatus}</Button>)
    }else if(bookList.status=="Finished"){
        return ( 
            <div style={{display:'flex', alignItems:'self-end'}}>
            <Button data-testid="b2" onClick={changeBook} style={{maxHeight: '100px', minWidth:"128px",background: '#0365F2', minHeight: '45px', 
    top:'8px', color:'white',marginLeft:'-10px'}}>Read again</Button>
            <Button data-testid="b1" onClick={removeBook} style={{top:'8px',minHeight: '45px',border: '1px solid #BAC9CF',minWidth:"127px"}}><div style={{marginRight:'56px',marginLeft:'30px'}}>Remove</div></Button>
            </div>
        )
    } else {
      return (<Button data-testid="b1"  onClick={changeBook} style={{maxHeight: '100px', minWidth:"263px",background: '#0365F2', minHeight: '45px',
    
      padding: '0px 0px',top:'7px', color:'white',marginLeft:'-10px'}} >Add to Library</Button>

      )
    }
}

export default MaterialButton

