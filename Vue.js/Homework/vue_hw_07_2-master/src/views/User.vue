<template>
  <div>
    <router-view
      :users="users"
      @create-user="createUser"
      @update-user="updateUser"
      @delete-user="deleteUser"
    />
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "User",
  data() {
    return {
      users: [],
    };
  },
  methods: {
    getUserList() {
      // user 리스트 요청 api 주소
      const API_URL = `http://localhost:9999/userapi/user`;
      // axios 요청 (Spring Boot Rest API 참고)
      axios({
        url: API_URL,
        method: "get",
      })
        .then((res) => {
          this.users = res.data;
          // 일치하는 정보가 있으면 true로 바꿈
        })
        .catch((err) => {
          console.log(err);
        });
    },
    createUser(user) {
      // user 등록 요청 api 주소
      const API_URL = `http://localhost:9999/userapi/user`;
      // axios 요청 (Spring Boot Rest API 참고)
      axios({
        url: API_URL,
        method: "post",
        data: user,
      })
        .then(() => {
          alert("등록 완료");
          this.getUserList();
          this.$router.push("/user");
        })
        .catch((err) => {
          console.log(user)
          console.log(err);
        });
    },
    updateUser(user) {
      // user 수정 요청 api 주소
      const API_URL = `http://localhost:9999/userapi/user`;
      // axios 요청 (Spring Boot Rest API 참고)
      axios({
        url: API_URL,
        method: "put",
        data: user,
      })
        .then(() => {
          alert("수정 완료");
          this.getUserList();
          this.$router.push("/user");
        })
        .catch((err) => {
          console.log(err);
        });
    },
    deleteUser(user) {
      // user 수정 요청 api 주소
      const API_URL = `http://localhost:9999/userapi/user/${user.id}`;
      // axios 요청 (Spring Boot Rest API 참고)
      axios({
        url: API_URL,
        method: "delete",
      })
        .then(() => {
          alert("삭제 완료");
          this.getUserList();
          this.$router.push("/user");
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
  created() {
    this.getUserList();
  },
};
</script>

<style>
.user-link {
  color: black;
}

.view {
  width: 80%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  color: #787878;
  font-size: medium;
}

label {
  display: inline-block;
  width: 130px;
}

.btn {
  width: 8%;
  background-color: #d0d3d0;
  color: rgb(80, 82, 79);
  padding: 14px 20px;
  margin: 8px;
  border: 1px solid #787878;
  border-radius: 4px;
  font-size: large;
  cursor: pointer;
}

/* 테이블 CSS */
.user-list {
  border-collapse: collapse;
  width: 100%;
  text-align: center;
  margin: auto;
}

.user-list td,
.user-list th {
  border: 1px solid black;
}
</style>
