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
        fontFamily:"-apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Oxygen','Ubuntu', 'Cantarell', 'Fira Sans', 'Droid Sans', 'Helvetica Neue',sans-serif",
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
