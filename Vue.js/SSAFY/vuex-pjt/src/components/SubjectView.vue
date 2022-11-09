<template>
  <div>
    <button @click="addCount">{{ title }} 1 - {{ count }}</button>
    <button @click="addTenCount">{{ title }} 10 - {{ count }}</button>
    <button @click="addRandomCount">{{ title }} ? - {{ count }}</button>
    <button @click="asyncCount">{{ title }} 비동기 - {{ count }}</button>
  </div>
</template>

<script>
export default {
  name: "SubjectView",
  props: {
    title: String
  },
  data() {
    return {
      count: 0
    }
  },
  methods: {
    addCount() {
      this.count += 1;
      this.$store.dispatch('addOne')
    },
    addTenCount() {
      this.count += 10;

    },
    addRandomCount() {
      let num = Math.round(Math.random() * 100)
      this.count += num;
    },
    asyncCount() {
      this.count += 1;
      this.$store.dispatch('asyncAddOne')
    }
  }
}
</script>

<style>

</style>