import React, { useEffect } from 'react'
import { Grid } from '@mui/material'
import { makeStyles } from '@mui/styles'
import CardComponent from '../../molecules/CardComponent/CardComponent'

const GridLayoutBooks= (props) =>{

    const {status,BookObj,setBookObj}=props

    const mapBooks=   
        BookObj.bookList.map((e)=>{
            if(e.status===status)
            {
             return (
                 
              <Grid key={e.titleBook} item xs={4}>
      
              <CardComponent key={e.url} uid={e.titleBook} setBookObj={setBookObj} bookList={e}/>
              </Grid>
           );}
           
          })
    


    return(
      
        <Grid container rowSpacing={5}>
  {mapBooks}
</Grid>
    )
}
export default GridLayoutBooks