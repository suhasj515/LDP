import React ,{useEffect} from 'react'
import Autocomplete from '@mui/material/Autocomplete';
import TextField from '@mui/material/TextField';

export const SearchBox =(props) =>{

    const {BookObj,setBookObj,BookObj2}=props

    var TempBookObj={}

    const requestSearch = (searchedVal) => {

        if(searchedVal!==undefined)
        {
        
        const filteredRows = BookObj.bookList.filter((obj) => {
            const tp= typeof searchedVal
            console.log(typeof tp,"wadwdawd")
            if(tp==="string")
            return obj.alt.toLowerCase().includes(searchedVal.toLowerCase());
            else
          return obj.alt.toLowerCase().includes(searchedVal.target.value.toLowerCase());
        });
        setBookObj({
            bookList : filteredRows
        }
        )
        const tp=typeof searchedVal
        if(tp==="string")
        {

        }else
        if(searchedVal.target.value===""){
            setBookObj(BookObj2)
        }
    }

      };
      const clicked =(e) =>{
        console.log(e.target.value)
    }
    return(
        <div>
        <Autocomplete style={{minWidth:'320px', marginRight:'300px'}}
        id="free-solo-demo"
        onChange={(event,value)=>{requestSearch(value)}}
        freeSolo
        options={BookObj.bookList.map((option) => option.alt) }
        renderInput={(params) => <TextField onClick={clicked} onChange={(searchedVal)=>requestSearch(searchedVal)} style={{width: '80%',height: '30%'}} {...params} label="Search By name or author" />}
        />
      </div>
    )
}