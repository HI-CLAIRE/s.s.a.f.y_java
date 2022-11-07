<template>
  <div>
    <h3>결과</h3>
    <ul>
      <youtube-video-item v-for="video in videos" :key="video.id.videoId" :video></youtube-video-item>
    </ul>
  </div>
</template>

<script>
import YoutubeVideoItem from '@/components/youtube/YoutubeVideoItem.vue'

export default {
  name: "YoutubeSearchResult",
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