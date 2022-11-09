<template>
  <div>
    <h2>전체 {{ total }}번 클릭 됨</h2>
    <h3>{{ countMsg }}</h3>
  </div>
</template>

<script>
// 헬퍼를 이용해서 작성을 편하게 해보자.
import { mapGetters } from 'vuex';


export default {
  name: "ResultView",
  computed: {
    total() {
      return this.$store.state.total
    },
    countMsg() {
      return this.$store.getters.countMsg
    },
    ...mapGetters([
      'countMsg'
    ])
  }
}
</script>

<style>

</style>