import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import LoginForm from "@/components/LoginForm.vue";
import User from "../views/User.vue";
import UserList from "@/components/user/UserList.vue";
import UserRegist from "@/components/user/UserRegist.vue";
import UserDetail from "@/components/user/UserDetail.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "_________",
    name: "Login",
    _________: _________,
  },
  {
    _________: "_________",
    _________: User,
    _________: [
      {
        _________: "_________",
        _________: "Regist",
        _________: _________,
      },
      {
        _________: "_________",
        _________: "List",
        _________: _________,
      },
      {
        _________: "_________",
        _________: "Detail",
        _________: _________,
      },
    ],
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
