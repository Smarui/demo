<template>
<input type="text" v-model="ss" @keyup.enter="myVueTest">
</template>

<script>
export default {
  name: "MyVue",
  data(){
    return{
      userPass:"123",
      userCount:"smallrui"
    }
  },
  methods:{

    login:function () {

    }
  }

}
</script>

<style scoped>

</style>