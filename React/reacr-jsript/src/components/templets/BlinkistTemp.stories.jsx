import React from 'react';
import { BlinkistTemp } from './BlinkistTemp';

export default {
    title: 'Template/BlinkistTemp',
    component: BlinkistTemp,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const BlinkistTemp1 = ()=>{

      return(<BlinkistTemp />
      )
  }
  