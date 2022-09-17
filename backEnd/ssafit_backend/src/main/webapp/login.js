const floatingInputId = document.getElementById("exampleInputId1");
const floatingPassword = document.getElementById("exampleInputPassword1");

const loginBtn = document.getElementById("loginbt");
const cancelBtn = document.getElementById("backbt");

loginBtn.addEventListener("click", event => {
    let userListStr = JSON.parse(localStorage.getItem("user"))
    let userList = [];
    if (userListStr) {
        userListStr.forEach(ele => {
            userList.push(ele);
        })
    }
    for (let i = 0; i < userList.length; i++) {
        if (userList[i].id === floatingInputId.value) {
            if (userList[i].password === floatingPassword.value) {
                alert("로그인 성공");
                location.href = `main.jsp`
                return;
            }
        }
    }
    alert("로그인 실패")

    floatingPassword.value = "";

})

cancelBtn.addEventListener("click", e => {
    location.href = `main.jsp`
})