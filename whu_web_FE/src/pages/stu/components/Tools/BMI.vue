<template>
<div>
  体重(kg)<el-input v-model="input_Weight" placeholder="请输入体重"></el-input>
  身高(m)<el-input v-model="input_Height" min='1' placeholder="请输入身高"></el-input>
  <el-button type="primary" plain @click="calculate">确认</el-button>
  <el-row>
    BMI指数为：{{output_result}}
  </el-row>
  <el-row >
    BMI 指数参考：
    <el-col
      v-for="(item, index) in reference"
      :key="index">
      {{item.index}}：{{item.class}}
    </el-col>
  </el-row>
</div>
</template>

<script>
export default {
  name: 'BMI',
  data () {
    return {
      input_Height: '',
      input_Weight: '',
      output_result: '',
      reference: [
        {index: '<18.5', class: '过轻'},
        {index: '18.5-23.9', class: '正常'},
        {index: '24-27.9', class: '肥胖'},
        {index: '>28', class: '超重'}
      ]
    }
  },
  methods: {
    calculate: function () {
      var Weight = parseFloat(this.input_Weight)
      var Height = parseFloat(this.input_Height)
      this.output_result = String(Weight / (Height * Height))
    }
  }
}
</script>

<style scoped>
.el-input{
  width: 30%;
  margin: 5%;

}
.el-row{
  margin: 5%;
}

</style>
