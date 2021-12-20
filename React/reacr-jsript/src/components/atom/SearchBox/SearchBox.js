import Autocomplete from '@mui/material/Autocomplete';
import TextField from '@mui/material/TextField';
import React from 'react';

export const SearchBox =(props) =>{

    const {BookObj,setBookObj,BookObj2}=props



    const requestSearch = (searchedVal) => {

        if(searchedVal!==undefined)
        {
        
        const filteredRows = BookObj.filter((obj) => {
            const tp= typeof searchedVal
            console.log(typeof tp,"wadwdawd")
            if(tp==="string")
            {
            return obj.alt.toLowerCase().includes(searchedVal.toLowerCase());
            }
            else
            {
          return obj.alt.toLowerCase().includes(searchedVal.target.value.toLowerCase());
            }
        });
        setBookObj(
         filteredRows
        
        )
        const tps=typeof searchedVal
        if(tps==="string")
        {
          if(searchedVal===""){
            setBookObj(BookObj2)
          }
        }else if(searchedVal.target.value===""){
            setBookObj(BookObj2)
        }
    }

      };
      const clicked =(e) =>{
        console.log(e.target.value)
    }
    return(
        <div>
        <Autocomplete style={{minWidth:'320px', marginRight:'320px'}}
        id="free-solo-demo"
        onChange={(event,value)=>{requestSearch(value)}}
        freeSolo
        options={BookObj.map((option) => option.alt) }
        renderInput={(params) => <TextField onClick={clicked} onChange={(searchedVal)=>requestSearch(searchedVal)} style={{width: '80%',height: '30%'}} {...params} label="Search By name or author" />}
        />
      </div>
    )
}