<template>
  <ideal-login-container @login-event="login"></ideal-login-container>
</template>

<script>
import IdealLoginContainer from "@/components/IdealLoginContainer.vue";

export default {
  components: {
    IdealLoginContainer,
  },

  data() {
    return {
      user: null,
    };
  },
  methods: {
    login(user) {
      let matched = false;

      if (user.id === "kongsunS2" && user.password === "1234") {
        matched = true;
      }

      if (matched) {
        localStorage.setItem("loginUser", JSON.stringify(user));
        this.user = user;
        this.$emit("login-event", user);
        alert("콩순아, 어서와❣️");
        this.$router.push("/list");
      } else {
        alert("💢 너 누구야 💢");
      }
    },
  },
};
</script>
