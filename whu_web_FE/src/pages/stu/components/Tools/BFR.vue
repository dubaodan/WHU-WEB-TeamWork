<template>
  <div>
    <el-image
      style="width: 40%; height: 40%"
      :src="url"
      :fit="scale-down"></el-image>
    <el-row>
      体重(kg)<el-input v-model="input_Weight"  placeholder="请输入体重"></el-input>
      身高(m)<el-input v-model="input_Height"  placeholder="请输入身高"></el-input>
    </el-row>
    <el-row>
      年龄(岁)<el-input v-model="input_Year"  placeholder="请输入年龄"></el-input>
      性别<el-select v-model="sex_value" placeholder="请选择性别">
        <el-option
          v-for="item in reference"
          :key="item.value"
          :label="item.label"
          :value="item.value">
        </el-option>
      </el-select>
    </el-row>
    <el-button type="primary" plain @click="calculate">确认</el-button>
    <el-row>
      BFR指数为：{{output_result}}
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'BFR',
  data () {
    return {
      url: 'https://s1.ax1x.com/2020/04/24/JrCZIU.jpg',
      input_Height: '',
      input_Weight: '',
      input_Year: '',
      sex_value: '',
      output_result: '',
      reference: [
        {value: '男', label: '男'},
        {value: '女', label: '女'}
      ]
    }
  },
  methods: {
    calculate: function () {
      var Weight = this.input_Weight - 0
      var Height = this.input_Height - 0
      var year = this.input_Year - 0
      var sex = this.sex_value === '男' ? 1 : 0
      this.output_result = String(1.2 * Weight / (Height * Height) + 0.23 * year - 5.4 - 10.8 * sex)
      alert(this.output_result + '%')
      if (this.output_result === '' || this.output_result === 'Infinity' || this.output_result === 'NaN' || Weight <= 0 || Height <= 0 || year <= 0 || this.sex_value === '') {
        this.output_result = ''
        alert('输入无效')
      }
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
