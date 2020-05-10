const Mock = require('mockjs')
// const Random=Mock.Random
const preventionlist = [
  {
    ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrB9f0.jpg',
    Title: '腰肌劳损',
    Name: 'LumbarMuscleDegeneration',
    Description: '因腰部肌肉、韧带等软组织损伤导致疼痛 \n 好发于30～50岁的中青年人 \n 可表现出腰部疼痛及活动受限 \n 积极治疗后大多数可得到完全缓解'
  },
  {
    ImgSrc: 'https://s1.ax1x.com/2020/04/27/JWDQsA.jpg',
    Title: '筋膜炎',
    Name: 'Fasciitis',
    Description: '一种筋膜的无菌性炎症 \n 可能与劳损、潮湿、免疫因素等有关 \n 可有局部疼痛、肌肉痉挛、运动障碍等 \n 保守治疗为主，适当情况下可考虑手术'
  },
  {
    ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrB9f0.jpg',
    Title: '腰肌劳损',
    Name: 'LumbarMuscleDegeneration',
    Description: '因腰部肌肉、韧带等软组织损伤导致疼痛 \n 好发于30～50岁的中青年人 \n 可表现出腰部疼痛及活动受限 \n 积极治疗后大多数可得到完全缓解'
  },
  {
    ImgSrc: 'https://s1.ax1x.com/2020/04/27/JWDQsA.jpg',
    Title: '筋膜炎',
    Name: 'Fasciitis',
    Description: '一种筋膜的无菌性炎症 \n 可能与劳损、潮湿、免疫因素等有关 \n 可有局部疼痛、肌肉痉挛、运动障碍等 \n 保守治疗为主，适当情况下可考虑手术'
  },
  {
    ImgSrc: 'https://s1.ax1x.com/2020/04/24/JrB9f0.jpg',
    Title: '腰肌劳损',
    Name: 'LumbarMuscleDegeneration',
    Description: '因腰部肌肉、韧带等软组织损伤导致疼痛 \n 好发于30～50岁的中青年人 \n 可表现出腰部疼痛及活动受限 \n 积极治疗后大多数可得到完全缓解'
  },
  {
    ImgSrc: 'https://s1.ax1x.com/2020/04/27/JWDQsA.jpg',
    Title: '筋膜炎',
    Name: 'Fasciitis',
    Description: '一种筋膜的无菌性炎症 \n 可能与劳损、潮湿、免疫因素等有关 \n 可有局部疼痛、肌肉痉挛、运动障碍等 \n 保守治疗为主，适当情况下可考虑手术'
  }
]
Mock.mock('/prevention/list', 'get', preventionlist)
