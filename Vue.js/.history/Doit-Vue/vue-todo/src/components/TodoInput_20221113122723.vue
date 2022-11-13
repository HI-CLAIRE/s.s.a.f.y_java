<template>
    <div>
        <input type="text" v-model="newTodoItem">
        <button @click="addTodo">추가</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            newTodoItem: ''
        }
    },
    methods: {
        addTodo() {
            if(this.newTodoItem !== "") {
                let value = this.newTodoItem 
            }
        }
    }
}
</script>

<style>

</style>