<template>
  <nav class="navbar navbar-dark bg-danger">
    <div class="container-fluid">
      <div v-if="user">
        <router-link to="/list" class="nav-link">
          <a class="navbar-brand" href="#">
            <img
              src="@/assets/kongsun.png"
              alt="Logo"
              width="30"
              height="24"
              class="d-inline-block align-text-top"
            />
            콩순이는 욕심쟁이야
          </a>
        </router-link>
      </div>
      <div v-else>
        <a class="navbar-brand" href="#">
          <img
            src="@/assets/kongsun.png"
            alt="Logo"
            width="30"
            height="24"
            class="d-inline-block align-text-top"
          />
          콩순이의 이상형은 누굴까?
        </a>
      </div>

      <!-- Header -->
      <header>
        <div>
          <button
            type="button"
            class="btn btn-light"
            v-if="user"
            @click="logout"
          >
            로그아웃
          </button>
        </div>
      </header>
    </div>
  </nav>
</template>

<script>
export default {
  name: "IdealNavBar",
  props: ["user"],

  data() {
    return {};
  },
  computed: {
    getUser() {
      let loginUser = localStorage.getItem("user");
      if (loginUser) {
        return true;
      } else {
        return false;
      }
    },
  },

  methods: {
    logout() {
      localStorage.removeItem("user");
      location.href = "/";
      this.$emit("logout-event");
    },
    gotoList() {
      location.href = "/list";
    },
  },
};
</script>

<style></style>
