import axios from 'axios'
import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  // (3)
  state: {
    videos: [],
    video: null,
  },
  getters: {
  },
  // (2)
  mutations: {
    SEARCH_YOUTUBE(state, videos) {
      state.videos = videos
    },
    CLICK_VIDEO(state, video) {
      state.video = video
    }
  },
  // (1)
  actions: {
    searchYoutube({commit}, payload) {
      const API_URL = `https://www.googleapis.com/youtube/v3/search`;
      const YOUTUBE_KEY = process.env.VUE_APP_YOUTUBE_API_KEY;

      axios({
        url: API_URL,
        params: {
          key: YOUTUBE_KEY,
          part: 'snippet',
          q: payload,
          type: 'video',
          maxResults: 10,
        }
      })
        .then((res) => {
          commit("SEARCH_YOUTUBE", res.data.items)
        })
        .catch((err) => console.log(err));
    },
    clickVideo({commit}, payload) {
      commit("CLICK_VIDEO", payload)
    }
  },
  modules: {
  }
})
