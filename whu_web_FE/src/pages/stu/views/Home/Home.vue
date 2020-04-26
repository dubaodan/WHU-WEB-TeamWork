<template>
<div >
  <div>
    <el-radio-group v-model="radio">
      <el-radio label="Male">Male</el-radio>
      <el-radio label="Female">Female</el-radio>
    </el-radio-group>
  </div>
<div v-if="radio=='Male'">
  <div id="muscle-map">
  <img id="background" :src="require('@/assets/00.-Blank-Figures.png')">
  <img id="1" :src="require('@/assets/06.-Pecs.png')" style="top:22%;left:24.3%;width:13%" @click='goTo1()'>
  <img id="2" :src="require('@/assets/01.A-Quads.png')" style="top:42.2%;left:23.6%;width:6.55%" @click='goTo2()'>
  <img id="3" :src="require('@/assets/01.B-Quads.png')" style="top:42.2%;left:31.4%;width:6.55%" @click='goTo3()'>
  <img id="4" :src="require('@/assets/04.-Obliques.png')" style="top:28.67%;left:27.44%;width:6.42%" @click='goTo4()'>
  <img id="5" :src="require('@/assets/05.A-Biceps.png')" style="top:26.9%;left:20.89%;width:4.05%" @click='goTo5()'>
  <img id="biceps-b" :src="require('@/assets/05.B-Biceps.png')" @click="skip('/Settings/Article')">
  <img id="shoulders-a" :src="require('@/assets/07.A-Deltoids.png')" @click="skip('/Settings/Article')">
  <img id="shoulders-b" :src="require('@/assets/07.B-Deltoids.png')" @click="skip('/Settings/Article')">
  <img id="back-shoulders-a" :src="require('@/assets/07.C-Deltoids.png')" @click="skip('/Settings/Article')">
  <img id="back-shoulders-b" :src="require('@/assets/07.D-Deltoids.png')" @click="skip('/Settings/Article')">
  <img id="traps-a" :src="require('@/assets/08.-TrapsLeft.png')" @click="skip('/Settings/Article')">
  <img id="traps-b" :src="require('@/assets/08.-TrapsRight.png')" @click="skip('/Settings/Article')">
  <img id="back-traps-a" :src="require('@/assets/08.B-Traps.png')" @click="skip('/Settings/Article')">
  <img id="back-traps-b" :src="require('@/assets/08.C-Traps.png')" @click="skip('/Settings/Article')">
  <img id="triceps-a" :src="require('@/assets/09.A-Triceps.png')" @click="skip('/Settings/Article')">
  <img id="triceps-b" :src="require('@/assets/09.B-Triceps.png')" @click="skip('/Settings/Article')">
  <img id="back-lats-a" :src="require('@/assets/10.A-Lats.png')" @click="skip('/Settings/Article')">
  <img id="back-lats-b" :src="require('@/assets/10.B-Lats.png')" @click="skip('/Settings/Article')">
  <img id="back-glutes" :src="require('@/assets/11.-Glutes.png')" @click="skip('/Settings/Article')">
  <img id="back-hamstrings-a" :src="require('@/assets/12.A-Hamstrings.png')" @click="skip('/Settings/Article')">
  <img id="back-hamstrings-b" :src="require('@/assets/12.B-Hamstrings.png')" @click="skip('/Settings/Article')">
  <img id="calves-a" :src="require('@/assets/13.A-Calves.png')" @click="skip('/Settings/Article')">
  <img id="calves-b" :src="require('@/assets/13.B-Calves.png')" @click="skip('/Settings/Article')">
  <img id="back-calves-a" :src="require('@/assets/13.C-Calves.png')" @click="skip('/Settings/Article')">
  <img id="back-calves-b" :src="require('@/assets/13.D-Calves.png')" @click="skip('/Settings/Article')">
  <img id="forearm-a" :src="require('@/assets/14.A-Forearms.png')" @click="skip('/Settings/Article')">
  <img id="forearm-b" :src="require('@/assets/14.B-Forearms.png')" @click="skip('/Settings/Article')">
  <img id="back-forearms-a" :src="require('@/assets/14.C-Forearms.png')" @click="skip('/Settings/Article')">
  <img id="back-forearms-b" :src="require('@/assets/14.D-Forearms.png')" @click="skip('/Settings/Article')">
  <img id="back-lower" :src="require('@/assets/15.-Lower-Back.png')" @click="skip('/Settings/Article')">
  </div>
</div>
<div v-if="radio=='Female'">
  <div id="muscle-map-female">
    <img id="female-background" :src="require('@/assets/female/Female-Figures.png')">
    <img id="female-pecs" :src="require('@/assets/female/female-pecs.png')" @click="skip('/Settings/Article')">
    <img id="female-quads-a" :src="require('@/assets/female/female-quads-A.png')" @click="skip('/Settings/Article')">
  </div>
  </div>
</div>
</template>

<script>
export default {
  name: 'Home',
  components: {

  },
  data () {
    return {
      radio: 'Male'
    }
  },
  methods: {
    skip (url) {
      location.href = url
    },
    goTo1 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 1}})
    },
    goTo2 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 2}})
    },
    goTo3 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 3}})
    },
    goTo4 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 4}})
    },
    goTo5 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 5}})
    }
  }
}
</script>

<style scoped>
  #muscle-map{position:relative}  #background{width:100%}
  #muscle-map>img:not(#background){display:block;position:absolute;transition:opacity .2s;opacity:0}
  #muscle-map>img:not(#background):hover{opacity:1}
  #muscle-map>#traps-a{top:17.4%;left:26.7%;width:3.39%}
  #muscle-map>#traps-b{top:17.4%;left:31.48%;width:3.39%}
  /*#muscle-map>#1 {top:22%;left:24.3%;width:13%}*/
  #muscle-map>#shoulders-a{top:21.1%;left:21.84%;width:5.61%}
  #muscle-map>#shoulders-b{top:21.1%;left:34.1%;width:5.61%}
  #muscle-map>#5{top:26.9%;left:20.89%;width:4.05%}
  #muscle-map>#biceps-b{top:26.9%;left:36.67%;width:4.05%}
  #muscle-map>#forearm-a{top:33.6%;left:16.75%;width:6.62%}
  #muscle-map>#forearm-b{top:33.6%;left:38.18%;width:6.61%}
  #muscle-map>#4{top:28.67%;left:27.44%;width:6.42%}
  #muscle-map>#3{top:42.2%;left:31.4%;width:6.55%}
  #muscle-map>#2{top:42.2%;left:23.6%;width:6.55%}
  #muscle-map>#calves-a{top:64.59%;left:23.19%;width:4.67%}
  #muscle-map>#calves-b{top:64.49%;left:33.74%;width:4.67%}
  #muscle-map>#back-traps-a{top:15.38%;left:67.3%;width:7%}
  #muscle-map>#back-traps-b{top:17.82%;left:66.87%;width:8.1%}
  #muscle-map>#back-shoulders-a{top:19.29%;left:61.5%;width:5.7%}
  #muscle-map>#back-shoulders-b{top:19.29%;left:74.6%;width:5.7%}
  #muscle-map>#triceps-a{top:24.83%;left:60.2%;width:4.58%}
  #muscle-map>#triceps-b{top:24.83%;left:77.1%;width:4.58%}
  #muscle-map>#back-lats-a{top:26.66%;left:64.7%;width:6%}
  #muscle-map>#back-lats-b{top:26.66%;left:71.2%;width:6%}
  #muscle-map>#back-lower{top:32.86%;left:67.62%;width:6.59%}
  #muscle-map>#back-forearms-a{top:33.5%;left:56.1%;width:6.36%}
  #muscle-map>#back-forearms-b{top:33.5%;left:79.34%;width:6.36%}
  #muscle-map>#back-glutes{top:41%;left:64.89%;width:12.08%}
  #muscle-map>#back-hamstrings-a{top:47.49%;left:63.75%;width:6.67%}
  #muscle-map>#back-hamstrings-b{top:47.49%;left:71.47%;width:6.7%}
  #muscle-map>#back-calves-a{top:64.43%;left:61.94%;width:4.8%}
  #muscle-map>#back-calves-b{top:64.43%;left:75.1%;width:4.8%}

  #muscle-map-female{position:relative} #female-background{width:100%}
  #muscle-map-female>img:not(#female-background){display:block;position:absolute;transition:opacity .2s;opacity:0}
  #muscle-map-female>img:not(#female-background):hover{opacity:1}
  #muscle-map-female>#female-traps-a{top:21.8%;left:25.8%;width:3%}
  #muscle-map-female>#female-traps-b{top:21.8%;left:30.57%;width:3%}
  #muscle-map-female>#female-pecs{top:25.37%;left:24.6%;width:10.4%}
  #muscle-map-female>#female-shoulders-a{top:24.22%;left:22.1%;width:4.22%}
  #muscle-map-female>#female-shoulders-b{top:24.26%;left:33.21%;width:4.22%}
  #muscle-map-female>#female-biceps-a{top:29.48%;left:21.47%;width:3.3%}
  #muscle-map-female>#female-biceps-b{top:29.48%;left:34.8%;width:3.3%}
  #muscle-map-female>#female-forearm-a{top:36.1%;left:18.42%;width:5%}
  #muscle-map-female>#female-forearm-b{top:36.1%;left:36.1%;width:5%}
  #muscle-map-female>#female-abdominals{top:32.48%;left:26.99%;width:5.57%}
  #muscle-map-female>#female-quads-b{top:46.7%;left:30.5%;width:5.2%}
  #muscle-map-female>#female-quads-a{top:46.7%;left:23.7%;width:5.2%}
  #muscle-map-female>#female-calves-a{top:72%;left:23.1%;width:3.8%}
  #muscle-map-female>#female-calves-b{top:72%;left:32.58%;width:3.8%}
  #muscle-map-female>#female-back-traps-a{top:20.53%;left:66.36%;width:7.47%}
  #muscle-map-female>#female-back-traps-b{top:22.5%;left:65.97%;width:8.36%}
  #muscle-map-female>#female-back-shoulders-a{top:23.25%;left:61.9%;width:4.7%}
  #muscle-map-female>#female-back-shoulders-b{top:23.2%;left:73.66%;width:4.7%}
  #muscle-map-female>#female-triceps-a{top:28.6%;left:61.5%;width:3.2%}
  #muscle-map-female>#female-triceps-b{top:28.72%;left:75.52%;width:3.22%}
  #muscle-map-female>#female-back-lats-a{top:31%;left:65.3%;width:4.7%}
  #muscle-map-female>#female-back-lats-b{top:31%;left:70.2%;width:4.7%}
  #muscle-map-female>#female-back-lower{top:37.21%;left:67.09%;width:6.12%}
  #muscle-map-female>#female-back-forearms-a{top:37.55%;left:59.3%;width:3.9%}
  #muscle-map-female>#female-back-forearms-b{top:37.69%;left:76.96%;width:3.9%}
  #muscle-map-female>#female-back-glutes{top:45.5%;left:64.53%;width:11.2%}
  #muscle-map-female>#female-back-hamstrings-a{top:51.2%;left:63.79%;width:5.46%}
  #muscle-map-female>#female-back-hamstrings-b{top:51.2%;left:71%;width:5.46%}
  #muscle-map-female>#female-back-calves-a{top:68.6%;left:63.77%;width:4.12%}
  #muscle-map-female>#female-back-calves-b{top:68.6%;left:72.38%;width:4.12%}
</style>
