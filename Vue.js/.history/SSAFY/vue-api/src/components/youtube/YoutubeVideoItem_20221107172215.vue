<template>
  <div>
    
  </div>
</template>

<script>

export default {
  name: 'YoutubeSearchResult',
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