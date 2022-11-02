// 전역 컴포넌트 등록하기
Vue.component('todo-footer', {
  template: '<p>This is another global child component</p>'
})

var localcmp = {
  template: '<p>This is another local chid component</p>'
}

var app = new Vue({
  el: '#app',
  data: {
    message: 'This is a parent component'
  },
  components: {
    'todo-list': localcmp 
  }
})