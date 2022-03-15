import Vue from 'vue'
import VueRouter from 'vue-router'
//mport HomeView from '../views/HomeView.vue'
import ItemDetail from '../views/ItemView.vue'

Vue.use(VueRouter)

/** 
const routes = [
  /*
  {
    path: '/',
    name: 'home',
    component: HomeView
  },

  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import('../views/AboutView.vue')
  }
]
*/

const router = new VueRouter({
  routes: [
      // les parties dynamiques commencent par un deux-points
      { path: '/item/:name', component: ItemDetail }
  ]
})

export default router
