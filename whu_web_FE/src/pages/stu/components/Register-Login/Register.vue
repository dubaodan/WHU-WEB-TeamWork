//注册界面
<template>
  <div class="register_form">
    <!--     input 框: trim 自动过滤用户输入的首尾空格 -->
    <div class="item">
      <input v-model.trim="ID" placeholder=" 请输入账号 ">
    </div>
    <div class="item">
      <input type="password" v-model.trim="password" placeholder=" 请输入密码">
    </div>
    <div class="item">
      <input type="password" v-model.trim="confirmPassword" placeholder=" 请再次输入密码">
    </div>
    <div>
      <el-button type="primary" @click="register">注册</el-button>
<!--      <el-button type="primary" @click="cancel">取消</el-button>-->
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'Register',
  methods: {
    // 注册界面取消按钮函数
    cancel () {
      // 返回上一页，如果没有上一页返回首页
      if (window.history.length <= 1) {
        this.$router.push({path: '/'})
        return false
      } else {
        this.$router.go(-1)
      }
    },
    // 注册界面登录按钮函数
    register () {
      if (!this.ID) {
        // this.$message.error 常用于主动操作的反馈提示
        this.$message.error('请输入用户名')
        return
      }
      if (this.password == null) {
        this.$message.error('请输入密码')
        return
      }
      if (this.password !== this.confirmPassword) {
        this.$message.error('两次输入密码不一致')
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
        url: 'http://localhost:8080/user/register',
        data: param
      })
        .then((response) => {
          console.log(response.data)
          if (response.data.resultCode === 200) {
            alert(response.data.message)
            location.reload()
          }
          if (response.data.resultCode === 500) {
            alert(response.data.message)
          }
        })
        .catch(function (error) {
          console.log(error)
          alert('注册失败')
        })
    }
  },
  data () {
    return {
      // 新建了名为radio的数据模型，通过v-model把两个单选按钮都绑定radio
      ID: '',
      inputContent1: '',
      inputContent2: ''
    }
  }
}
</script>

<style scoped>
  .register_form {
    padding-top: 10%;
    padding-left: 10%;
    padding-right: 10%;
  }
.item {
  margin:10px 5px 15px 20px;

}
</style>
