const URLSearch = new URLSearchParams(location.search);
const tube = document.getElementById("tube")
let value = URLSearch.get("value")
console.log(value)
tube.setAttribute("src",value)

let q = 0;
q = URLSearch.get("q");
console.log(q)

let reviews = [];
let reviewsGet = JSON.parse(localStorage.getItem(q));
if(reviewsGet){
  reviewsGet.forEach(el => {reviews.push(el)});
}
let num = 0;
const tbody = document.getElementById("table");
reviews.forEach(element => {
  num++;
  let review = document.createElement("tr");
  review.innerHTML = `
  <th>${num}</th>
  <td class = "title" id="${num-1}">${element.title}</td>
  <td>${element.views}</td>
  <td>${element.date}</td>
  `
  tbody.append(review);
})

//글작성
const regist = document.getElementById("regist");
regist.addEventListener("click",event => {
  
  window.location = `register.jsp?value=`+value+`&q=${q}`

});

//registerdetail
document.querySelectorAll(".title").forEach(el => el.addEventListener("click",event => {

  window.location = `registerdetail.jsp?value=`+value+`&q=${q}&idx=${el.id}`

}));