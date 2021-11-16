const menuItems=[{
    itemName:"Chicken Biryani",
    itemCost:100
},
{
    itemName:"French Fries",
    itemCost:200
},
{
    itemName:"French Fries with Cheese and Jalapenos",
    itemCost:300
},
{
    itemName:"Crusty Garlic Focaccia with Melted Cheese",
    itemCost:400
}
]

const table=[{
    tableno: "Table 1",
    totalItems:0,
    totalCost: 0,
    itemList: []
},
{
    tableno: "Table 2",
    totalItems:0,
    totalCost: 0,
    itemList:[]
},
{
    tableno: "Table 3",
    totalItems:0,
    totalCost: 0,
    itemList:[]
}
]
const item1='<div class="cell cell-4" draggable="true" id="item1"><div style="text-align: left;"id ="item1Name"> </div><div style="font-size: medium; text-align: left; float: left;">Rs:  <div style="font-size: medium; text-align: left; float: right;" id="item1Cost"></div></div></div>'
const item2='<div class="cell cell-4" draggable="true" id="item2"><div style="text-align: left;"id ="item2Name"> </div><div style="font-size: medium; text-align: left; float: left;">Rs:  <div style="font-size: medium; text-align: left; float: right;" id="item2Cost"></div></div></div>'
const item3='<div class="cell cell-4" draggable="true" id="item3"><div style="text-align: left;"id ="item3Name"> </div><div style="font-size: medium; text-align: left; float: left;">Rs:  <div style="font-size: medium; text-align: left; float: right;" id="item3Cost"></div></div></div>'
const item4='<div class="cell cell-4" draggable="true" id="item4"><div style="text-align: left;"id ="item4Name"> </div><div style="font-size: medium; text-align: left; float: left;">Rs:  <div style="font-size: medium; text-align: left; float: right;" id="item4Cost"></div></div></div>'

const table1='<div data-modal-target="#modal" id="table1" class="cell cell-3" class="dropZone"><div id="table1Name"></div><div style="display: flex; justify-content: space-around; align-items: center;">  <div id="table1TotalCost" style="font-size: medium; "></div>  <div style="font-size: medium;" >|</div>  <div id="table1TotalItems" style="font-size: medium; "></div></div></div>'
const table2='<div data-modal-target="#modal2" id="table1" class="cell cell-3" class="dropZone"><div id="table2Name"></div><div style="display: flex; justify-content: space-around; align-items: center;"> <div id="table2TotalCost" style="font-size: medium;"></div><div style="font-size: medium;">|</div> <div id="table2TotalItems" style="font-size: medium;"></div></div></div>'
const table3='<div data-modal-target="#modal3" id="table1" class="cell cell-3" class="dropZone"><div  id="table3Name"></div><div style="display: flex; justify-content: space-around; align-items: center;"> <div id="table3TotalCost" style="font-size: medium;"></div><div style="font-size: medium;">|</div> <div id="table3TotalItems" style="font-size: medium;"></div></div></div>'
window.onload=onLoading()
function onLoading(){
    const elem=document.getElementById('menu')
    const tableElement=document.getElementById('tables')
    console.log("loggggggggggg")
    //const divv= document.createElement(div1)
    elem.innerHTML+=item1+item2+item3+item4
    tableElement.innerHTML+=table1+table2+table3
    
}




//table	
document.getElementById("item1Name").innerHTML=menuItems[0].itemName
document.getElementById("item2Name").innerHTML=menuItems[1].itemName
document.getElementById("item3Name").innerHTML=menuItems[2].itemName
document.getElementById("item4Name").innerHTML=menuItems[3].itemName

document.getElementById("item1Cost").innerHTML=menuItems[0].itemCost
document.getElementById("item2Cost").innerHTML=menuItems[1].itemCost
document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
document.getElementById("item4Cost").innerHTML=menuItems[3].itemCost

document.getElementById("table1Name").innerHTML=table[0].tableno
document.getElementById("table1TotalCost").innerHTML="Rs. "+table[0].totalCost
document.getElementById("table1TotalItems").innerHTML="Total items: "+table[0].totalItems

document.getElementById("table2Name").innerHTML=table[1].tableno
document.getElementById("table2TotalCost").innerHTML="Rs. "+table[1].totalCost
document.getElementById("table2TotalItems").innerHTML="Total items: "+table[1].totalItems

document.getElementById("table3Name").innerHTML=table[2].tableno
document.getElementById("table3TotalCost").innerHTML="Rs. "+table[2].totalCost
document.getElementById("table3TotalItems").innerHTML="Total items: "+table[2].totalItems



var searchItem=null
var arr1=[]
window.onchange=searchFun()
function searchFun(){
    arr1=[]
    searchItem=document.getElementById('searchbar').value
    for(let i=0; i<menuItems.length;i++) {
        if(menuItems[i].itemName.includes(searchItem)){
         console.log(i)
         arr1.push(i)
        }
    }

         if(arr1.indexOf(0)>=0){
             console.log('lolwdadawd')
            document.getElementById('menu').innerHTML=item1   
            document.getElementById("item1Name").innerHTML=menuItems[0].itemName
            document.getElementById("item1Cost").innerHTML=menuItems[0].itemCost
            }
        if(arr1.indexOf(1)>=0){
            document.getElementById('menu').innerHTML=item2   
            document.getElementById("item2Name").innerHTML=menuItems[1].itemName
            document.getElementById("item2Cost").innerHTML=menuItems[1].itemCost
            }    


        if(arr1.indexOf(2)>=0){
         document.getElementById('menu').innerHTML=item3   
         document.getElementById("item3Name").innerHTML=menuItems[2].itemName
         document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
         }    

         if(arr1.indexOf(3)>=0){
         document.getElementById('menu').innerHTML=item4   
         document.getElementById("item4Name").innerHTML=menuItems[3].itemName
         document.getElementById("item4Cost").innerHTML=menuItems[3].itemCost
         }

         if(arr1.length==4){
             document.getElementById('menu').innerHTML=item1+item2+item3+item4
             document.getElementById("item1Name").innerHTML=menuItems[0].itemName
            document.getElementById("item2Name").innerHTML=menuItems[1].itemName
            document.getElementById("item3Name").innerHTML=menuItems[2].itemName
            document.getElementById("item4Name").innerHTML=menuItems[3].itemName

            document.getElementById("item1Cost").innerHTML=menuItems[0].itemCost
            document.getElementById("item2Cost").innerHTML=menuItems[1].itemCost
            document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
            document.getElementById("item4Cost").innerHTML=menuItems[3].itemCost
         }

         if(arr1.length==2){
             if(arr1.indexOf(1)>=0 && arr1.indexOf(2)>=0){
                document.getElementById('menu').innerHTML=item2+item3   
            document.getElementById("item3Name").innerHTML=menuItems[2].itemName
            document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
            document.getElementById("item2Name").innerHTML=menuItems[1].itemName
            document.getElementById("item2Cost").innerHTML=menuItems[1].itemCost
             }

             if(arr1.indexOf(2)>=0 && arr1.indexOf(3)>=0){
                document.getElementById('menu').innerHTML=item3+item4   
            document.getElementById("item4Name").innerHTML=menuItems[3].itemName
            document.getElementById("item4Cost").innerHTML=menuItems[3].itemCost
            document.getElementById("item3Name").innerHTML=menuItems[2].itemName
            document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
             }

         }
         if(arr1.length==3){
             if(arr1[0]==1)
             {
            document.getElementById('menu').innerHTML=item2+item3+item4   
            document.getElementById("item3Name").innerHTML=menuItems[2].itemName
            document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
            document.getElementById("item2Name").innerHTML=menuItems[1].itemName
            document.getElementById("item2Cost").innerHTML=menuItems[1].itemCost
            document.getElementById("item4Name").innerHTML=menuItems[3].itemName
            document.getElementById("item4Cost").innerHTML=menuItems[3].itemCost
             }
             else if(arr1[0]==0){
                document.getElementById('menu').innerHTML=item1+item3+item4   
                document.getElementById("item3Name").innerHTML=menuItems[2].itemName
                document.getElementById("item3Cost").innerHTML=menuItems[2].itemCost
                document.getElementById("item1Name").innerHTML=menuItems[0].itemName
                document.getElementById("item1Cost").innerHTML=menuItems[0].itemCost
                document.getElementById("item4Name").innerHTML=menuItems[3].itemName
                document.getElementById("item4Cost").innerHTML=menuItems[3].itemCost
             }
         }

         
         console.log(arr1,"wdawdad")

         
     
}
//table search
window.onchange=searchTable()
function searchTable(){
    const searchItemTable=document.getElementById('searchbarTable').value
    if(searchItemTable=="Table 1")
    {
        document.getElementById('tables').innerHTML=table1
        document.getElementById("table1Name").innerHTML=table[0].tableno
document.getElementById("table1TotalCost").innerHTML="Rs. "+table[0].totalCost
document.getElementById("table1TotalItems").innerHTML="Total items: "+table[0].totalItems
    }

    else if(searchItemTable=="Table 2")
    {
        document.getElementById('tables').innerHTML=table2
        document.getElementById("table2Name").innerHTML=table[1].tableno
document.getElementById("table2TotalCost").innerHTML="Rs. "+table[1].totalCost
document.getElementById("table2TotalItems").innerHTML="Total items: "+table[1].totalItems
    }

    else if(searchItemTable=="Table 3")
    {
        document.getElementById('tables').innerHTML=table3
        document.getElementById("table3Name").innerHTML=table[2].tableno
document.getElementById("table3TotalCost").innerHTML="Rs. "+table[2].totalCost
document.getElementById("table3TotalItems").innerHTML="Total items: "+table[2].totalItems
    }
    else{
        document.getElementById('tables').innerHTML=table1+table2+table3


        document.getElementById("table1Name").innerHTML=table[0].tableno
document.getElementById("table1TotalCost").innerHTML="Rs. "+table[0].totalCost
document.getElementById("table1TotalItems").innerHTML="Total items: "+table[0].totalItems

document.getElementById("table2Name").innerHTML=table[1].tableno
document.getElementById("table2TotalCost").innerHTML="Rs. "+table[1].totalCost
document.getElementById("table2TotalItems").innerHTML="Total items: "+table[1].totalItems

document.getElementById("table3Name").innerHTML=table[2].tableno
document.getElementById("table3TotalCost").innerHTML="Rs. "+table[2].totalCost
document.getElementById("table3TotalItems").innerHTML="Total items: "+table[2].totalItems
    }

}

const draggableElement1 =document.querySelector("#item1")
var index=0

//listeners
draggableElement1.addEventListener("dragstart",e =>{
    console.log(e)
    e.dataTransfer.setData("text/plain",draggableElement1.id)
    console.log(draggableElement1.id)
    console.log(draggableElement1.innerHTML)
    index=0
    
})

const draggableElement2 =document.querySelector("#item2")
//listeners
draggableElement2.addEventListener("dragstart",e =>{
    console.log(e)
    e.dataTransfer.setData("text/plain",draggableElement2.id)
    console.log(draggableElement2.id)
    console.log(draggableElement2.innerHTML)
    index=1
})

const draggableElement3 =document.querySelector("#item3")
//listeners
draggableElement3.addEventListener("dragstart",e =>{
    console.log(e)
    e.dataTransfer.setData("text/plain",draggableElement3.id)
    console.log(draggableElement3.id)
    console.log(draggableElement3.innerHTML)
    index=2
})

const draggableElement4 =document.querySelector("#item4")
//listeners
draggableElement4.addEventListener("dragstart",e =>{
    console.log(e)
    e.dataTransfer.setData("text/plain",draggableElement4.id)
    console.log(draggableElement4.id)
    console.log(draggableElement4.innerHTML)
    index=3
})




var focus=0



for(const dropZone of document.querySelectorAll("#table1")){
    dropZone.addEventListener("dragover",e=>{
        e.preventDefault();
        console.log("dropping")
        
    })

    dropZone.addEventListener("drop", e=>{
        e.preventDefault();
        console.log(e)
        const droppedId= e.dataTransfer.getData("text/plain")
        const dropped= document.getElementById(droppedId)
        console.log(dropped.innerText)
        console.log(dropZone.innerText)
        //table 1
        if(dropZone.innerText.includes("Table 1"))
        {
            focus=1
            table[0].totalCost=table[0].totalCost+menuItems[index].itemCost
            document.getElementById("table1TotalCost").innerHTML="Rs. "+table[0].totalCost
            table[0].totalItems=table[0].totalItems+1
            document.getElementById("table1TotalItems").innerHTML="Total items: "+table[0].totalItems


            const arr= dropped.firstChild.id
            console.log(arr+" ddde")
            if(arr.includes("item1Name")){
                table[0].itemList.push(menuItems[0].itemName)
            }
            if(arr.includes("item2Name")){
                table[0].itemList.push(menuItems[1].itemName)
            }
            if(arr.includes("item3Name")){
                table[0].itemList.push(menuItems[2].itemName)
            }
            if(arr.includes("item4Name")){
                table[0].itemList.push(menuItems[3].itemName)
            }

            //table 2
        }
        if(dropZone.innerText.includes("Table 2"))
        {
            focus=2
            table[1].totalCost=table[1].totalCost+menuItems[index].itemCost
            document.getElementById("table2TotalCost").innerHTML="Rs. "+table[1].totalCost
            table[1].totalItems=table[1].totalItems+1
            document.getElementById("table2TotalItems").innerHTML="Total items: "+table[1].totalItems


            const arr= dropped.firstChild.id
            console.log(arr+" ddde")
            if(arr.includes("item1Name")){
                table[1].itemList.push(menuItems[0].itemName)
            }
            if(arr.includes("item2Name")){
                table[1].itemList.push(menuItems[1].itemName)
            }
            if(arr.includes("item3Name")){
                table[1].itemList.push(menuItems[2].itemName)
            }
            if(arr.includes("item4Name")){
                table[1].itemList.push(menuItems[3].itemName)
            }

   
        }
        //table 3
        if(dropZone.innerText.includes("Table 3"))
        {
            focus=3
            table[2].totalCost=table[2].totalCost+menuItems[index].itemCost
            document.getElementById("table3TotalCost").innerHTML="Rs. "+table[2].totalCost
            table[2].totalItems=table[2].totalItems+1
            document.getElementById("table3TotalItems").innerHTML="Total items: "+table[2].totalItems


            const arr= dropped.firstChild.id
            console.log(arr+" ddde")
            if(arr.includes("item1Name")){
                table[2].itemList.push(menuItems[0].itemName)
            }
            if(arr.includes("item2Name")){
                table[2].itemList.push(menuItems[1].itemName)
            }
            if(arr.includes("item3Name")){
                table[2].itemList.push(menuItems[2].itemName)
            }
            if(arr.includes("item4Name")){
                table[2].itemList.push(menuItems[3].itemName)
            }

   
        }
        
    })
}

const openModalButtons= document.querySelectorAll('[data-modal-target]')
const closeModalButtons= document.querySelectorAll('[data-close-button]')
const overlay =document.getElementById('overlay')

openModalButtons.forEach(e=>{
    e.addEventListener('click',()=>{
        const modal= document.querySelector(e.dataset.modalTarget)
        
        var sno1=1
        var sno2=1
        var sno3=1
        
        const countOccurrences = (arr, val) => arr.reduce((a, v) => (v === val ? a + 1 : a), 0);
        


        //Table 1
        if(table[0].itemList.includes("Chicken Biryani")){
            
            document.getElementById("sno11").innerHTML=sno1
            sno1=sno1+1
            document.getElementById("table1ItemNameModal1").innerHTML=menuItems[0].itemName
            document.getElementById("table1TotalCostModal1").innerHTML=menuItems[0].itemCost
            document.getElementById("table1TotalItemsModal1").innerHTML=countOccurrences(table[0].itemList,"Chicken Biryani")

            // document.getElementById("table1TotalItemsModal1").setAttribute("value",countOccurrences(table[0].itemList,"Chicken Biryani"))
            // table1Total=table1Total+menuItems[0].itemCost*document.getElementById("table1TotalItemsModal1").value
            // document.getElementById("totalcost1").innerHTML=table1Total
        }

        if(table[0].itemList.includes("French Fries")){

            document.getElementById("sno12").innerHTML=sno1
            sno1=sno1+1
            document.getElementById("table1ItemNameModal2").innerHTML=menuItems[1].itemName
            document.getElementById("table1TotalCostModal2").innerHTML=menuItems[1].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table1TotalItemsModal2").innerHTML=countOccurrences(table[0].itemList,"French Fries")
            document.getElementById("totalcost1").innerHTML=table[0].totalCost
        }

        if(table[0].itemList.includes("French Fries with Cheese and Jalapenos")){

            document.getElementById("sno13").innerHTML=sno1
            sno1=sno1+1
            document.getElementById("table1ItemNameModal3").innerHTML=menuItems[2].itemName
            document.getElementById("table1TotalCostModal3").innerHTML=menuItems[2].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table1TotalItemsModal3").innerHTML=countOccurrences(table[0].itemList,"French Fries with Cheese and Jalapenos")
            document.getElementById("totalcost1").innerHTML=table[0].totalCost
        }

        if(table[0].itemList.includes("Crusty Garlic Focaccia with Melted Cheese")){

            document.getElementById("sno14").innerHTML=sno1
            sno1=sno1+1
            document.getElementById("table1ItemNameModal4").innerHTML=menuItems[3].itemName
            document.getElementById("table1TotalCostModal4").innerHTML=menuItems[3].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table1TotalItemsModal4").innerHTML=countOccurrences(table[0].itemList,"Crusty Garlic Focaccia with Melted Cheese")
            document.getElementById("totalcost1").innerHTML=table[0].totalCost
        }
        

        

        //table2
        if(table[1].itemList.includes("Chicken Biryani")){

            document.getElementById("sno21").innerHTML=sno2
            sno2=sno2+1
            document.getElementById("table2ItemNameModal1").innerHTML=menuItems[0].itemName
            document.getElementById("table2TotalCostModal1").innerHTML=menuItems[0].itemCost
            document.getElementById("table2TotalItemsModal1").innerHTML=countOccurrences(table[1].itemList,"Chicken Biryani")
            document.getElementById("totalcost2").innerHTML=table[1].totalCost
        }

        if(table[1].itemList.includes("French Fries")){

            document.getElementById("sno22").innerHTML=sno2
            sno2=sno2+1
            document.getElementById("table2ItemNameModal2").innerHTML=menuItems[1].itemName
            document.getElementById("table2TotalCostModal2").innerHTML=menuItems[1].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table2TotalItemsModal2").innerHTML=countOccurrences(table[1].itemList,"French Fries")
            document.getElementById("totalcost2").innerHTML=table[1].totalCost
        }

        if(table[1].itemList.includes("French Fries with Cheese and Jalapenos")){

            document.getElementById("sno23").innerHTML=sno2
            sno2=sno2+1
            document.getElementById("table2ItemNameModal3").innerHTML=menuItems[2].itemName
            document.getElementById("table2TotalCostModal3").innerHTML=menuItems[2].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table2TotalItemsModal3").innerHTML=countOccurrences(table[1].itemList,"French Fries with Cheese and Jalapenos")
            document.getElementById("totalcost2").innerHTML=table[1].totalCost
        }

        if(table[1].itemList.includes("Crusty Garlic Focaccia with Melted Cheese")){

            document.getElementById("sno24").innerHTML=sno2
            sno2=sno2+1
            document.getElementById("table2ItemNameModal4").innerHTML=menuItems[3].itemName
            document.getElementById("table2TotalCostModal4").innerHTML=menuItems[3].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table2TotalItemsModal4").innerHTML=countOccurrences(table[1].itemList,"Crusty Garlic Focaccia with Melted Cheese")
            document.getElementById("totalcost2").innerHTML=table[1].totalCost
        }


        //table3
        if(table[2].itemList.includes("Chicken Biryani")){

            document.getElementById("sno31").innerHTML=sno3
            sno3=sno3+1
            document.getElementById("table3ItemNameModal1").innerHTML=menuItems[0].itemName
            document.getElementById("table3TotalCostModal1").innerHTML=menuItems[0].itemCost
            document.getElementById("table3TotalItemsModal1").innerHTML=countOccurrences(table[2].itemList,"Chicken Biryani")
            document.getElementById("totalcost3").innerHTML=table[2].totalCost
        }

        if(table[2].itemList.includes("French Fries")){

            document.getElementById("sno32").innerHTML=sno3
            sno3=sno3+1
            document.getElementById("table3ItemNameModal2").innerHTML=menuItems[1].itemName
            document.getElementById("table3TotalCostModal2").innerHTML=menuItems[1].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table3TotalItemsModal2").innerHTML=countOccurrences(table[2].itemList,"French Fries")
            document.getElementById("totalcost3").innerHTML=table[2].totalCost
        }

        if(table[2].itemList.includes("French Fries with Cheese and Jalapenos")){


            document.getElementById("sno33").innerHTML=sno3
            sno3=sno3+1
            document.getElementById("table3ItemNameModal3").innerHTML=menuItems[2].itemName
            document.getElementById("table3TotalCostModal3").innerHTML=menuItems[2].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table3TotalItemsModal3").innerHTML=countOccurrences(table[2].itemList,"French Fries with Cheese and Jalapenos")
            document.getElementById("totalcost3").innerHTML=table[2].totalCost
        }

        if(table[2].itemList.includes("Crusty Garlic Focaccia with Melted Cheese")){


            document.getElementById("sno34").innerHTML=sno3
            sno3=sno3+1
            document.getElementById("table3ItemNameModal4").innerHTML=menuItems[3].itemName
            document.getElementById("table3TotalCostModal4").innerHTML=menuItems[3].itemCost
            console.log(menuItems[1].itemCost,"awdwa")
            document.getElementById("table3TotalItemsModal4").innerHTML=countOccurrences(table[2].itemList,"Crusty Garlic Focaccia with Melted Cheese")
            document.getElementById("totalcost3").innerHTML=table[2].totalCost
        }

        if(focus==1){
            document.querySelectorAll("#table1")[2].classList.remove('active')
            document.querySelectorAll("#table1")[1].classList.remove('active')
            document.querySelectorAll("#table1")[0].classList.add('active')

        }else if(focus==2){
            document.querySelectorAll("#table1")[0].classList.remove('active')
            document.querySelectorAll("#table1")[2].classList.remove('active')
            document.querySelectorAll("#table1")[1].classList.add('active')

        } else if(focus==3){
            document.querySelectorAll("#table1")[0].classList.remove('active')
            document.querySelectorAll("#table1")[1].classList.remove('active')
            document.querySelectorAll("#table1")[2].classList.add('active')

        }
        console.log(focus)
        focus=0
        openModal(modal)
        
    })
})

closeModalButtons.forEach(e=>{
    e.addEventListener('click',()=>{
        focus=0
        console.log("close",focus)
        const modal= e.closest('.modal')
        closeModal(modal)
    })
})

function openModal(modal){
    modal.classList.add('active')
    overlay.classList.add('active')

}

function closeModal(modal){
    modal.classList.remove('active')
    overlay.classList.remove('active')
    document.querySelectorAll("#table1")[0].classList.remove('active')
    document.querySelectorAll("#table1")[1].classList.remove('active')
    document.querySelectorAll("#table1")[2].classList.remove('active')
}
