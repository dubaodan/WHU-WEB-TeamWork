<template>
  <div>
    <el-container>
    <el-header>个人信息</el-header>
    <el-main>
      <el-row gutter="24">
        <el-col :span="12" >姓名<el-input
          placeholder="请输入姓名"
          v-model="input_name"
          clearable>
        </el-input></el-col>
        <el-col :span="12" >身高<el-input
          placeholder="请输入身高"
          v-model="input_height"
          clearable>
        </el-input></el-col>
      </el-row>

      <el-row gutter="24">

        <el-col :span="12" >体重<el-input
          placeholder="请输入体重"
          v-model="input_height"
          clearable>
        </el-input></el-col>
        <el-col :span="12" >肺活量<el-input
          placeholder="请输入肺活量"
          v-model="input_pulmonary"
          clearable>
        </el-input></el-col>
      </el-row>
      <el-button type="primary" plain>Update</el-button>
    </el-main>
  </el-container>
  </div>
</template>

<script>
export default {
  name: 'Profile',
  data () {
    return {
      input_name: '',
      input_height: '',
      input_weight: '',
      input_pulmonary: ''

    }
  }
}
</script>

<style scoped>
  .el-row {
    margin-bottom: 20px;
    &:last-child {
      margin-bottom: 0;
    }
  }
  .el-col {
    border-radius: 4px;
  }
</style>
