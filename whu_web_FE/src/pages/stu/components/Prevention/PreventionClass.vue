<template>
  <el-collapse v-model="activeNames" @change="handleChange"  accordion>
    <el-page-header @back="goBack" :content=this.$route.params.id>
    </el-page-header>
    <el-collapse-item v-for="(value,name,index) in items" v-bind:key="index" :title=name :name=index>
      <span v-html="value"></span>
    </el-collapse-item>
  </el-collapse>
</template>

<script>
import axios from 'axios'
export default {
  name: 'PreventionClass',
  data () {
    return {
      title: this.$route.params.id,
      items: {},
      activeNames: [0],
      LumbarMuscleDegeneration:
          {
            '病因': '1.准备活动不充分，肌肉的生理机能尚未达到剧烈活动所需要的状态就参加剧烈活动。\n' +
                '2.体质较弱，训练的水平不高，肌肉伸展性和力量较差，疲劳或负荷过度。\n' +
                '3.运动技术低，姿势不正确，用力过猛，超过了肌肉活动的范围。\n' +
                '4.气温过低，湿度太高，场地太硬等。\n' +
                '5.肌肉拉伤可发生在肌腹与肌腹分界处，也可发生在肌腱附着于骨骼处。拉伤可能是细微的损伤，也可能是肌纤维部分撕裂，甚至是完全断裂。肌肉拉伤的部位多为：大腿后部肌群、腰背肌、小腿三头肌、腹直肌、斜方肌等。',
            '表现': '剧痛，可摸到肌肉紧张形成的索条状硬块，触疼明显，局部肿胀或皮下出血，活动明显受限。',
            '治疗手段': '肌肉拉伤后，要立即进行冷敷，用冷水冲局部或用毛巾包裹冰决冷敷，然后用绷带适当用力包裹损伤部位，防止肿胀。24小时至48小时后拆除包扎，可外贴活血和消肿胀，可适当热敷或用较轻的手法对损伤局部进行按摩。\n' +
                '如果是大腿肌肉少量肌纤维断裂，应立即给予冷敷，局部加压包扎，并抬高患肢，肌肉大部或完全断裂者，在加压包扎后立即送医院进行手术缝合。',
            '预防': '1、着重进行拉伸练习。将身体的每一处关节，和容易拉伤的肌肉群都活动开。尤其是手臂、腿部、腰部的肌肉，以及肩关节、腕关节、膝关节、踝关节等。拉伸动作要标准，拉伸时间要保证。\n' +
                '2.运动结束后拉伸也是很有必要的。这样做不但能防止肌肉拉伤，也能让肌肉获得充分的放松。\n' +
                '3.运动姿势标准，掌握各种动作的技巧。这是避免伤害和保证运动效果的必然要求。\n' +
                '4.不可太过激进。运动要循序渐进，选择适合自己的运动方式和运动量，才能保证锻炼的效果。\n' +
                '5.由静到动，由慢到快。即使是热身，也要一步一步慢慢来。'
          },
      Fasciitis: {'疾病名称': '筋膜炎',
        '病因': '筋膜炎是指肌肉筋膜附着在骨胳部位发生无菌性炎症，目前筋膜炎的病因尚不明确，可能与过度、过长时间牵拉某些肌肉有关，即积累性劳损，也可能与受寒、创伤、免疫因素和血管炎症有关。当机体受到风寒侵袭、疲劳、外伤或睡眠位置不当等外界不良因素刺激时，可以诱发筋膜炎的症状加重，呈急性发作状态。',
        '征兆': '多表现为发病部位疼痛，多为酸痛不适，肌肉僵硬板滞，或有重压感。晨起或天气变化及受凉后症状加重，活动后则疼痛减轻，常反复发作。急性发作时，局部肌肉紧张、痉挛，活动受限。由于在急性期没有得到彻底的治疗而转入慢性，或者由于患者受到反复的劳损、风寒等不良刺激，可以反复出现持续或者间断的慢性肌肉疼痛、酸软无力等症状。体检时可在患处触摸到固定压痛点，位置常固定在肌肉的起止点附近或两组不同方向的肌肉交接处，压痛点深部可摸到肿胀的痛性肌索条',
        '预防': '1.组织病理活检\n' +
            '做痛性结缔组织的活检，可见皮下脂肪、肌筋膜或骨膜等结缔组织有炎性水肿和增生。\n' +
            '2.其他检查\n' +
            '实验室检查抗“O”或血沉正常或稍高。磁共振检查，腰背部皮下可见条片状长T1长T2信号，边界较清，为渗出的液体信号。\n'
      }
    }
  },
  mounted () {
    if (this.title === '腰肌劳损') {
      this.items = this.LumbarMuscleDegeneration
    }
    if (this.title === '筋膜炎') {
      this.items = this.Fasciitis
    }

    // let params = {'name': '肌肉拉伤'}
    var param = new URLSearchParams()
    param.append('name', '肌肉拉伤')
    axios({
      method: 'post',
      url: 'http://localhost:8080/WHU_WEB_BE_war/GetIllnessDetail',
      data: param
    }).then((response) => {
      console.log(response.data)
    }).catch((error) => {
      console.log(error)
    })
  },
  methods: {
    handleChange (val) {
      console.log(val)
    },
    goBack () {
      this.$router.push('/Prevention')
    }
  }
}
</script>

<style scoped>
span{
  font-size: large;
  text-align: left;
  white-space: pre-line;
  float: left;
}
</style>
