import * as React from 'react';
import Button from '@mui/material/Button';
import Menu from '@mui/material/Menu';
import MenuItem from '@mui/material/MenuItem';
import ScienceIcon from '@mui/icons-material/Science';
import { makeStyles } from '@mui/styles';
import AccountBalanceIcon from '@mui/icons-material/AccountBalance';
import AttachMoneyIcon from '@mui/icons-material/AttachMoney';

export default function ExploreCategories(props) {
    const {onclickScience,onclickEconomics,onclickPolitics}=props
  const [anchorEl, setAnchorEl] = React.useState(null);
  const open = Boolean(anchorEl);
  const handleClick = (event) => {
    setAnchorEl(event.currentTarget);
  };
  const handleClose = () => {
    setAnchorEl(null);
  };

  const cstyles= makeStyles({
    ButtonCol: {
        color : "black",
        borderBottom: '2px solid white',
        '&:hover': {
            borderBottom: '2px solid #2CE080'

         }
    }


})
const classes=cstyles()


  return (
    <div>
      <Button
        id="basic-button"
        // aria-controls="basic-menu"
        aria-haspopup="true"
        aria-expanded={open ? 'true' : undefined}
        onClick={handleClick}
        className={classes.ButtonCol}
      >
        Explore
      </Button>
      <Menu 
        id="basic-menu"
        anchorEl={anchorEl}
        open={open}
        onClose={handleClose}
        style={{marginRight:'200px'}}
      >
          <div style={{marginRight:'200px'}}>
        <MenuItem onClick={onclickScience} style={{padding:'15px'}}><ScienceIcon />Science</MenuItem>
        <MenuItem onClick={onclickEconomics} style={{padding:'15px'}}><AttachMoneyIcon/>Econmomics</MenuItem>
        <MenuItem onClick={onclickPolitics} style={{padding:'15px'}}><AccountBalanceIcon />Politics</MenuItem>
        </div>
      </Menu>
    </div>
  );
}