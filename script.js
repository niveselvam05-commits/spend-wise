let expenses = [];

function addExpense(){

let name = document.getElementById("name").value;
let amount = Number(document.getElementById("amount").value);
let category = document.getElementById("category").value;

expenses.push({name,amount,category});

displayExpenses();
}

function displayExpenses(){

let list = document.getElementById("list");
list.innerHTML = "";

let total = 0;

expenses.forEach(e => {

let li = document.createElement("li");
li.textContent = e.name + " - " + e.amount + " (" + e.category + ")";
list.appendChild(li);

total += e.amount;

});

document.getElementById("total").textContent = "Total: " + total;

}
