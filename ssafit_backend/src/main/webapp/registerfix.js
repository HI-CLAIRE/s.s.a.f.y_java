const URLSearch = new URLSearchParams(location.search);
let q = 0;
let idx = 0;
let value = URLSearch.get("value");
q = URLSearch.get("q");
idx = URLSearch.get("idx");
let reviews = [];
let reviewsGet = JSON.parse(localStorage.getItem(q));
if(reviewsGet){
  reviewsGet.forEach(el => {reviews.push(el)});
}
let review = reviews[idx];
const title = document.getElementById("floatingInput");
const content = document.getElementById("floatingPassword");
title.value = review.title;
content.value = review.content;


//수정 버튼
document.getElementById("registbt").addEventListener("click",event => {
 
  let date = new Date().toLocaleString('ko-kr');
  let temp = {"title":title.value,"content":content.value,"date":date,"views":review.views};
  reviews[idx] = temp;

  localStorage.setItem(q,JSON.stringify(reviews));
  window.location = `/reviewlist.jsp?value=`+value+`&q=${q}`

});

//취소 버튼
document.getElementById("cancelbt").addEventListener("click",event => {
 
  window.location = `/reviewlist.jsp?value=`+value+`&q=${q}`;
});