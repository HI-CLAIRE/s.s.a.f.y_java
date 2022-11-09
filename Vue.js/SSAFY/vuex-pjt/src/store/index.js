import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    // 공통된 데이터가 저장되는 영역
    total: 0
  },
  getters: {
    // state를 이용하여 값을 새롭게 뿌려주고 싶을때 computed와 같은 역할을 함
    countMsg(state) {
      let msg = '10회 '
      if(state.total > 10)
        msg += '초과'
      else
        msg += '이하'
      return `${msg} 호출됨`
    }
  },
  mutations: {
    // state를 변경하는 유일한 방법 / 동기적으로 작성해야 한다.
    ADD_ONE(state) {
      state.total += 1
    },
    ADD_TEN(state, payload) {
      state.total += payload
    },
    ADD_RANDOM(state, payload) {
      state.total += payload.num
    }
  },
  actions: {
    // mutation을 호출 / back과 비동기 통신을 하는 곳
    addOne({commit}) {
      commit('ADD_ONE')
    },
    asyncAddOne(context) {
      setTimeout(() => {
        context.commit('ADD_ONE')
      }, 3000)
    }
  },
  modules: {
    // 여러개로 기능을 쪼개 놓았을 때 등록해서 관리하는 느낌
  }
})
