<template>
  <div class="container">
    <h2>로그인</h2>
    <fieldset class="text-center">
      <label for="id">아이디</label>
      <input type="text" id="id" v-model="id" class="view" /><br />
      <label for="password">비밀번호</label>
      <input
        type="password"
        id="password"
        v-model="password"
        class="view"
      /><br />
      <button class="btn" @click="login">로그인</button>
    </fieldset>
  </div>
</template>
<script>
export default {
  name: "LoginForm",
  data() {
    return {
      id: "",
      password: "",
    };
  },
  methods: {
    login() {
      let user = {
        id: this.id,
        password: this.password,
      };

      let userList = JSON.parse(localStorage.getItem("userList"));

      let matched = false;

      for (let i = 0; i < userList.length; i++) {
        if (
          user.id === userList[i].id &&
          user.password === userList[i].password
        ) {
          matched = true;
          break;
        }
      }
      if (matched) {
        localStorage.setItem("loginUser", JSON.stringify(user));
        alert("로그인 성공");
        location.href = "/";
      } else {
        alert("로그인 실패");
      }
    },
  },
};
</script>
