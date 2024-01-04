<script setup>
const headerStyle = {
  textAlign: 'center',
  color: '#fff',
  height: 64,
  paddingInline: 50,
  lineHeight: '64px',
  backgroundColor: '#7dbcea',
};
const contentStyle = {
  textAlign: 'center',
  minHeight: 120,
  lineHeight: '120px',
  color: '#fff',
  backgroundColor: '#108ee9',
};
const menulist = {
  textAlign: 'center',
  minHeight: 20,
  lineHeight: '30px',
  color: '#fff',
  backgroundColor: '#108ee9',
};

const siderStyle = {
  textAlign: 'center',
  lineHeight: '120px',
  color: '#fff',
  backgroundColor: '#3ba0e9',
};
const footerStyle = {
  textAlign: 'center',
  color: '#fff',
  backgroundColor: '#7dbcea',
};
import Header from "@/components/Header.vue"
</script>

<template>
  <!--  通过对显示容器进行栅格化整体居中-->
  <a-col :offset="2" :span="20">
    <a-space id="container" direction="vertical" :style="{ width: '100%' }" :size="[0, 48]">
      <a-layout>
        <a-layout-header :style="headerStyle">
          <Header></Header>
        </a-layout-header>
        <a-layout-content :style="menulist">菜单</a-layout-content>
        <a-layout-content :style="contentStyle">内容1</a-layout-content>
        <a-layout-content :style="contentStyle">内容2</a-layout-content>
        <a-layout-footer :style="footerStyle">Footer</a-layout-footer>
      </a-layout>
    </a-space>
  </a-col>

</template>

<style scoped>

</style>