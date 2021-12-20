import  {buyCake}  from "../Redux Actions/CakeActions"

const initialValue = {
    noOfCakes :10,
    page: 1
}

const Reducer =(state=initialValue,action) => {
    console.log(action.type)
    switch(action.type) {
        case "BUY_CAKE" : 
        console.log(buyCake)
        return{
            ...state,
           noOfCakes: state.noOfCakes -1
        }

        case "NEXT_PAGE":
            return{
                ...state,
                page: state.page +1
            }
        
        case "PREV_PAGE":
            return{
                ...state,
                page: state.page -1
            }
        default :  console.log(action.type,"awjdbawjbdabwdjbaw");return state
    }
}

export default Reducer