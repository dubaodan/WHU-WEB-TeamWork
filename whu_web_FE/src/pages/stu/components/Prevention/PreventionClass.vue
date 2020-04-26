<template>
  <el-collapse v-model="activeNames" @change="handleChange"  >
    <el-collapse-item v-for="(value, name,index) in items" v-bind:key="index" :title=name :name=index>
      <span v-html=value></span>
    </el-collapse-item>
  </el-collapse>
</template>

<script>
// import axios from 'axios'
export default {
  name: 'PreventionClass',
  data () {
    return {
      title: this.$route.params.id,
      items: {},
      activeNames: [0],
      LumbarMuscleDegeneration:
          {'疾病名称': '腰肌劳损',
            '病因': '1.急性腰扭伤后及长期反复的腰肌劳损。\n' +
               '2.治疗不及时、处理方法不当。\n' +
               '3.长期反复的过度腰部运动及过度负荷，如长时期坐位、久站或从弯腰位到直立位手持重物、抬物，均可使腰肌长期处于高张力状态，久而久之可导致慢性腰肌劳损。\n' +
               '4.慢性腰肌劳损与气候、环境条件也有一定关系，气温过低或湿度太大都可促发或加重腰肌劳损。\n',
            '征兆': '1.腰部酸痛或胀痛，部分刺痛或灼痛。\n' +
                '2.劳累时加重，休息时减轻；适当活动和经常改变体位时减轻，活动过度又加重。\n' +
                '3.不能坚持弯腰工作。常被迫时时伸腰或以拳头击腰部以缓解疼痛。\n' +
                '4.腰部有压痛点，多在骶棘肌处，髂骨脊后部、骶骨后骶棘肌止点处或腰椎横突处。\n' +
                '5.腰部外形及活动多无异常，也无明显腰肌痉挛，少数患者腰部活动稍受限。',
            '预防': '1.防止潮湿，寒冷受凉\n' +
                '不要随意睡在潮湿的地方。根据气候的变化，随时增添衣服，出汗及雨淋之后，要及时更换湿衣或擦干身体。\n' +
                '2.急性腰扭伤\n' +
                '应积极治疗，安心休息，防止转成慢性。\n' +
                '3.体育运动或剧烈活动时\n' +
                '要做好准备活动。\n' +
                '4.纠正不良的工作姿势\n' +
                '如弯腰过久，或伏案过低等。在僵坐一小时后要换一个姿势。同时，可以使用腰部有突起的靠垫为腰部缓解压力，有助于避免出现腰肌劳损。背重物时，胸腰稍向前弯，髋膝稍屈，迈步要稳，步子不要大。\n' +
                '5.防止过劳\n' +
                '腰部作为人体运动的中心，过度劳累，必然造成损伤而出现腰痛，因此，在各项工作或劳动中注意有劳有逸。\n' +
                '6.使用硬板软垫床\n' +
                '过软的床垫不能保持脊柱的正常生理曲度，所以最好在木板上加一张10厘米厚的软垫。\n' +
                '7.注意减肥\n' +
                '控制体重，身体过于肥胖，必然给腰部带来额外负担，特别是中年人和妇女产后，为易于发胖的时期，节制饮食，加强锻炼。'
          }
    }
  },
  mounted () {
    // 这里应该是要发送请求 获取对应title的一系列数据
  //   data () {
  //     return {
  //       res: '' // 创建对象
  //     }
  //   },
  //   mounted () {
  //     let params = new URLSearchParams()
  //     params.append('id', this.$route.query)
  //     axios({
  //       method: 'post',
  //       url: '',
  //       data: params
  //     }).then((response) => {
  //       this.res = response.data
  //     })
  //   }
    if (this.title === 'LumbarMuscleDegeneration') {
      this.items = this.LumbarMuscleDegeneration
    }
  },
  methods: {
    handleChange (val) {
      console.log(val)
    }
  }
}
</script>

<style scoped>
span{
  font-size: large;
}
</style>
