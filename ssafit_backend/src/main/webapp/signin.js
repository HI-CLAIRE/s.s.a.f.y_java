const floatingInputId = document.getElementById("inputid");
const floatingInputName = document.getElementById("inputname");
const floatingInputEmail = document.getElementById("inputemail");
const floatingPassword = document.getElementById("inputpassword");
const floatingPasswordConfirm = document.getElementById(
    "inputpasswordcheck"
);
const registBtn = document.getElementById("gaip");
const cancelBtn = document.getElementById("back");

registBtn.addEventListener("click", (event) => {
    let validationCheck = true;
    let userListStr = JSON.parse(localStorage.getItem("user"))

    let userList = [];
    if(userListStr){
        userListStr.forEach(ele => {
            userList.push(ele);
        })
    }


    userList.forEach(ele =>{
        if(floatingInputId.value === ele.id){
            alert("이미 등록된 ID 입니다.");
            return;
        }
    })

    
    if(floatingPassword.value !== floatingPasswordConfirm.value){
        alert("비밀번호가 일치하지 않습니다.")
        return;
    }
    
    if (validationCheck) {
        let temp = {
            id: floatingInputId.value,
            name: floatingInputName.value,
            email: floatingInputEmail.value,
            password: floatingPassword.value,
        };
        userList.push(temp);
        localStorage.setItem("user", JSON.stringify(userList));
        alert("회원가입 완료!");
        window.location = `login.jsp?q=${0}`
    } else {
        alert("작성이 제대로 되지 않았습니다.");
    }
});


cancelBtn.addEventListener("click", e =>{
    window.location = `main.jsp?q=${0}`
})
