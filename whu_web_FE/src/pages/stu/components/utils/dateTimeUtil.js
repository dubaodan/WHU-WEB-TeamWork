// yy-mm-dd HH:mm:SS
export const localDateTimeFormat = (array) => {
  let timeFormat = ''
  timeFormat = array[0] + '-' + array[1] + '-' + array[2] + ' ' + array[3] + ':' + array[4] + ':' + array[5]
  return personalTimeUtil(timeFormat)
}

// 个性化时间显示
export const personalTimeUtil = (passDate) => {
  let passTime = Date.parse(passDate)
  let newTime = new Date().getTime()
  let shicha = newTime - passTime
  // 计算出相差天数
  let days = Math.floor(shicha / (24 * 3600 * 1000))
  // 计算出小时数
  let leave1 = shicha % (24 * 3600 * 1000) // 计算天数后剩余的毫秒数
  let hours = Math.floor(leave1 / (3600 * 1000))
  // 计算相差分钟数
  let leave2 = leave1 % (3600 * 1000) // 计算小时数后剩余的毫秒数
  let minutes = Math.floor(leave2 / (60 * 1000))
  // 判断返回
  let d = new Date(passDate)
  if (days >= 366) {
    return d.getFullYear() + '年' + (d.getMonth() + 1) + '月' + d.getDate() + '日'
  } else if (days > 1 && days < 366) {
    return (d.getMonth() + 1) + '月' + d.getDate() + '日'
  } else if (days === 1) {
    return '昨天'
  } else if (hours >= 1 && hours < 24) {
    return hours + '小时前'
  } else if (hours < 1 && minutes >= 1) {
    return minutes + '分钟前'
  } else {
    return '刚刚'
  }
}
