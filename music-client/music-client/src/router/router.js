import { createRouter , createWebHashHistory } from 'vue-router'

const musicRouter = createRouter(
    {
        history:createWebHashHistory(),

        routes:[
            {
                path:"Music-main" , component:"MusicMain"
            }
        ]


    }
);
export default musicRouter