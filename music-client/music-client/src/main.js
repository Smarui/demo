import { createApp } from 'vue'
import App from './App.vue'
import axios from "axios";
import qs from "qs";



let curApp = createApp(App);
axios.defaults.baseURL='http://localhost:3013'

curApp.mount("#app")
curApp.config.globalProperties.$ajax = axios
curApp.config.globalProperties.$qs = qs