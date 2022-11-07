<template>
  <div>
    <li>
      <img :src="video.snippet." alt="">
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