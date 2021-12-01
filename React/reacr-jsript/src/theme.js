import { createTheme } from "@mui/material";

export const theme= createTheme({
    palette:{
        primary:{
            main: '#2CE080'
        },
        secondary:{
            main: '#22C870'
        }
    },
    typography:{
        fontFamily: '"CeraPRO-Regular", sans-serif, arial',
        fontWeight:'bold',
        lineHeight: '24px',
        button:{
            fontSize: '16px',
            fontStyle: 'normal',
            fontWeight: 700,
            lineHeight: '24px',
            letterSpacing: '0px',
            textAlign: 'left',
            textTransform:'capitalize',
            color: '#03314B',
            //backgroundColor: '#2CE080'

        }
    }
})
