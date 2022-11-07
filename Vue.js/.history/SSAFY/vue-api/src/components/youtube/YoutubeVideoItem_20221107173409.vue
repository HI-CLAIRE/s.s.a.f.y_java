<template>
  <div>
    <li>
      <img :src="video.snippet.thumbnails.default.url" alt="">
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