<template>
  <div id="app">
    <!-- Main -->
    <div class="container">
      <img
        src="@/assets/kongsun.png"
        alt="Logo"
        class="d-inline-block align-text-top mx-auto d-block"
      />
      <h2>💖 콩순이만 입장 가능! 💖</h2>
      <fieldset class="text-center">
        <div class="mb-3">
          <label for="id" class="col-sm-1 col-form-label">아이디</label>
          <input type="text" id="id" v-model="id" class="view" /><br />
        </div>
        <label for="password" class="col-sm-1 col-form-label">시크릿코드</label>
        <input
          type="password"
          id="password"
          v-model="password"
          class="view"
        /><br />
        <button class="btn btn-danger" v-on:click="login">로그인</button>
      </fieldset>
    </div>
  </div>
</template>

<script>
export default {
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
      localStorage.setItem("user", user);
      this.$emit("login-event", user);
    },
  },
};
</script>
