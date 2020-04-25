<template>
  <div>
    <el-row>
      <el-col :span="4" v-for="(o, index) in FoodList" :key="o.title" :offset="index > 0 ? 2 : 0">
        <FoodDetail :foodInfo = "o"></FoodDetail>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import FoodDetail from '@/pages/stu/components/Food/Food'
export default {
  name: 'Food',
  components: {
    FoodDetail
  },
  data () {
    return {
      FoodList: [
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrEFsJ.png',
          Title: '主食',
          Name: 'MainFood',
          Description: '米饭，玉米（鲜），馒头，燕麦片，面包'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrEVd1.png',
          Title: '奶类及制品',
          Name: 'Milk',
          Description: '酸奶，牛奶，酸奶（中脂），酸奶（脱脂）'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrEqfK.png',
          Title: '饮料',
          Name: 'Drink',
          Description: '薄荷 玉米须茶，雀巢咖啡MIX【韩文版】，咖啡粉，麦斯威尔原味咖啡，黑咖啡'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrEdSS.png',
          Title: '蔬果和菌藻',
          Name: 'Vegetable',
          Description: '苹果，香蕉，番茄，黄瓜，西瓜'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrVVXQ.png',
          Title: '零食',
          Name: 'Snack',
          Description: '饼干，蛋糕(黄蛋糕)，薄荷松仁粽子糖，巧克力，冰淇淋'
        },
        {
          ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrVwh6.png',
          Title: '食用油、油脂及制品',
          Name: 'Vegetable',
          Description: 'O色拉油，花生油，豆油，混合油(菜+棕)，葵花籽油'
        }
      ]
    }
  }
}
</script>

<style scoped>

</style>
