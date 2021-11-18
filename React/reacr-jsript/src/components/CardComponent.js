
import * as React from 'react';
import Card from '@mui/material/Card';
import CardActions from '@mui/material/CardActions';
import CardContent from '@mui/material/CardContent';
import CardMedia from '@mui/material/CardMedia';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import MaterialButton from './MaterialButton';
import styles from './CardComponentCss.module.css';

const CardComponent =() =>{

    return(
        <Card sx={{ maxWidth: 345 }}>
        <CardMedia
          component="img"
          height="340"
          image="https://images.blinkist.io/images/books/5ee007c16cee070006be04f1/1_1/470.jpg"
          alt="The Grid by Matt Watkinson"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="div" className={styles.bookcardtitle}>
          The Grid
          </Typography>
          <Typography variant="body2" color="text.secondary">
          Matt Watkinson
          </Typography>
        </CardContent>
        <CardActions>
          <MaterialButton bookName="Reading" />
        </CardActions>
      </Card>
    )

}
export default CardComponent