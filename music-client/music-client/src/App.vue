<template>
  <input type="text" v-model="userCount"  ><br>
  <input type="password" v-model="userPass"><br>
  <input type="button" value="登录" @click="login()">
</template>


<script>


export default {
  data(){
    return{
      userCount:"",
      userPass:"",
      curData:{
        "userCount":this.userCount,
        "userPass":this.userPass
      }
    }
  },
  methods:{
    async login(){
      var params = new URLSearchParams();
      params.append('userCount' , this.userCount);
      params.append('userPass' , this.userPass)
      this.$qs.stringify(params)
      let response = await this.$ajax.post("/user/login" , params
        );
      console.log(response)
    }
  }
}

</script>

<style lang="less">

</style>