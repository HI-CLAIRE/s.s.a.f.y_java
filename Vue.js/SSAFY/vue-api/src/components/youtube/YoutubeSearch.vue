<template>
  <div>
    <h3>검색 컴포넌트야</h3>
    <input type="text" v-model="keyword">
    <button @click="search">검색</button>
  </div>
</template>

<script>
export default {
  data() {
    return {
      keyword: '',
    }
  },
  methods: {
    search() {
      this.$emit("search-input", this.keyword)
    },
  }
}
</script>

<style>

</style>