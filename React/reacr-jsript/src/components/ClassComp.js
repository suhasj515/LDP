import React from "react";

class ClassComp extends React.Component{

    constructor(){
        super()

        this.state={
            count:0
        }
        this.countUp=this.countUp.bind(this)
    }
    countUp(){
        this.setState({
            count: this.state.count +1
        })
    }

    render(){
        return <div>
            <button onClick={this.countUp}>increse</button>
            <h1>{this.state.count}</h1>
        </div>
    }
}
export default ClassComp