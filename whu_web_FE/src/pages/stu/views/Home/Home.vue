<template>
<div>
  <div>
    <label><input v-model="radioVal" name="sexChooser" type="radio" value="male">男性</label>
    <label><input v-model="radioVal" name="sexChooser" type="radio" value="female">女性</label>
  </div>
<div v-if="radioVal=='male'">
  <div id="muscle-map">
  <img id="background" :src="require('@/assets/00.-Blank-Figures.png')">
  <img id="1" :src="require('@/assets/06.-Pecs.png')" style="top:22%;left:24.3%;width:13%" @click='goTo1()'>
  <img id="2" :src="require('@/assets/01.A-Quads.png')" style="top:42.2%;left:23.6%;width:6.55%" @click='goTo2()'>
  <img id="3" :src="require('@/assets/01.B-Quads.png')" style="top:42.2%;left:31.4%;width:6.55%" @click='goTo3()'>
  <img id="4" :src="require('@/assets/04.-Obliques.png')" style="top:28.67%;left:27.44%;width:6.42%" @click='goTo4()'>
  <img id="5" :src="require('@/assets/05.A-Biceps.png')" style="top:26.9%;left:20.89%;width:4.05%" @click='goTo5()'>
  <img id="6" :src="require('@/assets/05.B-Biceps.png')" style="top:26.9%;left:36.67%;width:4.05%" @click='goTo6()'>
  <img id="7" :src="require('@/assets/07.A-Deltoids.png')" style="top:21.1%;left:21.84%;width:5.61%" @click='goTo7()'>
  <img id="8" :src="require('@/assets/07.B-Deltoids.png')" style="top:21.1%;left:34.1%;width:5.61%" @click='goTo8()'>
  <img id="9" :src="require('@/assets/07.C-Deltoids.png')" style="top:19.29%;left:61.5%;width:5.7%" @click='goTo9()'>
  <img id="10" :src="require('@/assets/07.D-Deltoids.png')" style="top:19.29%;left:74.6%;width:5.7%" @click='goTo10()'>
  <img id="11" :src="require('@/assets/08.-TrapsLeft.png')" style="top:17.4%;left:26.7%;width:3.39%" @click='goTo11()'>
  <img id="12" :src="require('@/assets/08.-TrapsRight.png')" style="top:17.4%;left:31.48%;width:3.39%" @click='goTo12()'>
  <img id="13" :src="require('@/assets/08.B-Traps.png')" style="top:15.38%;left:67.3%;width:7%" @click='goTo13()'>
  <img id="14" :src="require('@/assets/08.C-Traps.png')" style="top:17.82%;left:66.87%;width:8.1%" @click='goTo14()'>
  <img id="15" :src="require('@/assets/09.A-Triceps.png')" style="top:24.83%;left:60.2%;width:4.58%" @click='goTo15()'>
  <img id="16" :src="require('@/assets/09.B-Triceps.png')" style="top:24.83%;left:77.1%;width:4.58%" @click='goTo16()'>
  <img id="17" :src="require('@/assets/10.A-Lats.png')" style="top:26.66%;left:64.7%;width:6%" @click='goTo17()'>
  <img id="18" :src="require('@/assets/10.B-Lats.png')" style="top:26.66%;left:71.2%;width:6%" @click='goTo18()'>
  <img id="19" :src="require('@/assets/11.-Glutes.png')" style="top:41%;left:64.89%;width:12.08%" @click='goTo19()'>
  <img id="20" :src="require('@/assets/12.A-Hamstrings.png')" style="top:47.49%;left:63.75%;width:6.67%" @click='goTo20()'>
  <img id="21" :src="require('@/assets/12.B-Hamstrings.png')" style="top:47.49%;left:71.47%;width:6.7%" @click='goTo21()'>
  <img id="22" :src="require('@/assets/13.A-Calves.png')" style="top:64.59%;left:23.19%;width:4.67%" @click='goTo22()'>
  <img id="23" :src="require('@/assets/13.B-Calves.png')" style="top:64.49%;left:33.74%;width:4.67%" @click='goTo23()'>
  <img id="24" :src="require('@/assets/13.C-Calves.png')" style="top:64.43%;left:61.94%;width:4.8%" @click='goTo24()'>
  <img id="25" :src="require('@/assets/13.D-Calves.png')" style="top:64.43%;left:75.1%;width:4.8%" @click='goTo25()'>
  <img id="26" :src="require('@/assets/14.A-Forearms.png')" style="top:33.6%;left:16.75%;width:6.62%" @click='goTo26()'>
  <img id="27" :src="require('@/assets/14.B-Forearms.png')" style="top:33.6%;left:38.18%;width:6.61%" @click='goTo27()'>
  <img id="28" :src="require('@/assets/14.C-Forearms.png')" style="top:33.5%;left:56.1%;width:6.36%" @click='goTo28()'>
  <img id="29" :src="require('@/assets/14.D-Forearms.png')" style="top:33.5%;left:79.34%;width:6.36%" @click='goTo29()'>
  <img id="30" :src="require('@/assets/15.-Lower-Back.png')" style="top:32.86%;left:67.62%;width:6.59%" @click='goTo30()'>
  </div>
</div>
<div v-if="radioVal=='female'">
  <div id="muscle-map-female">
    <img id="female-background" :src="require('@/assets/female/Female-Figures.png')">
    <img id="31" :src="require('@/assets/female/female-pecs.png')" style="top:25.37%;left:24.6%;width:10.4%" @click='goTo31()'>
    <img id="32" :src="require('@/assets/female/female-quads-A.png')" style="top:46.7%;left:23.7%;width:5.2%" @click='goTo32()'>
    <img id="33" :src="require('@/assets/female/female-quads-B.png')" style="top:46.7%;left:30.5%;width:5.2%" @click='goTo33()'>
    <img id="34" :src="require('@/assets/female/female-abdominals.png')" style="top:32.48%;left:26.99%;width:5.57%" @click='goTo34()'>
    <img id="35" :src="require('@/assets/female/female-biceps-A.png')" style="top:29.48%;left:21.47%;width:3.3%" @click='goTo35()'>
    <img id="36" :src="require('@/assets/female/female-biceps-B.png')" style="top:29.48%;left:34.8%;width:3.3%" @click='goTo36()'>
    <img id="37" :src="require('@/assets/female/female-traps-A.png')" style="top:21.8%;left:25.8%;width:3%" @click='goTo37()'>
    <img id="38" :src="require('@/assets/female/female-traps-B.png')" style="top:21.8%;left:30.57%;width:3%" @click='goTo38()'>
    <img id="39" :src="require('@/assets/female/female-deltoids-A.png')" style="top:24.22%;left:22.1%;width:4.22%" @click='goTo39()'>
    <img id="40" :src="require('@/assets/female/female-deltoids-B.png')" style="top:24.26%;left:33.21%;width:4.22%" @click='goTo40()'>
    <img id="41" :src="require('@/assets/female/female-forearms-A.png')" style="top:36.1%;left:18.42%;width:5%" @click='goTo41()'>
    <img id="42" :src="require('@/assets/female/female-forearms-B.png')" style="top:36.1%;left:36.1%;width:5%" @click='goTo42()'>
    <img id="43" :src="require('@/assets/female/female-calves-A.png')" style="top:72%;left:23.1%;width:3.8%" @click='goTo43()'>
    <img id="44" :src="require('@/assets/female/female-calves-B.png')" style="top:72%;left:32.58%;width:3.8%" @click='goTo44()'>
    <img id="45" :src="require('@/assets/female/female-traps-C.png')" style="top:20.53%;left:66.36%;width:7.47%" @click='goTo45()'>
    <img id="46" :src="require('@/assets/female/female-traps-D.png')" style="top:22.5%;left:65.97%;width:8.36%" @click='goTo46()'>
    <img id="47" :src="require('@/assets/female/female-deltoids-C.png')" style="top:23.25%;left:61.9%;width:4.7%" @click='goTo47()'>
    <img id="48" :src="require('@/assets/female/female-deltoids-D.png')" style="top:23.2%;left:73.66%;width:4.7%" @click='goTo48()'>
    <img id="49" :src="require('@/assets/female/female-triceps-A.png')" style="top:28.6%;left:61.5%;width:3.2%" @click='goTo49()'>
    <img id="50" :src="require('@/assets/female/female-triceps-B.png')" style="top:28.72%;left:75.52%;width:3.22%" @click='goTo50()'>
    <img id="51" :src="require('@/assets/female/female-calves-C.png')" style="top:68.6%;left:63.77%;width:4.12%" @click='goTo51()'>
    <img id="52" :src="require('@/assets/female/female-calves-D.png')" style="top:68.6%;left:72.38%;width:4.12%" @click='goTo52()'>
    <img id="53" :src="require('@/assets/female/female-hamstrings-A.png')" style="top:51.2%;left:63.79%;width:5.46%" @click='goTo53()'>
    <img id="54" :src="require('@/assets/female/female-hamstrings-B.png')" style="top:51.2%;left:71%;width:5.46%" @click='goTo54()'>
    <img id="55" :src="require('@/assets/female/female-lats-A.png')" style="top:31%;left:65.3%;width:4.7%" @click='goTo55()'>
    <img id="56" :src="require('@/assets/female/female-lats-B.png')" style="top:31%;left:70.2%;width:4.7%" @click='goTo56()'>
    <img id="57" :src="require('@/assets/female/female-lowerback.png')" style="top:37.21%;left:67.09%;width:6.12%" @click='goTo57()'>
    <img id="58" :src="require('@/assets/female/female-glutes.png')" style="top:45.5%;left:64.53%;width:11.2%" @click='goTo58()'>
    <img id="59" :src="require('@/assets/female/female-forearms-C.png')" style="top:37.55%;left:59.3%;width:3.9%" @click='goTo59()'>
    <img id="60" :src="require('@/assets/female/female-forearms-D.png')" style="top:37.69%;left:76.96%;width:3.9%" @click='goTo60()'>
  </div>
  </div>
</div>
</template>

<script>
export default {
  name: 'Home',
  components: {},
  data () {
    return {
      radioVal: 'male'
    }
  },
  methods: {
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
    },
    goTo6 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 6}})
    },
    goTo7 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 7}})
    },
    goTo8 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 8}})
    },
    goTo9 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 9}})
    },
    goTo10 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 10}})
    },
    goTo11 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 11}})
    },
    goTo12 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 12}})
    },
    goTo13 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 13}})
    },
    goTo14 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 14}})
    },
    goTo15 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 15}})
    },
    goTo16 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 16}})
    },
    goTo17 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 17}})
    },
    goTo18 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 18}})
    },
    goTo19 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 19}})
    },
    goTo20 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 20}})
    },
    goTo21 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 21}})
    },
    goTo22 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 22}})
    },
    goTo23 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 23}})
    },
    goTo24 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 24}})
    },
    goTo25 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 25}})
    },
    goTo26 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 26}})
    },
    goTo27 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 27}})
    },
    goTo28 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 28}})
    },
    goTo29 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 29}})
    },
    goTo30 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 30}})
    },
    goTo31 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 31}})
    },
    goTo32 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 32}})
    },
    goTo33 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 33}})
    },
    goTo34 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 34}})
    },
    goTo35 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 35}})
    },
    goTo36 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 36}})
    },
    goTo37 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 37}})
    },
    goTo38 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 38}})
    },
    goTo39 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 39}})
    },
    goTo40 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 40}})
    },
    goTo41 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 41}})
    },
    goTo42 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 42}})
    },
    goTo43 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 43}})
    },
    goTo44 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 44}})
    },
    goTo45 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 45}})
    },
    goTo46 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 46}})
    },
    goTo47 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 47}})
    },
    goTo48 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 48}})
    },
    goTo49 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 49}})
    },
    goTo50 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 50}})
    },
    goTo51 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 51}})
    },
    goTo52 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 52}})
    },
    goTo53 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 53}})
    },
    goTo54 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 54}})
    },
    goTo55 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 55}})
    },
    goTo56 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 56}})
    },
    goTo57 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 57}})
    },
    goTo58 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 58}})
    },
    goTo59 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 59}})
    },
    goTo60 () {
      this.$router.push({path: '/Settings/Article', query: {imgid: 60}})
    }
  }
}

</script>

<style scoped>
  #muscle-map{position:relative}  #background{width:100%}
  #muscle-map>img:not(#background){display:block;position:absolute;transition:opacity .2s;opacity:0}
  #muscle-map>img:not(#background):hover{opacity:1}
  #muscle-map-female{position:relative} #female-background{width:100%}
  #muscle-map-female>img:not(#female-background){display:block;position:absolute;transition:opacity .2s;opacity:0}
  #muscle-map-female>img:not(#female-background):hover{opacity:1}
</style>
