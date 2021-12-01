import SwitchTab from "../../organisms/SwitchTab/SwitchTab";
import * as React from 'react';
import { makeStyles } from "@mui/styles";

const BottomPart =(props) =>{

    const {BookObj,setBookObj,onclix}=props

    const styles= makeStyles({
        GridMargins: {
            marginRight: '380px',
            marginLeft: '380px'
        }
    })

    const classes= styles()
    return(
        <div className={classes.GridMargins}>
        <SwitchTab BookObj={BookObj} setBookObj={setBookObj} onclix={onclix}/>
        </div>
    )
}
export default BottomPart