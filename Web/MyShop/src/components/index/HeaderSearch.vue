<script>
export default {
  name: 'HeaderSearch',
  data() {
    return {
      keyword: ''
    }
  },
  methods: {
    search() {
      // 这里先验证一次keyword就是为了防止空输入
      if (this.keyword && this.keyword !== this.$route.query.wd) {
        this.$router.push({path: '/search', query: {wd: this.keyword}});
      }
    }
  }
}

</script>

<template>

  <a-input-search
      class="headerSearch"
      v-model:value="keyword"
      placeholder="请输入关键词"
      @click="search"
  />


</template>
<style scoped>
.headerSearch {
  vertical-align: text-bottom;
}
</style>
<!--        /*
                           _ooOoo_
                          o8888888o
                          88" . "88
                          (| -_- |)
                          O\  =  /O
                       ____/`---'\____
                     .'  \\|     |//  `.
                    /  \\|||  :  |||//  \
                   /  _||||| -:- |||||-  \
                   |   | \\\  -  /// |   |
                   | \_|  ''\---/''  |   |
                   \  .-\__  `-`  ___/-. /
                 ___`. .'  /--.--\  `. . __
              ."" '<  `.___\_<|>_/___.'  >'"".
             | | :  `- \`.;`\ _ /`;.`/ - ` : | |
             \  \ `-.   \_ __\ /__ _/   .-` /  /
        ======`-.____`-.___\_____/___.-`____.-'======
                           `=---='
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
                 上面的不要再失效了
        */-->