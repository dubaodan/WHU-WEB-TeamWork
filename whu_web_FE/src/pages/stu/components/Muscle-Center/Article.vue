<template>
<div>
    <br><br><br><br><br><br>
<div class="article">
        <el-table class = "title"
            :data="res.data.muscle"
            :show-header="false"
            cell-style="font-weight: 700;"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="name"
            align="center"
            label=''
            width="1115">
            </el-table-column>
      </el-table>
      <br><br><br>
      <el-table
            :data="res.data.muscle"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="description"
            align="left"
            label="简介"
            width="1115">
            </el-table-column>
      </el-table>
      <br><br>
            <el-table
            :data="res.data.muscle"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="method"
            align="left"
            label="方法"
            width=1115>
            </el-table-column>
      </el-table>
  </div>
</div>
</template>

<script>
import axios from 'axios'
export default{
  data () {
    return {
      res: '' // 创建对象
    }
  },
  mounted () {
    let params = new URLSearchParams()
    params.append('id', this.$route.query)
    axios({
      method: 'post',
      url: '我是servlet',
      data: params
    }).then((response) => {
      this.res = response.data
    })
  }
}
</script>

<style scoped>
.title {
  font-size: large;
  text-align: center;
  font-family: 'SimSun';
}

.article {
  font-weight: normal;
  font-family:'KaiTi';
}
</style>
