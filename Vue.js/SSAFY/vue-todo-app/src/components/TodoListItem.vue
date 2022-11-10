<template>
  <div>
    <!-- 클래스 바인딩을 시켜놨기 때문에 줄이 그어진다(style)-->
    <span class="click-cursor" :class="{'is-done': todoItem.done}" @click="updateTodo(todoItem)">{{ todoItem.work }}</span>
    <button @click="deleteTodo(todoItem)">x</button>
  </div>
</template>

<script>
import { mapActions } from 'vuex';

export default {
  name: "TodoListItem",
  props: {
    todoItem: Object,
  },
  methods: {
    // updateTodo() {
    //   this.$store.dispatch('updateTodo', this.todoItem)
    // },
    // deleteTodo() {
    //   this.$store.dispatch('deleteTodo', this.todoItem)
    // },
    ...mapActions([
      'deleteTodo', 'updateTodo'
    ])
  }
}
</script>



<style scoped>
  .is-done {
    text-decoration: line-through;
    color: red;
  }
  .click-cursor {
    cursor: pointer;
  }
</style>