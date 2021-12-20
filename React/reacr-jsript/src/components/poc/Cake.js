import React from 'react'
import { buyCake } from './Redux Actions/CakeActions'
import { connect } from 'react-redux'
import { nextPage } from './Redux Actions/NextPage'
import { prevPage } from './Redux Actions/PrevPage'

const Cake =(props) =>{

    const bookDetails =[
        [
            {
                Title: "page one title",
                discription :"page one discrptioinskawduhaidhaygiudhaihd"
            },
            {
                Title: "page two title",
                discription :"page two discrptioinskawduhaidhaygiudhaihd"
            }

        ]
    ]


    return (
        <>
        <h1>Hello NO of cakes {props.noOfCakes} </h1>
        <button onClick={props.buyCake}>
            Hello
        </button>
        <h1>Page no {props.page} </h1>
        <h1> {bookDetails[0][props.page-1].Title}</h1> <br/>
        <h3>{bookDetails[0][props.page-1].discription}</h3>
        <button onClick={props.nextPage}>
            Next
        </button>
        <button onClick={props.prevPage}>
            previous
        </button>
        </>
    )
}

const mapStateToProps = state => {
    return {
        noOfCakes : state.noOfCakes,
        page : state.page
    }
}

const mapDispatchToProps = dispatch => {
    return {
        buyCake : () => dispatch(buyCake()),
        nextPage: () => dispatch(nextPage()),
        prevPage: () => dispatch(prevPage())
    }
}

export default connect(mapStateToProps,
    mapDispatchToProps)(Cake)