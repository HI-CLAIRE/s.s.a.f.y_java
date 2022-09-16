const URLSearch = new URLSearchParams(location.search);
let q = 0;
let idx = 0;
let value = URLSearch.get("value");
console.log(value)
q = URLSearch.get("q");
idx = URLSearch.get("idx");
let reviews = [];
let reviewsGet = JSON.parse(localStorage.getItem(q));
console.log(reviewsGet)
if(reviewsGet){
  reviewsGet.forEach(el => {reviews.push(el)});
}
let review = reviews[idx];
console.log(reviews.title)
reviews[idx].views++;
localStorage.setItem(q,JSON.stringify(reviews))
document.getElementById("article").innerHTML = 
`
<p>&nbsp;&nbsp;&nbsp;${review.title}</p>
    <span>&nbsp;&nbsp;&nbsp;작성일 : ${review.date}</span>
    <br>
    <span>&nbsp;&nbsp;&nbsp;조회수 : ${review.views}</span>
    <hr>
    <p>&nbsp;&nbsp;&nbsp;${review.content}</p>
    <hr>
`

//목록 버튼
document.querySelector("#bt-li").addEventListener("click",event => {
 
  window.location = `/reviewlist.jsp?value=`+value+`&q=${q}`

});
//수정 버튼
document.querySelector("#bt-re").addEventListener("click",event => {

  window.location = `/registerfix.jsp?value=`+value+`&q=${q}&idx=${idx}`

});
//삭제 버튼
document.querySelector("#bt-de").addEventListener("click",event => {
 
  reviews.splice(idx,1);
  localStorage.setItem(q,JSON.stringify(reviews));
  window.location = `/reviewlist.jsp?value=`+value+`&q=${q}`
});