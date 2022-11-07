<template>
  <h3>결과</h3>
    <ul>
      <youtube-video-item v-for="video in videos" :key="video.id.videoId"></youtube-video-item>
    </ul>
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
  }
}
</script>

<style>

</style>