//1)Write a program to demonstrate how a function can be passed as a parameter to another function.
x= function p(){
    console.log("hi")
}
const car={
    mode:"4 wheels",
    load: "2 load"
}
document.getElementById("root").innerHTML=car.load
if(x){
    function xrp(x){
        
        console.log("function passed as param")
        
    }
    xrp()
}
x()
function func2(obj) {
  obj.brand = "Toyota";
}

var mycar = {
  brand: "tesla",
  model: "model x",
  year: 2021
};

console.log(mycar.brand);
func2(mycar);

console.log(mycar.brand);

//2) return first name last name initials
var name ={
    firstName: "Suhas",
    lastName: "Jayaram"
}
var firstLast= (name) =>{
    
  console.log(name.firstName.charAt(0)+ name.lastName.charAt(0))
}
firstLast(name)