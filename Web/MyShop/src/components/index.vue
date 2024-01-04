<script setup>
const headerStyle = {
  textAlign: 'center',
  // color: '#fff',
  // height: 64,
  // paddingInline: 50,
  // lineHeight: '64px',
  // backgroundColor: '#7dbcea',
  backgroundColor: '#fff',
};
const contentStyle = {
  textAlign: 'center',
  minHeight: 120,
  lineHeight: '120px',
  color: '#fff',
  backgroundColor: '#108119',
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
import Header from "@/components/index/Header.vue"
import Navigation from "@/components/index/Navigation.vue"
import LeftSider from "@/components/index/LeftSider.vue";
import Carousel from "@/components/index/Carousel.vue";
import RightSider from "@/components/index/RightSider.vue";
import NewItem from "@/components/index/NewItem.vue";
</script>

<template>
  <a-col :offset="2" :span="20">
    <a-space id="container" direction="vertical" :style="{ width: '100%' }" :size="[0, 48]">
      <a-layout>
        <a-layout-header :style="headerStyle">
          <Header></Header>
        </a-layout-header>
        <a-layout-content :style="menulist">
          <Navigation/>
        </a-layout-content>
        <!--    内容一    -->
        <a-layout id="content1">
          <a-layout-sider :style="siderStyle" width="240px">
            <leftSider></leftSider>
          </a-layout-sider>
          <a-layout-content :style="contentStyle" width="529px">
            <carousel></carousel>
          </a-layout-content>
          <a-layout-sider :style="siderStyle" width="220px">
            <RightSider></RightSider>
          </a-layout-sider>
        </a-layout>
        <!--   内容二部分     -->
        <a-layout-content :style="contentStyle">
          <NewItem></NewItem>
        </a-layout-content>
        <a-layout-footer :style="footerStyle">Footer</a-layout-footer>
      </a-layout>
    </a-space>
  </a-col>

</template>

<style scoped>
#content1 {
  height: 300px;
  width: 100%;
}


</style>