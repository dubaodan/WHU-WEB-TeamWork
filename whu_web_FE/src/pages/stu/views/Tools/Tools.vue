<template>
  <div>
  <el-row>
    <el-col :span="4" v-for="(o, index) in ToolsList" :key="o.title" :offset="index > 0 ? 2 : 0">
      <Tool :toolInfo = "o"></Tool>
    </el-col>
  </el-row>
  </div>
</template>

<script>
import Tool from '@/pages/stu/components/Tools/Tools'
export default {
  name: 'Tools',
  components: {
    Tool
  },
  data () {
    return {
      ToolsList: [
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/22/Jt2JXj.gif',
          Title: '体脂率',
          Name: 'BFR',
          Description: '体脂率是指人体内脂肪重量在人体总体重中所占的比例，又称体脂百分数，它反映人体内脂肪含量的多少。'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/22/JtgseI.jpg',
          Title: 'BMI指数',
          Name: 'BMI',
          Description: '身体质量指数是BMI指数(身体质量指数，简称体质指数)，是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。\n'
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>
