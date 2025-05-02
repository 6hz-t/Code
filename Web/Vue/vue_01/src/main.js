import Vue from 'vue'
import App from './App.vue'
import btn from'./components/HmButton.vue'

Vue.config.productionTip = false

Vue.component('HmButton', btn)


//Vue实例化
new Vue({
  render: h => h(App),
}).$mount('#app')
