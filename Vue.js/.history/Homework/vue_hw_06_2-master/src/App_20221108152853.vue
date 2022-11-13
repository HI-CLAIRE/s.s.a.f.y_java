<template>
  <div id="app">
    <header-nav :user="user" @logout="logout" />
    <r @login="login" />
  </div>
</template>
<script>
import HeaderNav from "@/components/common/HeaderNav.vue";
export default {
  name: "App",
  components: {
    HeaderNav,
  },
  data() {
    return {
      user: null,
    };
  },
  methods: {
    logout() {
      this.user = null;
      localStorage.removeItem("loginUser")
    },
    login(user) {
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
        this.user = user
        alert("로그인 성공");
        this.$router.push("/");
      } else {
        alert("로그인 실패");
      }
    },
  },
};
</script>
<style>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
}
.text-center {
  text-align: center;
}
.container {
  margin: 0px 30px;
}
</style>
