<template>
    <div class="demo01">
        <h3>Demo01</h3>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="item in data" :key="item.id">
                    <td>{{ item.id }}</td>
                    <td>{{ item.name }}</td>
                </tr>
            </tbody>
        </table>


    </div>
</template>
<script>
    export default {
        name: 'DemoOne',
        props: {
            data: {
                type: Array,
            }
        },
        data() {
            return {
            }
        },
        methods: {
        }
    }
</script>
<style scoped>
.demo01 {
    width: 100%;
    height: 100%;
    background-color: #ffffff;
    font-family: Arial, sans-serif;
    color: hsl(0, 0%, 20%);
    padding: 20px;
}
.demo01 h3 {
    margin-top: 20px;
}
table {
    width: 100%;
    border-collapse: collapse;
}
table th, table td {
    border: 1px solid #000;
    padding: 10px;
    text-align: left;
}
table th {
    background-color: #f2f2f2;
}
table tr:nth-child(even) {
    background-color: #f9f9f9;
}
table tr:hover {
    background-color: #f1f1f1;
}
table th {
    background-color: #4CAF50;
    color: white;
}
table td {
    background-color: #f2f2f2;
    color: black;
}
table tr:hover td {
    background-color: #ddd;
    color: black;
}
table tr:nth-child(even) td {
    background-color: #f9f9f9;
    color: black;
}
table tr:nth-child(odd) td {
    background-color: #f2f2f2;
    color: black;
}

</style>