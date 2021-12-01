import React from 'react'
import Tab from '@mui/material/Tab';
import ExploreCategories from './ExploreCategories';
import { Button } from '@mui/material';
import { makeStyles } from '@mui/styles'

export const TopBarButtons = (props)=>{
    const {onclickScience,onclickEconomics,onclickPolitics,setExploreB}=props

    const cstyles= makeStyles({
            ButtonCol: {
                color : "black",
                borderBottom: '2px solid white',
                '&:hover': {
                    borderBottom: '2px solid #2CE080'

                 }
            }


    })
    const classes=cstyles()
    
    return(
        <div style={{marginRight:'240px', display:'flex', alignItems:'self-end',marginTop:'8px'}}>
            <ExploreCategories onclickScience={onclickScience} onclickEconomics={onclickEconomics} onclickPolitics={onclickPolitics}/>
            <Button  className={classes.ButtonCol} onClick={()=> setExploreB(false)}>My Library</Button>
            <Button className={classes.ButtonCol}>Highlights</Button>
            {/* <Tab label="My Library"  value="2" style={{marginLeft:'70px'}} />
            <Tab label="Highlights" value="3" /> */}
            <div style={{minWidth:'120px'}}>
              
              </div>
        </div>
    )
}