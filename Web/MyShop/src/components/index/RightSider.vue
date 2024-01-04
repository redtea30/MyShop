<template>
  <a-list size="small" bordered :data-source="data" style="max-height: 300px;overflow: auto">
    <template #renderItem="{ item }">
      <a-list-item>{{ item }}</a-list-item>
    </template>
    <template #header>
      <div>商品推荐</div>
    </template>
    <template #footer>
      <div>Footer</div>
    </template>
  </a-list>

</template>
<script setup>
const data = [
  'Racing car sprays burning fuel into crowd.',
  'Japanese princess to wed commoner.',
  'Australian walks 100km after outback crash.',
  'Man charged over missing wedding girl.',
  'Los Angeles battles huge wildfires.',
];
</script>
<style scoped>
a-list {
  height: 300px;
  max-height: 300px;
}
</style>