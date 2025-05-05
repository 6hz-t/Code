<template>
  <div class="app">
    <DemoOne :data="objlist"></DemoOne>
    
    
    
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


import Demo from './components/DemoOne.vue';
export default {
  name: 'App',
  components: {
    DemoOne: Demo,
  }
  ,data() {
    return {
     objlist : [
        {id: 1,name: 'HHHHHH',},
        {id: 2,name: 'SSSSSS',},
        {id: 3,name: 'AAAAAA',},
      ],
    }
  },
}

</script>