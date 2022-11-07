<template>
  <div>
    
  </div>
</template>

<script>

export default {
  name: 'YoutubeVi',
  props: {
    videos: {
      type: Array,
      required: true,
    }
  },
  components: {
    YoutubeVideoItem,
  }
}
</script>

<style>

</style>