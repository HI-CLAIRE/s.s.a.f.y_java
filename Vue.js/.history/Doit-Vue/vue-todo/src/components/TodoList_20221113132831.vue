<template>
    <section>
        <ul>
            <li v-for="todoItem in todoItems" v-bind>{{ todoItem }}</li>
        </ul>
    </section>
</template>

<script>
export default {
    data() {
        return {
            todoItems: []
        }
    },
    created() {
        if(localStorage.length > 0) {
            for(let i=0; i<localStorage.length; i++) {
                this.todoItems.push(localStorage.key(i));
            }
        }
    }
}
</script>

<style>

</style>