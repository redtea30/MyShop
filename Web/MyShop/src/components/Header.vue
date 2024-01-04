<script setup>
import HeaderSearch from "@/components/HeaderSearch.vue";
import ShopCart from "@/components/ShopCart.vue";
</script>

<template>
  <!--  flex 容器并排方式-->
  <a-flex>
    <img src="@/assets/logo.png">
    <h1>kfm在线商城</h1>
    <a-col :offset="5" :span="5">
      <header-search></header-search>
    </a-col>
    <a-col :offset="5">
      <a-flex>
        <shop-cart></shop-cart>
        <h1>search partner</h1>
      </a-flex>

    </a-col>
  </a-flex>


</template>

<style scoped>
img {
  width: 50px;
  height: 50px;
}

h1 {
  line-height: 15px;
}

</style>