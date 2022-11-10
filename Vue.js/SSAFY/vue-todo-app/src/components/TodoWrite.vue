<template>
  <div>
    <h3>할 일 작성</h3>
    <input type="text" v-model="newTodo" @keyup.enter="createTodo" ref="todoInput">
    <button @click="createTodo">등록</button>
  </div>
</template>

<script>
export default {
  name: "TodoWrite",
  data() {
    return {
      newTodo: ''
    }
  },
  methods: {
    createTodo() {
      const todoItem = {
        work: this.newTodo,
        done: false
      }
      
      //유효성 검사.(아무것도 적지 않았을때!! 등록 안 되게 하겠다.)
      if(this.newTodo) {
        this.$store.dispatch("createTodo", todoItem)
        this.newTodo = ''
        console.log(todoItem);
      } else {
        // console.log("포커싱을 조절해보자");
        alert("내용을 입력하세요.")
        this.$refs.todoInput.focus()
      }
    }
  }
}
</script>

<style>

</style>