import React,{useState} from 'react';
import Box from '@mui/material/Box';
import Tab from '@mui/material/Tab';
import TabContext from '@mui/lab/TabContext';
import TabList from '@mui/lab/TabList';
import TabPanel from '@mui/lab/TabPanel';
import GridLayoutBooks from '../GridLayoutBooks/GridLayoutBooks.js';

export default function SwitchTab(props) {
  const [value, setValue] = useState("1");

  const {BookObj,setBookObj}=props

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };


  return (
    <div>
      <Box sx={{ width: '100%' }}>
        <TabContext value={value}>
          <Box sx={{ borderBottom: 1, borderColor: 'divider', color: "#22C870", maxWidth:'700px'}} >
            <TabList onChange={handleChange} aria-label="CeraPRO-Bold, sans-serif, arial" textColor="inherit"  >
              <Tab label="Currently Reading" style={{minWidth:'290px',fontSize:"18px",lineHeight:'24px',marginBottom:'10px',alignItems:'start'}} value="1"  TabIndicatorProps={{style: {background:'red',textColor:"red"}}}/>
              <Tab label="Finished" style={{maxWidth:'20px',fontSize:"18px",lineHeight:'24px',marginBottom:'10px'}} value="2" />
            </TabList>
          </Box>
          <TabPanel value="1" style={{marginLeft:'-18px',marginRight:'-30px'}}><GridLayoutBooks BookObj={BookObj} setBookObj={setBookObj} status="Reading"/></TabPanel>
          <TabPanel value="2" style={{marginLeft:'-18px',marginRight:'-30px'}}><GridLayoutBooks BookObj={BookObj} setBookObj={setBookObj} status="Finished"/></TabPanel>
        </TabContext>
      </Box>
    </div>
  );
}
