<template>
    <section>
        <ul>
            <li v-for="todoItem in todoItems" v-bind:key="todoItem">{{ todoItem }}</li>
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

<style scoped>
    ul {
        list-style-type: none;
        padding-left: 0px;
        margin-top: 0;
        text-align: left;
    }
    li {
        display: flex;
        min-height: 50px;
        height: 50px;
        line-height: 50px;
        margin: 0.5rem 0;
        padding: 0 0.9rem;
        background: white;
        border-radius: 5px;
    }
    .checkBtn {
        line-height: 45px;
        color: #62acde;
        margin-right: 5px;
    }
    .removeBtn {
        margin-left: auto;
        color: ;
    }
</style>