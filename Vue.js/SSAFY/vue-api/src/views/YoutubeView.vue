<template>
  <div>
    <h2>유튜브전용 view</h2>
    <youtube-search></youtube-search>
    <hr>
    <youtube-video-detail></youtube-video-detail>
    <hr>
    <youtube-search-result></youtube-search-result>
  </div>
</template>

<script>
import YoutubeSearch from '@/components/youtube/YoutubeSearch.vue';
import YoutubeSearchResult from '@/components/youtube/YoutubeSearchResult.vue';
import YoutubeVideoDetail from '@/components/youtube/YoutubeVideoDetail.vue';

export default {
  name: "YoutubeView",
  components: {
    YoutubeSearch,
    YoutubeSearchResult,
    YoutubeVideoDetail,
  },
}
</script>
<style>
  h2 {
    color: red;
  }

</style>
