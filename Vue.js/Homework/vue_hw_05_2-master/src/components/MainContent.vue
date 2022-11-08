<template>
  <div class="container">
    <div class="text-center">
      <br />
      <h1>{{ message }}</h1>
      <br />
    </div>
  </div>
</template>
<script>
export default {
  name: "MainContent",
  data() {
    return {
      message: "사용자 정보 사이트에 오신것을 환영합니다.",
    };
  },
};
</script>
