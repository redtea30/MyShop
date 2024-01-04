<template>
  <a-list :grid="{ gutter: 16, column: 4 }" :data-source="data">
    <template #renderItem="{ item }">
      <a-list-item>
        <a-card>
          <a-image
              :src="item.img" ;
          />
        </a-card>
      </a-list-item>
    </template>
  </a-list>
</template>
<script setup>
const data = [
  {
    img: 'src/assets/1.jpg',
  },
  {
    img: 'src/assets/2.jpg',
  },
  {
    img: 'src/assets/3.jpg',
  },
  {
    img: 'src/assets/4.jpg',
  },
];
</script>