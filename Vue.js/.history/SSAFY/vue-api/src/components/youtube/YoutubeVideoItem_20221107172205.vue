<template>
  <div>
    
  </div>
</template>

<script>
import YoutubeVideoItem from '@/components/youtube/YoutubeVideoItem.vue'

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