<template>
  <a-menu id="menu"
          v-model:selectedKeys="current"
          mode="horizontal"
          :items="items"
  />
</template>
<script setup>
import {h, ref} from 'vue';
import {MailOutlined, AppstoreOutlined, SettingOutlined} from '@ant-design/icons-vue';

// const current = ref(['mail']);

const items = ref([
  {
    key: 'mail',
    // icon: () => h(MailOutlined),
    label: '活动',
    title: 'Navigation One',
  },
  {
    key: 'app',
    // icon: () => h(AppstoreOutlined),
    label: '秒杀',
    title: 'Navigation Two',
  },
  {
    key: 'sub1',
    // icon: () => h(SettingOutlined),
    label: '热门',
    title: 'Navigation Three - Submenu',

  },
]);
const paddinginline = "100px";

</script>
<style scoped>
#menu {
  display: inline-block;
  width: 500px;
  font-size: 18px;
}

/*todo 这里的没法调整间距*/

</style>