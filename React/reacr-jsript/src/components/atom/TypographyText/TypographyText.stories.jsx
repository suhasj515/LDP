import { Typography } from '@mui/material';
import React from 'react';
import TypographyText from './TypographyText';
import { makeStyles } from '@mui/styles';

export default {
    title: 'Atoms/Typography',
    component: TypographyText,
    // More on argTypes: https://storybook.js.org/docs/react/api/argtypes
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const TypographyText1 = ()=>{
    
      return(<div>
      <Typography type="bookTitle">Title</Typography>
      <TypographyText type="bookAuthor">Author</TypographyText>
      <TypographyText type="bookTime">Time</TypographyText>
      </div>
      )
  }
  