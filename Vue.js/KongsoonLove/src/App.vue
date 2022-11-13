<template>
  <div id="app">
    <ideal-nav-bar :user="user" @logout-event="logout" />
    <router-view @login-event="login"></router-view>
  </div>
</template>

<script>
import IdealNavBar from "@/components/IdealNavBar.vue";

export default {
  components: {
    IdealNavBar,
  },
  data() {
    return {
      user: null,
    };
  },
  methods: {
    logout() {
      this.user = null;
      localStorage.removeItem("user");
      console.log("로그아웃");
    },
    login(user) {
      console.log("login");
      this.user = user;
    },
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Do+Hyeon&display=swap");
#app {
  font-family: "Do Hyeon", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
  margin-top: 60px;
}
html,
body {
  background: #faedf0;
}
</style>
