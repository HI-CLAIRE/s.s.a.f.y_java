<template>
  <header>
    <nav class="header-nav">
      <div>
        <a href="index.html" class="logo" @click="home">SSAFY USERS</a>
      </div>
      <div>
        <a href="#" v-if="getUser" @click="logout">로그아웃</a>
        <a href="#" v-else>로그인</a>
        <a href="#">회원가입</a>
        <a href="#">사용자목록</a>
      </div>
    </nav>
  </header>
</template>
<script>
export default {
  name: "HeaderNav",
  methods: {
    logout() {
      localStorage.removeItem("loginUser");
      location.href = "index.html";
    },
  },
  computed: {
    getUser() {
      if (localStorage.getItem("loginUser")) {
        return true;
      } else {
        return false;
      }
    },
  },
};
</script>
