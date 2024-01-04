import {createRouter, createWebHashHistory} from 'vue-router'

// 在这里导入页面组件
import Index from "@/components/index.vue"

// 这里都是导入的东西


// 这里进行页面注册
const routes = [
    {path: "/", redirect: 'index'},
    {path: "/index", component: Index},
    // 通配符设置
    // {path: "/:catchAll(.*)", component: NotFound},

];

// 创建一个路由器实例，这里没有使用hash history
const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

// todo 路由守卫，根据登陆的状态确认是否能进行跳转


// 导出路由
export default router;


