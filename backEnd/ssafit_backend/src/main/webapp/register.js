let q = 0;
const URLSearch = new URLSearchParams(location.search);
let value = URLSearch.get("value")
q = URLSearch.get("q");
const title = document.getElementById("floatingInput");
const content = document.getElementById("floatingPassword");

const bt_regist = document.getElementById("regist_bt");
bt_regist.addEventListener("click",event => {
  let reviews = [];
  let reviewsStr = localStorage.getItem(q);
  if(reviewsStr){
    JSON.parse(reviewsStr).forEach(ele => {reviews.push(ele)});
  }
  let date = new Date().toLocaleString('ko-kr');
  let temp = {"title":title.value,"content":content.value,"date":date,"views":0};
  reviews.push(temp);

  localStorage.setItem(q,JSON.stringify(reviews));
  window.location = `reviewlist.jsp?value=`+value+`&q=${q}`

});
document.getElementById("cancel_bt").addEventListener("click",event => {

  window.location = `reviewlist.jsp?value=`+value+`&q=${q}`

});
