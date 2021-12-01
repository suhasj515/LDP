import React from 'react';
import { MyLibraryBanner } from './MyLibraryBanner';

export default {
    title: 'Atoms/MyLibraryBanner',
    component: MyLibraryBanner,
    argTypes: {
      backgroundColor: { control: 'color' },
    },
  };

  export const MyLibraryBanner1 = (props)=>{
      return(
      <MyLibraryBanner />
      )
  }
  