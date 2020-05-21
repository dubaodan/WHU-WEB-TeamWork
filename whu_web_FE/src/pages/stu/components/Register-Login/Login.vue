//登录界面
<template>
  <div class="login" >
    <div class="outer_label">
<!--      <img class="inner_label logaxiosin_logo" src="src/assets/logo.png">-->
    </div>
    <div class="login_form">
      <div id="ID" class="item">
      <el-input v-model.trim="ID" placeholder=" 请输入账号"/>
      </div>
      <div id="PW" class="item">
        <el-input type="password" v-model.trim="password" placeholder=" 请输入密码"></el-input>
      </div>
      <el-button class="login_bt" type="primary" @click="login" round :loading="isBtnLoading">登录</el-button>
<!--      <el-button class="login_bt" type="primary" @click="cancel" round>取消</el-button>-->
    </div>
  </div>

</template>

<script>
import axios from 'axios'
axios.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded'
export default {
  name: 'Login',
  methods: {
    // 登录界面取消按钮函数
    cancel () {
      // 返回上一页，如果没有上一页返回首页
      if (window.history.length <= 1) {
        this.$router.push({path: '/'})
        return false
      } else {
        this.$router.go(-1)
      }
      this.visible(false)
    },
    // 登录界面登录按钮函数
    login () {
      if (!this.ID) {
        // this.$message.error 常用于主动操作的反馈提示
        this.$message.error('请输入用户名')
        return
      }
      if (!this.password) {
        this.$message.error('请输入密码')
        return
      }
      // eslint-disable-next-line no-undef
      // eslint-disable-next-line no-unused-vars
      let params = {
        'username': this.ID,
        'password': this.password
      }
      var param = new URLSearchParams()
      param.append('username', this.ID)
      param.append('password', this.password)
      axios({
        method: 'post',
        url: 'http://localhost:8080/user/login',
        data: param
      })
        .then((response) => {
          console.log(response.data.data.userName)
          // sessionStorage.setItem()
        })
        .catch(function (error) {
          console.log(error)
        })
    }
  },
  // created () {
  //   if (JSON.parse(localStorage.getItem('user')) && JSON.parse(localStorage.getItem('user')).userName) {
  //     this.userName = JSON.parse(localStorage.getItem('user')).userName
  //     this.password = JSON.parse(localStorage.getItem('user')).password
  //   }
  // },
  computed: {
  },
  data () {
    return {
      ID: '',
      password: '',
      isBtnLoading: false
    }
  }
}
</script>

<style scoped>
  .login_form {
    padding-top: 10%;
    padding-left: 10%;
    padding-right: 10%;
  }
  .item {
    margin:10px 5px 15px 20px;

  }

</style>
