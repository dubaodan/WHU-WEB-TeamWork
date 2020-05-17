<template>
  <div>
    <el-row>
      <el-col :span="4" v-for="(o, index) in DiseaseList" :key="o.title" :offset="index > 0 ? 2 : 0">
        <PreventDetail :DiseaseInfo = "o"></PreventDetail>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import PreventDetail from '@/pages/stu/components/Prevention/Prevention'
// eslint-disable-next-line no-unused-vars
import axios from 'axios'
import '../../../../mock'
export default {
  name: 'Prevention',
  components: {
    PreventDetail
  },
  data () {
    return {
      // DiseaseList: ''
      DiseaseList: [
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrB9f0.jpg',
          Title: '腰肌劳损',
          Name: '腰肌劳损',
          Description: '腰肌劳损，又称功能性腰痛、慢性下腰损伤、腰臀肌筋膜炎等，是腰痛的常见原因之一，主要症状是腰或腰骶部胀痛、酸痛，反复发作，疼痛可随气候变化或劳累程度而变化，为临床常见病，多发病。 '
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/27/JWDQsA.jpg',
          Title: '肌肉拉伤',
          Name: '肌肉拉伤',
          Description: '肌肉拉伤是肌肉在运动中急剧收缩或过度牵拉引起的损伤。这在引体向上和仰卧起坐练习时容易发生。肌肉拉伤后，拉伤部位剧痛，用手可摸到肌肉紧张形成的索条状硬块，触疼明显，局部肿胀或皮下出血，活动明显受到限制。'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/05/17/YRKNKx.jpg',
          Title: '骨质疏松症',
          Name: '骨质疏松症',
          Description: '骨质疏松症（osteoporosis）是由于多种原因导致的骨密度和骨质量下降，骨微结构破坏，造成骨脆性增加，从而容易发生骨折的全身性骨病。'
        }
      ]
    }
  }
  // mounted () {
  //   let that = this
  //   axios({
  //     method: 'get',
  //     url: 'http://localhost:8080/WHU_WEB_BE_war/GetIllList'
  //   }).then((response) => {
  //     console.log(response.data)
  //     that.DiseaseList = response.data
  //   }).catch((error) => {
  //     console.log(error)
  //   })
  // }
}
</script>

<style scoped>

</style>
