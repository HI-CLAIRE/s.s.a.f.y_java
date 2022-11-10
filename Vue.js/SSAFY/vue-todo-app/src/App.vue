<template>
  <div id="app">
    <h2>우리의 할 일</h2>
    <h4>전체 Todo : {{ allCount }}</h4>
    <!-- <h4>완료 Todo : {{ doneCount }}</h4>
    <h4>미완료 Todo : {{ undoneCount }}</h4> -->
    <h4>완료 Todo : {{ doneTodosCount }}</h4>
    <h4>미완료 Todo : {{ undoneTodosCount }}</h4>
    <todo-write></todo-write>
    <hr>
    <todo-list></todo-list>
  </div>
</template>

<script>
import TodoWrite from './components/TodoWrite.vue';
import TodoList from './components/TodoList.vue';
import { mapGetters } from 'vuex';

export default {
  name: 'App',
  components: {
    TodoWrite,
    TodoList
  },
  computed: {
    allCount() {
      return this.$store.state.todos.length
    },
    doneCount() {
      return this.$store.getters.doneTodosCount
    },
    undoneCount() {
      return this.$store.getters.undoneTodosCount
    },
    ...mapGetters([
      "undoneTodosCount", "doneTodosCount"
    ])
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
