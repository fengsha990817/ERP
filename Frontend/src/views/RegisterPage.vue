<!--
<template>
  <div style="text-align: center; margin: 0 20px">
    <div style=" margin-top: 100px">
      <div style="font-size: 30px; font-weight: bold">登录</div>
      <div style="margin-top: 50px">
        <el-input v-model="form.username" type="text" placeholder="用户名">
          <template #prefix>
            <el-icon><User /></el-icon>
          </template>
        </el-input>
        <el-input v-model="form.password" type="password" style="margin-top: 10px" placeholder="密码">
          <template #prefix>
            <el-icon><Lock /></el-icon>
          </template>
        </el-input>
      </div>
      <el-row style="margin-top: 5px">
        <el-col :span="12" style="text-align: left">
          <el-checkbox v-model="form.remember" label="记住我" size="large" />
        </el-col>
        <el-col :span="12" style="text-align: right">
          <el-link>忘记密码</el-link>
        </el-col>
      </el-row>
      <div style="margin-top: 30px">
        <el-button @click="login" type="success" style="width: 270px; height: 40px">立即登录</el-button>
      </div>
      <el-divider >
        <span style="color: gray; font-size: 10px">没有账号？</span>
      </el-divider>
      <div style="margin-top: 30px">
        <el-button @click="router.push('/register')" type="warning" style="width: 270px; height: 40px">注册账号</el-button>
      </div>
    </div>
  </div>
</template>
-->
<template>
    <div class="login-wrap">
        <div class="ms-login">
            <div class="ms-title">账号注册</div>
            <el-form :model="param" ref="login" label-width="0px" class="ms-content">
                <el-form-item prop="corporation">
                    <el-input
                        v-model="param.corporation"
                        placeholder="公司名称">
                        <template #prepend>
                            <el-button :icon="OfficeBuilding"></el-button>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item prop="username">
                    <el-input
                        v-model="param.username"
                        placeholder="用户名">
                        <template #prepend>
                            <el-button :icon="User"></el-button>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item prop="password">
                    <el-input
                        v-model="param.password"
                        type="password"
                        placeholder="密码">
                        <template #prepend>
                            <el-button :icon="Lock"></el-button>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item prop="password">
                    <el-input
                        v-model="param.password_temp"
                        type="password"
                        placeholder="再次输入密码"
                        @focusout="checkPassword()">
                        <template #prepend>
                            <el-button :icon="Lock"></el-button>
                        </template>
                    </el-input>
                </el-form-item>
                <el-form-item prop="email">
                    <el-input
                        v-model="param.email"
                        type="email"
                        placeholder="注册邮箱">
                        <template #prepend>
                            <el-button :icon="Message"></el-button>
                        </template>
                    </el-input>
                </el-form-item>
                <div class="login-btn">
                    <el-button type="success" @click="register()">注册</el-button>
                </div>
                <div class="login-btn">
                    <span style="font-size: 8px; color: darkgray">已经有账号了？</span>
                    <el-button style="margin-top: 5px" type="info" @click="router.push('/')" >返回登陆界面</el-button>
                </div>
            </el-form>
        </div>
    </div>
</template>


<script setup>
import {User, Lock, OfficeBuilding, Message} from '@element-plus/icons-vue'
import {reactive} from "vue";
import {ElMessage} from "element-plus";
import {post} from "@/net";
import router from "@/router";

const param = reactive({
    corporation: '',
    username: '',
    password: '' ,
    password_temp: '' ,
    email: ''
})

const register = ()=>{
    if(!param.username || !param.password){
        ElMessage.warning('请填写用户名与密码！')
    }else{
        post('/api/auth/login', {
            username: param.username,
            password: param.password,
        }, (data)=>{
            ElMessage.success(data.message)
            // let token =
            router.push('/index')
        })
    }
}

const checkPassword = ()=>{
    if(param.password !== param.password_temp){
        ElMessage.warning("两次输入的密码不匹配，请检查输入！")
    }
}

</script>
<style scoped>
.login-wrap {
    position: relative;
    width: 100%;
    height: 100%;
    background-size: 100%;
    background: #324157;
}
.ms-title {
    width: 100%;
    line-height: 50px;
    text-align: center;
    font-size: 20px;
    color: #fff;
    border-bottom: 1px solid #ddd;
}
.ms-login {
    position: absolute;
    left: 50%;
    top: 50%;
    width: 350px;
    margin: -200px 0 0 -175px;
    border-radius: 5px;
    background: rgba(255, 255, 255, 0.3);
    overflow: hidden;
}
.ms-content {
    padding: 30px 30px;
}
.login-btn {
    text-align: center;
}
.login-btn button {
    width: 100%;
    height: 36px;
    margin-bottom: 10px;
}
</style>

