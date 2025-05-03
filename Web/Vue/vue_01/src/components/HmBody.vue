<template>
    <div class="hm-body">
    
        
        <button @click="cnt--">-</button>
        <span>{{cnt}}</span>
        <button @click="cnt++">+</button>

    </div>
 
</template>
<script>
    export default {
       data() {  
            return {
                cnt:9,
            }
        },
       
    }


</script>

<style scoped>
.hm-body {
    text-align: center;
    height: 300px;
    font-size: 30;
    background-color: #ffffff;
    font-family: Arial, sans-serif;
    color: hsl(0, 0%, 20%);
    padding: 20px;
}

</style>
