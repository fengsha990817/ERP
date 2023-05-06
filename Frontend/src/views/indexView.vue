<template>
  <!--    <div >
          <el-container style="width: 100%">
              <el-header height="70px">
                  <div class="header">
                      <div class="logo" @click="router.push('/admin')">后台管理系统</div>
                      <div class="header-right">
                          <div class="header-user-con">
                              <el-dropdown class="user-name" trigger="click">
                          <span class="el-dropdown-link">
                              aaa
                              <el-icon class="el-icon&#45;&#45;right">
                                  <ArrowDown/>
                              </el-icon>
                          </span>
                                  <template #dropdown>
                                      <el-dropdown-menu>
                                          <a href="https://github.com/lin-xin/vue-manage-system" target="_blank">
                                              <el-dropdown-item>项目仓库</el-dropdown-item>
                                          </a>
                                          <el-dropdown-item command="user">个人中心</el-dropdown-item>
                                          <el-dropdown-item divided command="logout">退出登录</el-dropdown-item>
                                      </el-dropdown-menu>
                                  </template>
                              </el-dropdown>
                          </div>
                      </div>
                  </div>
              </el-header>

              <el-container>
                  <el-aside style="width: 200px;">
                      <el-menu style="">
                          <el-sub-menu index="1">
                              <template #title>
                                  <el-icon>
                                      <message/>
                                  </el-icon>
                                  一级菜单-1
                              </template>
                              <el-menu-item-group>
                                  <el-menu-item index="1-1" @click="router.push('/admin/test')">点击1</el-menu-item>
                                  <el-menu-item index="1-2" @click="router.push('/admin/test2')">点击2</el-menu-item>
                                  <el-menu-item index="1-3">Option 3</el-menu-item>
                                  <el-menu-item index="1-4">Option 4</el-menu-item>
                              </el-menu-item-group>
                          </el-sub-menu>
                          <el-sub-menu index="2">
                              <template #title>
                                  <el-icon>
                                      <message/>
                                  </el-icon>
                                  一级菜单-2
                              </template>
                              <el-menu-item-group>
                                  <el-menu-item index="2-1" @click="router.push('/admin/test')">点击1</el-menu-item>
                                  <el-menu-item index="2-2" @click="router.push('/admin/test2')">点击2</el-menu-item>
                                  <el-menu-item index="2-3">Option 3</el-menu-item>
                                  <el-menu-item index="2-4">Option 4</el-menu-item>
                              </el-menu-item-group>
                          </el-sub-menu>
                          <el-sub-menu index="3">
                              <template #title>
                                  <el-icon>
                                      <setting/>
                                  </el-icon>
                                  管理
                              </template>
                              <el-menu-item-group>
                                  <el-menu-item index="3-1" @click="logout()">退出登录</el-menu-item>
                                  <el-menu-item index="3-2">备用1</el-menu-item>
                                  <el-menu-item index="3-3">备用2</el-menu-item>
                              </el-menu-item-group>
                          </el-sub-menu>
                          <el-sub-menu index="4">
                              <template #title>
                                  <el-icon>
                                      <message/>
                                  </el-icon>
                                  一级菜单-4
                              </template>
                              <el-menu-item-group>
                                  <el-menu-item index="4-1" @click="router.push('/admin/test')">点击1</el-menu-item>
                                  <el-menu-item index="4-2" @click="router.push('/admin/test2')">点击2</el-menu-item>
                                  <el-menu-item index="4-3">Option 3</el-menu-item>
                                  <el-menu-item index="4-4">Option 4</el-menu-item>
                              </el-menu-item-group>
                          </el-sub-menu>
                      </el-menu>
                  </el-aside>
                  <el-container>
                      <el-main style="height: 100%">
                          <router-view/>
                      </el-main>
                  </el-container>
              </el-container>
          </el-container>
      </div>-->
    <div class="common-layout">
        <el-container>
            <el-container>
                <div class="header" style="height: 8%; width: 100%">
                    <el-header  height="70px">
                        <div class="logo" @click="router.push('/admin')">后台管理系统</div>
                        <div class="header-right">
                            <div class="header-user-con">
                                <el-dropdown class="user-name" trigger="click">
                        <span class="el-dropdown-link">
                            aaa
                            <el-icon class="el-icon&#45;&#45;right">
                                <ArrowDown/>
                            </el-icon>
                        </span>
                                    <template #dropdown>
                                        <el-dropdown-menu>
                                            <a href="https://github.com/lin-xin/vue-manage-system" target="_blank">
                                                <el-dropdown-item>项目仓库</el-dropdown-item>
                                            </a>
                                            <el-dropdown-item command="user">个人中心</el-dropdown-item>
                                            <el-dropdown-item divided command="logout">退出登录</el-dropdown-item>
                                        </el-dropdown-menu>
                                    </template>
                                </el-dropdown>
                            </div>
                        </div>
                    </el-header>
                </div>
            </el-container>
            <el-container>
                <el-aside width="150px">
                    <el-scrollbar height="650px">
                        <el-menu>
                            <el-sub-menu index="1">
                                <template #title>
                                    <el-icon>
                                        <message/>
                                    </el-icon>
                                    一级菜单-1
                                </template>
                                <el-menu-item-group>
                                    <el-menu-item index="1-1" @click="router.push('/admin/test')">点击1</el-menu-item>
                                    <el-menu-item index="1-2" @click="router.push('/admin/test2')">点击2</el-menu-item>
                                    <el-menu-item index="1-3">Option 3</el-menu-item>
                                    <el-menu-item index="1-4">Option 4</el-menu-item>
                                </el-menu-item-group>
                            </el-sub-menu>
                            <el-sub-menu index="2">
                                <template #title>
                                    <el-icon>
                                        <message/>
                                    </el-icon>
                                    一级菜单-2
                                </template>
                                <el-menu-item-group>
                                    <el-menu-item index="2-1" @click="router.push('/admin/test')">点击1</el-menu-item>
                                    <el-menu-item index="2-2" @click="router.push('/admin/test2')">点击2</el-menu-item>
                                    <el-menu-item index="2-3">Option 3</el-menu-item>
                                    <el-menu-item index="2-4">Option 4</el-menu-item>
                                </el-menu-item-group>
                            </el-sub-menu>
                            <el-sub-menu index="3">
                                <template #title>
                                    <el-icon>
                                        <setting/>
                                    </el-icon>
                                    管理
                                </template>
                                <el-menu-item-group>
                                    <el-menu-item index="3-1" @click="logout()">退出登录</el-menu-item>
                                    <el-menu-item index="3-2">备用1</el-menu-item>
                                    <el-menu-item index="3-3">备用2</el-menu-item>
                                </el-menu-item-group>
                            </el-sub-menu>
                            <el-sub-menu index="4">
                                <template #title>
                                    <el-icon>
                                        <message/>
                                    </el-icon>
                                    一级菜单-4
                                </template>
                                <el-menu-item-group>
                                    <el-menu-item index="4-1" @click="router.push('/admin/test')">点击1</el-menu-item>
                                    <el-menu-item index="4-2" @click="router.push('/admin/test2')">点击2</el-menu-item>
                                    <el-menu-item index="4-3">Option 3</el-menu-item>
                                    <el-menu-item index="4-4">Option 4</el-menu-item>
                                </el-menu-item-group>
                            </el-sub-menu>
                        </el-menu>
                    </el-scrollbar>

                </el-aside>
                <el-container>
                    <el-main>Main</el-main>
                </el-container>
            </el-container>
            <el-footer/>
        </el-container>
    </div>
</template>
<script setup>
import {service, post} from "@/net";
import {ElMessage} from "element-plus";
import router from "@/router";
import {onMounted, reactive} from "vue";
import {Message, Setting, ArrowDown} from '@element-plus/icons-vue'
import { useCookies } from '@vueuse/integrations/useCookies'

const cookies = useCookies(['locale'])

let xsrf_check = reactive({
    "xsrf-token": cookies.get('XSRF-TOKEN'),
    "csrf-token": cookies.get('XSRF-TOKEN')
})

const logout = () => {
    post("/api/auth/logout", null,(message) => {
        ElMessage.success(message)
        document.cookie = "";
        router.push("/")
    })
}
onMounted(() => {

    let csrf = cookies.get('XSRF-TOKEN')
    console.log(csrf)
    post('/api/check', xsrf_check, () => {
    }, (message) => {
        ElMessage.error(message)
        router.push("/")
    }, (message) => {
        ElMessage.error(message)
        // router.push("/")
    }, csrf)
})
</script>

<style scoped>
.header {
    position: relative;
    box-sizing: border-box;
    font-size: 22px;
    color: #fff;
}

.header .logo {
    float: left;
    width: 250px;
    line-height: 70px;
    margin-left: 30px;
}

.header-right {
    float: right;
    padding-right: 50px;
}

.header-user-con {
    display: flex;
    height: 70px;
    align-items: center;
}

.btn-fullscreen {
    transform: rotate(45deg);
    margin-right: 5px;
    font-size: 24px;
}

.btn-bell,
.btn-fullscreen {
    position: relative;
    width: 30px;
    height: 30px;
    text-align: center;
    border-radius: 15px;
    cursor: pointer;
    display: flex;
    align-items: center;
}

.btn-bell-badge {
    position: absolute;
    right: 4px;
    top: 0px;
    width: 8px;
    height: 8px;
    border-radius: 4px;
    background: #f56c6c;
    color: #fff;
}


.user-name {
    margin-left: 10px;
}

.el-dropdown-link {
    color: #fff;
    cursor: pointer;
    display: flex;
    align-items: center;
}

</style>