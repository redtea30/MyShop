import {createApp} from 'vue'
import './style.css'
import App from './App.vue'
import router from "./rotuer"
import Antd from 'ant-design-vue';
import {createPinia} from "pinia";
import axios from "axios";
// import VueAxios from "vue-axios";

const pinia = createPinia()
const app = createApp(App)
// app.use(axios)
app.use(router)
app.use(Antd)
app.use(pinia)
app.mount('#app')