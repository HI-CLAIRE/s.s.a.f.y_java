<template>
  <div id="app">
    <h2>당신이 좋아하는 파트를 선택하세요.</h2>
    <result-view total="count"></result-view>
    <subject-view title="코딩"></subject-view>
    <subject-view title="알고리즘"></subject-view>
  </div>
</template>

<script>
  import ResultView from './components/ResultView.vue';
  import SubjectView from './components/SubjectView.vue';

  export default {
    name: 'App',
    components: {
      ResultView,
      SubjectView,
    },
  }
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
