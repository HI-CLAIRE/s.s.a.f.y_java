<template>
  <div class="container">
    <div class="text-center">
      <input
        class="view"
        type="text"
        v-model="search"
        placeholder="이름을 입력하세요."
      />
      <button class="btn" @click="searchUser">검색</button>
    </div>
    <br />
    <hr />
    <div>
      <h2>검색 결과</h2>
      <div v-if="users.length">
        <table class="user-list">
          <colgroup>
            <col style="width: 5%" />
            <col style="width: 40%" />
            <col style="width: 20%" />
            <col style="width: 20%" />
            <col style="width: 15%" />
          </colgroup>
          <thead>
            <tr>
              <th>번호</th>
              <th>아이디</th>
              <th>이름</th>
              <th>이메일</th>
              <th>나이</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="(user, index) in users" :key="index">
              <td>{{ index + 1 }}</td>
              <td>
                <router-link class="user-link" :to="`/${user.id}`">{{
                  user.id
                }}</router-link>
              </td>
              <td>{{ user.name }}</td>
              <td>{{ user.email }}</td>
              <td>{{ user.age }} 세</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div v-else>검색 결과가 없습니다.</div>
    </div>
    <br />
  </div>
</template>
<script>
import axios from "axios";

export default {
  name: "UserSearch",
  data() {
    return {
      search: "",
      users: [],
    };
  },
  methods: {
    searchUser() {
      // user 수정 요청 api 주소
      const API_URL = `http://localhost:9999/userapi/user/search`;
      // axios 요청 (Spring Boot Rest API 참고)
      axios({
        url: API_URL,
        method: "get",
        params: {
          key: 'name',
          word: this.search,
          orderBy: 'name',
          orderByDir: 'DESC'
        }
      })
        .then((res) => {
          for (let i = 0; i < res.data.length; i++) {
            this.$set(this.users, i, res.data[i]);
          }
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>
