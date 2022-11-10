import Vue from 'vue'
import Vuex from 'vuex'
import createPersistedState from "vuex-persistedstate";

Vue.use(Vuex)

export default new Vuex.Store({
  plugins: [createPersistedState()],
  state: {
    todos: []
  },
  getters: {
    // doneTodosCount(state) {
    //   let cnt = 0;
    //   for(let i=0; i<state.todos.length; i++) {
    //     if(state.todos[i].done)
    //       cnt++;
    //   }
    //   return cnt;
    // }
    doneTodosCount(state) {
      return state.todos.filter( todo => todo.done ).length
    },
    undoneTodosCount(state) {
      return state.todos.filter( todo => !todo.done ).length
    },
  },
  mutations: {
    CREATE_TODO(state, todoItem) {
      state.todos.push(todoItem)
    }, 
    UPDATE_TODO(state, todoItem) {
      const index = state.todos.indexOf(todoItem)
      state.todos[index].done = !state.todos[index].done
    },
    DELETE_TODO(state, todoItem) {
      const index = state.todos.indexOf(todoItem)
      state.todos.splice(index, 1);
    }
  },
  actions: {
    createTodo({commit}, payload) {
      commit('CREATE_TODO', payload)
    },
    updateTodo({commit}, payload) {
      commit('UPDATE_TODO', payload)
    },
    deleteTodo({commit}, payload) {
      if(confirm("정말로 지울꺼니?")) {
        commit('DELETE_TODO', payload)
      }
    }
  },
  modules: {
  }
})
