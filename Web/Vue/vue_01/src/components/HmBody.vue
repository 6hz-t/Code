<template>
    <div class="hm-body">
        <slot>aaaa</slot>

        <h3>Src</h3>
        <p v-loading="loading">{{ message }}</p>
    
        
        <!-- <button @click="cnt--">-</button>
        <span>{{cnt}}</span>
        <button @click="cnt++">+</button> -->

    </div>
 
</template>
<script>
    import axios from 'axios';
    export default {
       data() {  
            return {
                cnt:91,
                message:'aaaaa',
                loading: true,
            }
        },
        directives: {
           
            loading: {
                inserted(el,binding) {
                   binding.value ? el.classList.add('loading') : el.classList.remove('loading')
                }
            }
        },


       
        methods: {
            
        },
        async created() {
            var res = await axios.get("/api/good/getGoodList")
            this.message = res.data
        },
        mounted() {
        },
        beforeDestroy() {
            console.log("beforeDestroy")
        },
        beforeCreate() {
            console.log("beforeCreate")
        },
       
    }


</script>

<style scoped>

.loading {
   background: url('https://cdnjs.cloudflare.com/ajax/libs/gentelella/1.4.1/images/ajax-loader.gif') no-repeat center center;
    background-size: 100px 100px;
    height: 100px;
    width: 100px;
    margin: 0 auto;
}
.hm-body h3 {
    margin-top: 20px;
}
.hm-body p {
    margin-top: 20px;
    font-size: 20px;
    color: hsl(0, 0%, 20%);
}
.hm-body span {
    margin-top: 20px;
    font-size: 20px;
    color: hsl(0, 0%, 20%);
}
.hm-body button {
    margin-top: 20px;
    font-size: 20px;
    color: hsl(0, 0%, 20%);
    background-color: #c91212;
    font-family: Arial, sans-serif;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}
.hm-body {
    text-align: center;
    height: 300px;
    font-size: 30;
    background-color: #ffffff;
    font-family: Arial, sans-serif;
    color: hsl(0, 0%, 20%);
    padding: 20px;
}
p {
    text-align: center;
    font-size: 30;
    background-color: #ffffff;
    font-family: Arial, sans-serif;
    color: hsl(0, 0%, 20%);
    padding: 20px;
}

</style>
