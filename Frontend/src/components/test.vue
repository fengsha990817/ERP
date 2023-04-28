<template>
    <el-table
            :data="tableData"
            stripe
            border
    >
        <el-table-column prop="date" label="Date" width="140"/>
        <el-table-column prop="name" label="Name" width="120"/>
        <el-table-column prop="address" label="Address"/>
        <el-table-column prop="name" label="Name" width="120"/>
        <el-table-column prop="address" label="Address"/>
        <el-table-column prop="name" label="Name" width="120"/>
        <el-table-column prop="address" label="Address"/>
    </el-table>

</template>

<script setup lang="ts">
import {ref, reactive, defineComponent} from 'vue';
import {ElMessage, ElMessageBox} from 'element-plus';
import {Delete, Edit, Search, Plus} from '@element-plus/icons-vue';
import {} from "vue";

const item = {
    date: '2016-05-02',
    name: 'Tom',
    address: 'No. 189, Grove St, Los Angeles',
}
const tableData = Array.from({length: 100}).fill(item)

</script>

<style scoped>
.handle-box {
    margin-bottom: 20px;
}

.handle-select {
    width: 120px;
}

.handle-input {
    width: 300px;
}

.table {
    width: 100%;
    font-size: 14px;
}

.red {
    color: #F56C6C;
}

.mr10 {
    margin-right: 10px;
}

.table-td-thumb {
    display: block;
    margin: auto;
    width: 40px;
    height: 40px;
}
</style>