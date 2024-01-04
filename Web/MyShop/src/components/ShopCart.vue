<script setup>
import {ShoppingCartOutlined} from '@ant-design/icons-vue';
</script>

<template>
  <!--  这个按钮作为外边框-->
  <a-button style="width: 150px;
  height: 50px;
  text-align: center;
  align-self: center;"
            ghost>
    <!--    这个座位内部的样式-->

    <ShoppingCartOutlined
        :style="{ fontSize: '40px'}"
    />
    <span style="font-size: 20px;vertical-align: super">购物车</span>
  </a-button>


</template>
