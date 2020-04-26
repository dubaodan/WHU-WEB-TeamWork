<template>
  <div>
    <br><br><br><br>
    <div class="title">
    <h1>讨论</h1>
    </div>
    <div>
      <el-table class = "user"
            :data="res.data.muscle"
            :show-header="false"
            cell-style="font-weight: 700;"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="user[0].name"
            align="center"
            label=''
            width="1115">
            </el-table-column>
      </el-table>
           <el-table class = "comment"
            :data="res.data.muscle"
            :show-header="false"
            cell-style="font-weight: 700;"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="user[0].comment"
            align="left"
            label=''
            width="1115">
            </el-table-column>
      </el-table>
      <br><br><br>
      <el-table class = "user"
            :data="res.data.muscle"
            :show-header="false"
            cell-style="font-weight: 700;"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="user[1].name"
            align="center"
            label=''
            width="1115">
            </el-table-column>
      </el-table>
           <el-table class = "comment"
            :data="res.data.muscle"
            :show-header="false"
            cell-style="font-weight: 700;"
            border
            style="width: 100%">
            <el-table-column
            fixed
            prop="user[1].comment"
            align="left"
            label=''
            width="1115">
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

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.title {
  font-weight: normal;
  text-align:center;
  font-family: 'SimSun';
}

.user{
  text-align:left;
  color: #00008b;
  font-family:'KaiTi';
}

.comment {
  text-align:center;
  font-family:'KaiTi';
}

</style>
