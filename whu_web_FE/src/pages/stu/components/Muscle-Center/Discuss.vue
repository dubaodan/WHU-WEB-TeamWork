<template>
  <div id="commentCard">
    <el-card id="comment">
      <pt_comment @doSend="doSend"
                  @doChidSend="doChidSend"
                  :commentList="commentList"
                  :commentNum="commentNum"
                  :avatar="avatar"
      />
    </el-card>
  </div>
</template>

<script>
import comment from 'hbl-comment'
import {postRequest} from '../utils/axiosUtils'
import {localDateTimeFormat} from '../utils/dateTimeUtil'
import {createNamespacedHelpers} from 'vuex'
const {mapGetters} = createNamespacedHelpers('userInfo')
export default {
  name: 'commentCard',
  data () {
    return {
      blogId: '',
      commentList: [
        {
          blogId: 1,
          commentUser: {
            blogId: 1,
            nickName: '健身小白',
            avatar: 'http://qzapp.qlogo.cn/qzapp/101483738/6637A2B6611592A44A7699D14E13F7F7/50'
          },
          content: '健身贵在坚持[哈哈][哈哈]',
          createDate: '2020-3-23 17:36:02',
          childrenList: [
            {
              blogId: 2,
              commentUser: {
                blogId: 2,
                nickName: '健身达人',
                avatar: ''
              },
              targetUser: {
                blogId: 1,
                nickName: '健身达人',
                avatar: 'http://qzapp.qlogo.cn/qzapp/101483738/6637A2B6611592A44A7699D14E13F7F7/50'
              },
              content: '加油，不要放弃!',
              createDate: '2020-3-24 17:45:26'
            }
          ]
        }
      ],
      commentNum: 0,
      avatar: ''
    }
  },
  mounted () {
    this.blogId = this.$route.params.id
    this.avatar = this.getAvatar
    this.load()
  },
  components: {
    pt_comment: comment
  },
  methods: {
    load () {
      const url = 'discuss/loadDiscussByBlogId'
      let params = {
        blogId: this.blogId
      }
      postRequest(url, params).then(resp => {
        let result = resp.data
        if (result.code === 200) {
          let valueList = result.data
          if (valueList.length > 0) {
            this.pushIntoDiscussList(valueList)
          } else {
            // 评论为空
          }
        } else {
          this.$alert('评论加载失败!', '失败!')
        }
      }, resp => {
        this.$alert('服务器维护中', '加载评论失败!')
      })
    },
    // 发送评论
    doSend (content) {
      let params = {
        'content': content,
        'userId': this.getUserId,
        'blogId': this.blogId
      }
      const url = '/discuss/sendDiscuss'
      postRequest(url, params).then(resp => {
        let result = resp.data
        if (result.code === 200) {
          this.commentList.unshift({
            id: '0',
            commentUser: {
              id: this.getUserId,
              nickName: this.getUsername,
              avatar: this.getAvatar
            },
            content: content,
            createDate: '刚才',
            childrenList: []
          })
        } else {
          this.$alert('发表评论失败!', '失败!')
        }
      }, resp => {
        // this.loading = false;
        this.$alert('服务器维护中', '失败!')
      })
    },
    // 发送回复
    doChidSend (content, commentUserId, commentId) {
      let params = {
        'content': content,
        'targetUserId': commentUserId,
        'discussId': commentId,
        'userId': this.getUserId
      }
      const url = '/reply/sendReply'
      postRequest(url, params).then(resp => {
        let result = resp.data
        if (result.code === 200) {
        } else {
          this.$alert('发表评论失败!', '失败!')
        }
      }, resp => {
        this.$alert('服务器维护中', '失败!')
      })
    },
    // 向commentList添加
    pushIntoDiscussList (list) {
      let result = []
      for (let values of list) {
        this.commentNum++
        let item = {
          id: '',
          commentUser: {
            id: '',
            nickName: '',
            avatar: ''
          },
          content: '',
          createDate: '',
          childrenList: []
        }
        item.id = values.discuss.id
        item.commentUser.id = values.discuss.userId
        item.commentUser.nickName = values.username
        item.commentUser.avatar = values.avatar
        item.content = values.discuss.content
        item.createDate = localDateTimeFormat(values.discuss.createDate)
        item.childrenList = values.replyPojoList.length > 0
          ? this.pushIntoReplyList(values.replyPojoList) : []
        this.commentNum += values.replyPojoList.length
        result.push(item)
      }
      this.commentList = result
    },
    pushIntoReplyList (replyPojoList) {
      let result = []
      for (let item of replyPojoList) {
        let reply = {
          id: 0,
          commentUser: {
            id: 0,
            nickName: '',
            avatar: ''
          },
          targetUser: {
            id: 0,
            nickName: '',
            avatar: ''
          },
          content: '',
          createDate: ''
        }
        reply.id = item.replyId
        reply.content = item.content
        reply.createDate = localDateTimeFormat(item.createDate)
        reply.commentUser.id = item.replyUser.id
        reply.commentUser.nickName = item.replyUser.username
        reply.commentUser.avatar = item.replyUser.avatar
        reply.targetUser.id = item.targetUser.id
        reply.targetUser.nickName = item.targetUser.username
        reply.targetUser.avatar = item.targetUser.avatar
        result.push(reply)
      }
      return result
    }
  },
  props: [],
  computed: {
    ...mapGetters(['getUserId', 'getUsername', 'getAvatar'])
  }
}
</script>

<style scoped>
  #comment {
    margin-top: 20px;
  }
</style>
