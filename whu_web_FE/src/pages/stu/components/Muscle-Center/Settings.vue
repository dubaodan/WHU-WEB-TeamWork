<template>
  <el-row class="tac">
  <el-col :span="center" >
    <SlideBar class="slide">
    </SlideBar>
  </el-col>
  <router-view></router-view>
  </el-row>
</template>

<script>
import SlideBar from '@/pages/stu/components/Muscle-Center/SlideBar'
export default {
  name: 'Settings',
  components: {
    'SlideBar': SlideBar
  }
}
</script>

<style scoped>
.tac{
  margin:2%;
  text-align: center;
}
.slide{
    width: 100%;
    text-align: center;
}
</style>
