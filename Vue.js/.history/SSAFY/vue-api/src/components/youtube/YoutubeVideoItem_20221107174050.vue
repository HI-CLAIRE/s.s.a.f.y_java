<template>
  <div>
    <li @click="clickVideo">
      <img :src="video.snippet.thumbnails.default.url">
      {{ video.snippet.title }}
    </li>
  </div>
</template>

<script>

export default {
  name: 'YoutubeVideoItem',
  props: {
    video: {
      type: Object,
      required: true,
    }
  },
  methods: {
    clickVideo() {
      this.$emit()
    }
  }
}
</script>

<style>

</style>