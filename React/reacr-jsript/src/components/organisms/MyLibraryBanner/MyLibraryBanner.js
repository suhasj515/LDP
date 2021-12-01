import React from 'react'
import { Typography } from '@mui/material'
import { makeStyles } from '@mui/styles'

export const MyLibraryBanner= () =>{

    const styles= makeStyles({
        GridMargins: {
            marginRight: '400px',
            marginLeft: '380px'
        },
        BannerText:{
            fontSize: '2.25rem',
            fontFamily:"-apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Oxygen','Ubuntu', 'Cantarell', 'Fira Sans', 'Droid Sans', 'Helvetica Neue',sans-serif",
            fontWeight: 800,
            padding: '3.125rem 0 4.5rem',
            textAlign:'Left',
            lineHeight: '2.8125rem',
            color: '#03314B',
            marginBottom: '2'
        }
    })
    const classes=styles()
    return(
        <div className={classes.GridMargins}>
        <Typography style={{fontSize: '2.25rem',
      fontFamily:"-apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Oxygen','Ubuntu', 'Cantarell', 'Fira Sans', 'Droid Sans', 'Helvetica Neue',sans-serif",
      fontWeight: 800,
      padding: '3.125rem 0 5.5rem',
      textAlign:'Left',
      lineHeight: '2.8125rem',
      color: '#03314B',
      marginBottom: '0'}} >My Library</Typography>
    </div>
    )
}