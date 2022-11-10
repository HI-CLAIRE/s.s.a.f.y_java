<template>
  <div>
    <h3>할 일 목록</h3>
    <todo-list-item v-for="(todo, index) in todos" :key="index" :todoItem="todo"></todo-list-item>
  </div>
</template>

<script>
import {mapState} from 'vuex';
import TodoListItem from './TodoListItem.vue';

export default {
  name: "TodoList",
  components: {
    TodoListItem
  },
  computed: {
    // todos() {
    //   return this.$store.state.todos
    // }
    ...mapState([
      'todos'
    ])
  }
}
</script>

<style>

</style>