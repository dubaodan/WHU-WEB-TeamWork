<template>
<div >
  <div @click="skip('/Settings/Article')">
  <img :src="require('@/assets/06.-Pecs.png')" style="    top:46%;
    left: 25.2%;
    vertical-align: middle;
    width: 12.5%;
    display: block;
    position: absolute;" >
  </div>
  <div>
  <img :src="require('@/assets/00.-Blank-Figures.png')"  style="width:100%; vertical-align: middle;">
  </div>
</div>
</template>

<script>
export default {
  name: 'Home',
  components: {

  },
  methods: {
    skip (url) {
      location.href = url
    }
  }
}
</script>

<style scoped>

</style>
