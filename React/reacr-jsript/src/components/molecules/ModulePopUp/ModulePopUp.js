import * as React from 'react';
import Button from '@mui/material/Button';
import TextField from '@mui/material/TextField';
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';

import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import Select from '@mui/material/Select';

export default function ModulePopUp(props) {
  const {addBook,bTitle,bAuthor,bUrl,handleClose,handleClickOpen,open,bCategory,bcategory,error}=props  

  console.log(bcategory,"Awdawdadwadwdaw")


  return (
    <div>
      <Button variant="outlined" onClick={handleClickOpen} style={{color: '#03314B',backgroundColor: '#2CE080',marginTop:'3px'}}>
        Add Book
      </Button>
      <Dialog open={open} onClose={handleClose}>
        <DialogTitle style={{fontSize:'30px',fontWeight:'bold', textColor:'#6C787F'}}>Add Book</DialogTitle>
        <DialogContent>
          <DialogContentText style={{margin:'8px 0px',fontSize:'20px'}}>
            Book Title :
          </DialogContentText>
          <TextField
           id="outlined-search" 
            onChange={bTitle}
            style={{minWidth:'380px'}}
            error={error}
            helperText={error ? "Required field":""}
          />
          <DialogContentText style={{margin:'8px 0px',fontSize:'20px'}}>
            Book Author :
          </DialogContentText>
          <TextField
           id="outlined-search" 
            onChange={bAuthor}
            style={{minWidth:'380px'}}
            error={error}
            helperText={error ? "Required field":""}
          />

          <DialogContentText style={{margin:'8px 0px',fontSize:'20px'}}>
            Book Url :
          </DialogContentText>
          <TextField
           id="outlined-search" 
            onChange={bUrl}
            style={{minWidth:'380px'}}
            error={error}
            helperText={error ? "Required field":""}
          />

          <DialogContentText style={{margin:'8px 0px',fontSize:'20px'}}>
            Book Category :
          </DialogContentText>
          {/* <TextField
           id="outlined-search" 
            onChange={bCategory}
            style={{minWidth:'380px'}}
          /> */}

          <InputLabel id="demo-simple-select-standard-label" ></InputLabel>
        <Select
          labelId="demo-simple-select-standard-label"
          id="demo-simple-select-standard"
          value={bcategory}
          onChange={bCategory}
          
        >
          {/* <MenuItem >
            <em>None</em>
          </MenuItem> */}
          <MenuItem value={"Science"}>Science</MenuItem>
          <MenuItem value={"Economics"}>Economics</MenuItem>
          <MenuItem value={"Politics"}>Politics</MenuItem>
          </Select>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose}>Cancel</Button>
          <Button onClick={addBook}>Add Book</Button>
        </DialogActions>
      </Dialog>
    </div>
  );
}
