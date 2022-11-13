<template>
    <div>
        <input type="text" v-model="newTodoItem">
        <button @click="">추가</button>
    </div>
</template>

<script>
export default {
    data() {
        return {
            newTodoItem: ''
        }
    }
}
</script>

<style>

</style>