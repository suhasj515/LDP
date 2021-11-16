//2)
const printBill = (name, bill) => {
    return `Hi  ${name} , please pay: ${bill}`;
}

console.log(printBill('suhas','1000'))


//3)
const person = {
    name: "Noam Chomsky",
    age: 92
}

let {name,age} = person;
console.log(name);
console.log(age);