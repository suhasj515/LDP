import CardMedia from '@mui/material/CardMedia';
import React from 'react';


const CardImage=(props)=>{

    const {bookList}=props
    return(
<CardMedia
          component={bookList.component}
          height={bookList.height}
          image={bookList.image}
          alt={bookList.alt}
          style={{boxShadow: 0}}
        />
    )
}

export default CardImage