<template>
  <div id="app">
  </div>
</template>

<script>
import TodoFooter from './components/TodoFooter.vue';


export default {
  name: 'App',
  components: {
    'TodoHeader': TodoHeader,
    'TodoInput': TodoInput,
    'TodoList': TodoList,
    'TodoFooter': TodoFooter,
  }
}
</script>

<style>
</style>
