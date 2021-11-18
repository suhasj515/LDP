import React, { useState } from "react";

const FunctionalComp =() =>{

    const [count,setCount]= useState(0)

    const incCount =() =>{
        setCount(count+1)
    }

    return <div>
        <button onClick={incCount}>increase</button>
        <h2>{count}</h2>
    </div>
}

export default FunctionalComp