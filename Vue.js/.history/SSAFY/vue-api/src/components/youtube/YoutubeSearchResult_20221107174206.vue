<template>
  <div>
    <h3>결과</h3>
    <ul class="youtube-list">
      <youtube-video-item v-for="video in videos" :key="video.id.videoId" :video="video" @click-video="clickVideo"></youtube-video-item>
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
  },
  methods: {
    clickVideo(value)
  }
}
</script>

<style scoped>
  .youtube-list {
    text-align: left;
  }
</style>