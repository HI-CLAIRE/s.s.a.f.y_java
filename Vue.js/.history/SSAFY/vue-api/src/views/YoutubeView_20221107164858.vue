<template>
  <div>
    <h2>유튜브전용 view</h2>
    <youtube-search @search-input="search"></youtube-search>
  </div>
</template>

<script>
import YoutubeSearch from '@/components/youtube/YoutubeSearch.vue';
import axios from 'axios';

export default {
  name: "YoutubeView",
  components: {
    YoutubeSearch,
  },
  methods: {
    search(value) {
      const API_URL = `https://www.googleapis.com/youtube/v3/search`;
      const YOUTUBE_KEY = process.env.VUE_APP_YOUTUBE_API_KEY;

      axios({
        url: API_URL,
        
      })
    }
  }
}
</script>
<style>
  h2 {
    color: red;
  }

</style>
