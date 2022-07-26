import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import LoginForm from "@/components/LoginForm.vue";
import UserView from "../views/User.vue";
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
    path: "/login",
    name: "Login",
    component: LoginForm,
  },
  {
    path: "/user",
    name: "User",
    component: UserView,
    children: [
      {
        path: "regist",
        name: "Regist",
        component: UserRegist,
      },
      {
        path: "list",
        name: "List",
        component: UserList,
      },
      {
        path: "detail",
        name: "Detail",
        component: UserDetail,
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
