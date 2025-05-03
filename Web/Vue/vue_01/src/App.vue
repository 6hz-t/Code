<template>
  <div class="app">
    <Body></Body>
    
    
  </div>
</template>


<style>
.app {
  width: 100%;
  height: 100%;
  background-color: #000000;
  font-family: Arial, sans-serif;
  color: hsl(0, 0%, 20%);
  padding: 20px;
}
</style>


<script>

import Body from './components/HmBody.vue';
export default {
  name: 'App',
  components: {
    Body,
  }
}

</script>