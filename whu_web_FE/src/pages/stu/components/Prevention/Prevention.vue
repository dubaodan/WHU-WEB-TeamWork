<template>
  <el-card >
    <img :src=DiseaseInfo.ImgSrc class="image" @click="Linkto(DiseaseInfo.Name)">
    <div style="padding: 10px;">
      <span class="Title">{{DiseaseInfo.Title}}</span>
      <div class="bottom clearfix">
        <time class="Description">{{DiseaseInfo.Description}}</time>
      </div>
    </div>
  </el-card>
</template>

<script>
export default {
  name: 'Prevention',
  props: {
    DiseaseInfo: {
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
      this.$router.push('/Prevention/' + url)
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
