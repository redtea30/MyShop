<script setup>
import HeaderSearch from "@/components/index/HeaderSearch.vue";
import ShopCart from "@/components/index/ShopCart.vue";
import Login from "@/components/index/Login.vue";
import Logo from "@/components/index/Logo.vue"
</script>

<template>
  <!--  flex 容器并排方式-->
  <a-flex id="container">
    <a-col :offset="0" :span="5">
      <Logo></Logo>
    </a-col>
    <a-col :offset="6" :span="5">
      <header-search></header-search>
    </a-col>
    <a-col :offset="1" :span="7">
      <a-flex>
        <shop-cart/>
        <Login/>
      </a-flex>

    </a-col>
  </a-flex>


</template>

<style scoped>


#container {
  margin-top: 10px;
  margin-left: 0;
}

</style>