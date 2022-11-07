<template>
  <div>
    <li @click="">
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
  }
}
</script>

<style>

</style>