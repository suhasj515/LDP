import * as React from 'react';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import MaterialButton from '../../atom/MaterialButton/MaterialButton.js';
import styles from '/home/suhasj/LDP/React/reacr-jsript/src/components/CardComponentCss.module.css';
import TypographyText from '../../atom/TypographyText/TypographyText.js';
import CardImage from '../../atom/CardImage/CardImage';
const CardComponent =(props) =>{

  const {bookList,setBookObj,key,uid}=props

console.log(uid,"fadd")

    return(
        <Card sx={{minWidth: 260, width: 9, boxShadow:0}} >
        <CardImage 
          bookList={bookList}
        />
        <div style={{border: '1px solid #BAC9CF',boxSizing: 'borderBox',borderRadius: '0px 0px 4px 4px'}}>
        <CardContent style={{minHeight:"100px"}}>
          
          <TypographyText type="bookTitle">
            {bookList.titleBook}</TypographyText>
          
          <TypographyText type="bookAuthor">
          {bookList.authorBook}
          </TypographyText>
          <TypographyText type="bookTime">   
          {bookList.timeBook}
          </TypographyText>
        </CardContent>
        <CardActions>
          <MaterialButton bookList={bookList} key={key} uid={uid} setBookObj={setBookObj}/>
        </CardActions>
        </div>
      </Card>
    )

}
export default CardComponent