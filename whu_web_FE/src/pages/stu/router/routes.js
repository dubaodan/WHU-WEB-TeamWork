import Home from '../views/Home/Home'
import Login from '../components/Register-Login/Login'
import Register from '../components/Register-Login/Register'
// eslint-disable-next-line camelcase
import Setting from '@/pages/stu/components/Customer-Center/Setting'
import Account from '@/pages/stu/components/Customer-Center/Account'
import Profile from '@/pages/stu/components/Customer-Center/Profile'
import Settings from '@/pages/stu/components/Muscle-Center/Settings'
import Article from '@/pages/stu/components/Muscle-Center/Article'
import Video from '@/pages/stu/components/Muscle-Center/Video'
import Discuss from '@/pages/stu/components/Muscle-Center/Discuss'
import Prevention from '../views/Prevention/Prevention'
import Food from '@/pages/stu/views/Food/Food'
import Tools from '@/pages/stu/views/Tools/Tools'
export default[
  {
    path: '/',
    component: Home
  },
  {
    path: '/Home',
    component: Home
  },
  {
    path: '/Prevention',
    component: Prevention
  },
  {
    path: '/Tools',
    component: Tools
  },
  {
    path: '/Food',
    component: Food
  },
  {
    path: '/Login',
    component: Login
  },
  {
    path: '/Register',
    component: Register
  },
  {
    path: '/Setting',
    component: Setting,
    children: [
      {
        path: 'Account',
        component: Account
      },
      {
        path: 'Profile',
        component: Profile
      }
    ]
  },
  {
    path: '/Settings',
    component: Settings,
    children: [
      {
        path: 'Article',
        component: Article
      },
      {
        path: 'Video',
        component: Video
      },
      {
        path: 'Discuss',
        component: Discuss
      }
    ]
  }
]
