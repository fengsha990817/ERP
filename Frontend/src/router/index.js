import { createRouter, createWebHistory } from 'vue-router'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'login',
      component: () => import('@/views/LoginPage.vue')
    },{
      path: '/register',
      name: 'register',
      component: () => import('@/views/RegisterPage.vue')
    },{
      path: '/admin',
      name: 'admin',
      component:()=> import('@/views/indexView.vue'),
      children:[
        {
          path: "test",
          component: () => import("@/components/test.vue")
        },{
          path: "test2",
          component: () => import('@/components/test2.vue')
        }
      ]
    }/*,{
      path: '/index',
      name: 'index',
      component:()=> import('@/views/indexView.vue'),
      children:[
        {
          path: "test",
          name: "test",
          component: () => import('@/components/welcome/test.vue')
        },{
          path: "test2",
          name: "test2",
          component: () => import('@/components/welcome/test2.vue')
        }
      ]
    }*/
  ]
})

export default router
