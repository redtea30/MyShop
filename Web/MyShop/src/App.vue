<template>
  <RouterView></RouterView>
</template>

<style>
/*全局去除所有边框*/
body {
  margin: 0;
  padding: 0;
}
</style>
<script>
// 这几条是为了设置国际化
import {ref} from 'vue'
import zhCN from 'ant-design-vue/es/locale/zh_CN';

const locale = ref(zhCN)
</script>
