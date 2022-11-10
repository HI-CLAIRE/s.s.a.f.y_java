<template>
  <div v-if="video">
    <iframe width="560" height="315" :src="videoURL" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
  </div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  name: "YoutubeVideoDetail",
  computed: {
    ...mapState([
      'video',
    ]),
    videoURL() {
      const videoId = this.video.id.videoId
      return `https://www.youtube.com/embed/${videoId}`
    }
  }
}
</script>

<style>

</style>