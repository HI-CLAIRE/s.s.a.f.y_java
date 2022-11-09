<template>
  <div id="app">
    <header-nav :user="user" @logout="logout" />
    <router-view @login="login" />
  </div>
</template>
<script>
import HeaderNav from "@/components/common/HeaderNav.vue";
import axios from "axios";

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
    },
    login(user) {
      // user 정보 요청 api 주소
      const API_URL = `http://localhost:9999/userapi/_____________`;

      // axios 요청 (Spring Boot Rest API 참고)
      axios({
        url: _____________,
        method: "_____________",
      })
        .then((res) => {
          this.user = res.data;
          // 일치하는 정보가 있으면 true로 바꿈
          let matched = false;
          // 비밀번호 비교하여 로그인 처리
          if (res.data && res.data.password == user.password) {
            matched = true;
          }
          if (matched) {
            // 로컬스토리지에 사용자 정보 저장
            localStorage.setItem("loginUser", JSON.stringify(user.data));
            alert("로그인 성공");
            this.$router.push("/");
          } else {
            alert("로그인 실패");
          }
        })
        .catch((err) => {
          console.log(err);
        });
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
