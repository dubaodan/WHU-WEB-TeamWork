<!--<div>{{this.$route.params.id}}-->
<!--</div>-->
  <template>
    <el-table
      :data="itemData"
      stripe
      style="width: 100%">
      <el-table-column
        prop="date"
        label="日期"
        width="180px">
        <template slot-scope="scope">
          <img  :src="scope.row.date" alt="" style="width: 100px;height: 100px">
        </template>
      </el-table-column>
      <el-table-column
        prop="name"
        label="名称"
        width="180">
      </el-table-column>
      <el-table-column
        prop="address"
        label="热量">
      </el-table-column>
    </el-table>
  </template>

<script>
export default {
  name: 'FoodClass',
  data () {
    return {
      itemData: [],
      MainFoodData: [{
        date: 'https://s1.ax1x.com/2020/04/27/JWzR9P.jpg',
        name: '米饭',
        address: '116大卡（100克）'
      }, {
        date: 'https://s1.ax1x.com/2020/04/27/JfCmbF.jpg',
        name: '玉米（鲜）又叫苞谷、珍珠米、棒子',
        address: '106大卡（100克可食部分）'
      }, {
        date: 'https://s1.ax1x.com/2020/04/27/JfPZRI.jpg',
        name: '馒头',
        address: ' 221 大卡（100克）'
      }]
    }
  },
  mounted () {
    if (this.$route.params.id === 'MainFood') {
      this.itemData = this.MainFoodData
    }
  }
}
</script>

<style scoped>

</style>
