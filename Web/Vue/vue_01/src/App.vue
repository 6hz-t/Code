<template>
  <div class="app">
    <Header></Header>
    <Body></Body>
    <Footer></Footer>
  
    
  </div>
</template>


<style>
.app {
  background-color: #000000;
  font-family: Arial, sans-serif;
  color: hsl(0, 0%, 20%);
  padding: 20px;
}
</style>


<script>
import Header from './components/HmHeader.vue';
import Footer from './components/HmFooter.vue';
import Body from './components/HmBody.vue';
export default {
  name: 'App',
  components: {
    Header: Header,
    Footer,
    Body
  }
}

</script>