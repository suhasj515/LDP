import React, { useEffect } from 'react'
import { Grid } from '@mui/material'
import { makeStyles } from '@mui/styles'
import CardComponent from '/home/suhasj/LDP/React/reacr-jsript/src/components/molecules/CardComponent/CardComponent.js'

const GridCategoryBooks= (props) =>{

    const {category,BookObj,setBookObj}=props
    console.log("cassss",category)

    const styles= makeStyles({
        GridMargins: {
            marginRight: '380px',
            marginLeft: '380px'
        }
    })

    const classes= styles()
    const mapBooks=   
        BookObj.bookList.map((e)=>{
            if(e.category===category)
            {
             return (
                 
              <Grid key={e.titleBook} item xs={4}>
      
              <CardComponent key={e.url} uid={e.titleBook} setBookObj={setBookObj} bookList={e}/>
              </Grid>
           );}
           
          })
    


    return(
        <div className={classes.GridMargins}>
        <Grid container rowSpacing={3}>
        {mapBooks}
        </Grid>
        </div>
    )
}
export default GridCategoryBooks