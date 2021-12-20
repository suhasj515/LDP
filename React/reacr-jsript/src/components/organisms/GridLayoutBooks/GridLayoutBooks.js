import { Grid } from '@mui/material'
import CardComponent from '../../molecules/CardComponent/CardComponent'
import React from 'react'

const GridLayoutBooks= (props) =>{

    const {status,BookObj,setBookObj}=props



    const mapBooks=   
        BookObj.map((e)=>{
            if(e.status===status)
            {
             return (
                 
              <Grid key={e.titleBook} item xs={4} data-testid="cardcomponenttest">
      
              <CardComponent  key={e.url} uid={e.titleBook} setBookObj={setBookObj} bookList={e}/>
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