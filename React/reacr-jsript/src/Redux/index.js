const redux=require('redux')

const createStore= redux.createStore

const BUY_CAKE="BUY_CAKE"
const BUY_ICE="BUY_ICE"


const buy_cake= () =>{
    return ({
        type:BUY_CAKE,
        info: "redux action"
    })
}
const buy_ice= () =>{
    return ({
        type:BUY_ICE,
        info: "redux action"
    })
}



const intialState ={
    noOfCake: 10,
    noOfIce: 20
}

const reducer =(action,state=intialState) => {

    switch(action.type){
        case BUY_CAKE : 
            return {
                ...state,
                noOfCake: state.noOfCake -1
            }
        case BUY_ICE : 
            return {
                ...state,
                noOfIce: state.noOfIce -1
            }
        default :
            return(state)
    }
}


const store= createStore(reducer)
console.log("inital state", store.getState())

const unsubscribe=store.subscribe(()=> console.log('updated state',store.getState()))
store.dispatch(buy_cake())
store.dispatch(buy_cake())
store.dispatch(buy_cake())
store.dispatch(buy_ice())
store.dispatch(buy_ice())
unsubscribe()