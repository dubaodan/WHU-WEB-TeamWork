<template>
  <el-card >
    <img :src=foodInfo.ImgSrc class="image" @click="Linkto(foodInfo.Name)">
    <div style="padding: 10px;">
      <span class="Title">{{foodInfo.Title}}</span>
      <div class="bottom clearfix">
        <time class="Description">{{foodInfo.Description}}</time>
      </div>
    </div>
  </el-card>
</template>

<script>
export default {
  name: 'Tools',
  props: {
    foodInfo: {
      ImgSrc: String,
      Title: String,
      Name: String,
      Description: String
    }
  },
  data () {
    return {
    }
  },
  methods: {
    Linkto: function (url) {
      this.$router.push('/Food/' + url)
    }
  }
}
</script>

<style scoped>
  .el-card{
    margin: 10px;
    width: 200px;
    height: 300px;
  }
  .Description {
    font-size: 10px;
  }
  .Title {
    font-size: 20px
  }
  .bottom {
  }
  .image {
    width: 80%;
    padding: auto;
  }
  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both
  }
</style>
