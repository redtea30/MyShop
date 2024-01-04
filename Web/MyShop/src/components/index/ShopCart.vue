<script setup>
import {ShoppingCartOutlined} from '@ant-design/icons-vue';
</script>

<template>
  <!--  这个按钮作为外边框-->
  <a-button style="width: 150px;height: 40px;margin-top:5px" type="primary" ghost>
    <!--    这个座位内部的样式-->

    <ShoppingCartOutlined
        :style="{ fontSize: '33px',color: '#111'}"
        align-self="top"
    />
    <span style="font-size: 20px;
    vertical-align: super;
    font-weight: 500">购物车</span>
  </a-button>


</template>
