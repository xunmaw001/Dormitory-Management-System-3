import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import weishengtongbao from '@/views/modules/weishengtongbao/list'
    import shebeibaoxiu from '@/views/modules/shebeibaoxiu/list'
    import sushezhang from '@/views/modules/sushezhang/list'
    import youxiushezhangpingbi from '@/views/modules/youxiushezhangpingbi/list'
    import sushehao from '@/views/modules/sushehao/list'
    import susherenyuandiaodong from '@/views/modules/susherenyuandiaodong/list'
    import qingjiaxinxi from '@/views/modules/qingjiaxinxi/list'
    import susherenyuanshangbao from '@/views/modules/susherenyuanshangbao/list'
    import messages from '@/views/modules/messages/list'
    import sushetonggao from '@/views/modules/sushetonggao/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
          ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
          ,{
	path: '/weishengtongbao',
        name: '卫生通报',
        component: weishengtongbao
      }
          ,{
	path: '/shebeibaoxiu',
        name: '设备报修',
        component: shebeibaoxiu
      }
          ,{
	path: '/sushezhang',
        name: '宿舍长',
        component: sushezhang
      }
          ,{
	path: '/youxiushezhangpingbi',
        name: '优秀舍长评比',
        component: youxiushezhangpingbi
      }
          ,{
	path: '/sushehao',
        name: '宿舍号',
        component: sushehao
      }
          ,{
	path: '/susherenyuandiaodong',
        name: '宿舍人员调动',
        component: susherenyuandiaodong
      }
          ,{
	path: '/qingjiaxinxi',
        name: '请假信息',
        component: qingjiaxinxi
      }
          ,{
	path: '/susherenyuanshangbao',
        name: '宿舍人员上报',
        component: susherenyuanshangbao
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/sushetonggao',
        name: '宿舍通告',
        component: sushetonggao
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
