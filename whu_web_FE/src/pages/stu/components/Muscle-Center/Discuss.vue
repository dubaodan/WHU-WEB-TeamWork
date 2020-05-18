<template>
  <div>
    <br><br><br><br>
    <div class="title">
    <h1>讨论</h1>
    </div>
    <div class="pos">
    <div class="article">
    <h3>健身小白</h3>
    <h5>刚开始学习卧推的时候，一定要注意收紧肩胛骨啊！</h5>
    <h5>教练总是纠正我，但还是很难一下子改正过来...</h5>
    </div>
    <br>
    <div class="article">
    <h3>挺举达人</h3>
    <h5>对于新手来说，从锻炼胸肌开始入门是个不错的选择。</h5>
    <h5>极短时间内效果比较明显，也能为之后腰腹训练打下基础！</h5>
    </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Article',
  data () {
    return {
      msg: 'Article'
    }
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

.article {
text-align:left;
font-family:'KaiTi';
}

.article{
     outline: none;
     width: 80%;
     border-radius: 5px;
     box-shadow: 0 0 0 2px #FAEBD7;

}

.pos{
    margin-left: 20%;
}
</style>
