import Typography from '@mui/material/Typography';
import  React from 'react';
import { makeStyles } from '@mui/styles';



const TypographyText=(props)=>{
    const {children,type}=props
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
          color: 'red'
        },
        Bookcardtitle: {

            textAlign:"left",
            marginBottom: '0.5rem',

            //styleName: beta/subtitle 2;
            fontSize: '18px',
            fontStyle: 'normal',
            fontWeight: '700',
            lineHeight: '24px',
            letterSpacing: '0px'
        },
        Bookcardauthor: {
            fontSize: '16px',
            fontStyle: 'normal',
            fontWeight: '700',
            lineHeight: '24px',
            letterSpacing: '0px',
            textAlign: 'left',
            color:'#6D787E'


        },
        Bookcardtime: {
            textAlign:"left",
            // fontSize: '0.85rem',
            color: '#6D787E',
            marginBottom: '0.5rem',
            // lineHeight: 1.57,

            //styleName: gamma/caption 1;
            fontSize: '14px',
            fontStyle: 'normal',
            fontWeight: '400',
            lineHeight: '24px',
            letterSpacing: '0px',

        }
      });
    
      const classes= styles()
      var time =""
      var bct=null
      if(type==="bookTitle")
      {
       bct=classes.Bookcardtitle
      }else if(type==="bookAuthor")
      {
         bct=classes.Bookcardauthor
      }else if(type==="bookTime")
      {
        time=<svg width="11" height="11" minWidth="200px" viewBox="0 0 14 14" fill="none" xmlns="http://www.w3.org/2000/svg">
        <path d="M7 13.6667C3.318 13.6667 0.333334 10.682 0.333334 7.00004C0.333334 3.31804 3.318 0.333374 7 0.333374C10.682 0.333374 13.6667 3.31804 13.6667 7.00004C13.6667 10.682 10.682 13.6667 7 13.6667ZM7 12.3334C8.41449 12.3334 9.77104 11.7715 10.7712 10.7713C11.7714 9.77108 12.3333 8.41453 12.3333 7.00004C12.3333 5.58555 11.7714 4.229 10.7712 3.2288C9.77104 2.22861 8.41449 1.66671 7 1.66671C5.58551 1.66671 4.22896 2.22861 3.22876 3.2288C2.22857 4.229 1.66667 5.58555 1.66667 7.00004C1.66667 8.41453 2.22857 9.77108 3.22876 10.7713C4.22896 11.7715 5.58551 12.3334 7 12.3334ZM7.66667 7.00004H10.3333V8.33337H6.33333V3.66671H7.66667V7.00004Z" fill="#3A4649"/>
        </svg>
         bct=classes.Bookcardtime
      }
    
    
    return (<Typography  className={bct} data-testid="texttest" >
      {time} {children}
    </Typography>
    )

}
export default TypographyText
