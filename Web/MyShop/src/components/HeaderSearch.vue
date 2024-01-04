<script setup>
export default {
  name: 'HeaderSearch',
  data() {
    return {
      keyword: ''
    }
  },
  methods: {
    search() {
      if (this.keyword != this.$route.query.wd) {
        this.$router.push({path: '/search', query: {wd: this.keyword}})
      }
    }
  }
}


</script>

<template>
  <div class="headerSearch" v-model="keyword">
    <button @click="search">搜索</button>

  </div>
</template>
