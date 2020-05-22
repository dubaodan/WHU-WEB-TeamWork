<template>
  <el-menu
    default-active="this.$route.path"
    mode="horizontal"
    class="bar"
    @open="handleOpen"
    @close="handleClose"
    router>
    <el-menu-item index="/Settings/Article" @click="updateId1">
      <i class="el-icon-reading"></i>
      <span slot="title">文字要点</span>
    </el-menu-item>
    <el-menu-item index="/Settings/Video" @click="updateId2">
      <i class="el-icon-data-analysis"></i>
      <span slot="title">视频讲解</span>
    </el-menu-item>
        <el-menu-item index="/Settings/Discuss" @click="updateId3">
      <i class="el-icon-chat-round"></i>
      <span slot="title">经验讨论</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  data () {
    return {
      id1: this.$route.query.imgid
    }
  },
  name: 'SlideBar',
  methods: {
    updateId1: function () {
      this.$router.push({path: '/Settings/Article', query: {imgid: this.id1}})
    },
    updateId2: function () {
      this.$router.push({path: '/Settings/Video', query: {imgid: this.id1}})
    },
    updateId3: function () {
      this.$router.push({path: '/Settings/Discuss', query: {imgid: this.id1}})
    },
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
