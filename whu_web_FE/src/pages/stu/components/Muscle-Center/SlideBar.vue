<template>
  <el-menu
    default-active="this.$route.path"
    mode="horizontal"
    class="bar"
    @open="handleOpen"
    @close="handleClose"
    router>
    <el-menu-item index="/Settings/Article">
      <i class="el-icon-reading"></i>
      <span slot="title">文字要点</span>
    </el-menu-item>
    <el-menu-item index="/Settings/Video">
      <i class="el-icon-data-analysis"></i>
      <span slot="title">视频讲解</span>
    </el-menu-item>
        <el-menu-item index="/Settings/Discuss">
      <i class="el-icon-chat-round"></i>
      <span slot="title">经验讨论</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  name: 'SlideBar',
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  }
}
</script>

<style scoped>

</style>
