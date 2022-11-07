<template>
  <div>
    <h2>유튜브전용 view</h2>
    <youtube-search @search-input="search"></youtube-search>
    <youtube-search-result :videos=""></youtube-search-result>
  </div>
</template>

<script>
import YoutubeSearch from '@/components/youtube/YoutubeSearch.vue';
import YoutubeSearchResult from '@/components/youtube/YoutubeSearchResult.vue';
import axios from 'axios';

export default {
  name: "YoutubeView",
  components: {
    YoutubeSearch,
    YoutubeSearchResult,
  },
  data() {
    return {
      videos: [],
    }
  },
  methods: {
    search(value) {
      const API_URL = `https://www.googleapis.com/youtube/v3/search`;
      const YOUTUBE_KEY = process.env.VUE_APP_YOUTUBE_API_KEY;

      axios({
        url: API_URL,
        params: {
          key: YOUTUBE_KEY,
          part: 'snippet',
          q: value,
          type: 'video',
          maxResults: 10,
        }
      })
        .then((res) => {
          this.videos = res.data.items;
        })
        .catch((err) => console.log(err));
    }
  }
}
</script>
<style>
  h2 {
    color: red;
  }

</style>
