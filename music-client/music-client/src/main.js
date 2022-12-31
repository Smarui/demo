import { createApp } from 'vue'
import App from './App.vue'
import axios from "axios";
import qs from "qs";
import router from "./router/router";




const curApp = createApp(App);
axios.defaults.baseURL='http://localhost:3013'
curApp.config.globalProperties.$ajax = axios
curApp.config.globalProperties.$qs = qs
curApp.use(router).mount("#app")
// createApp(App).use(element).use(router).mount("#app")
