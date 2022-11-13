import Vue from "vue";
import VueRouter from "vue-router";
import IdealListView from "@/views/IdealListView.vue";
import IdealCreateView from "@/views/IdealCreateView.vue";
import IdealLoginView from "@/views/IdealLoginView.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    component: IdealLoginView,
  },
  {
    path: "/list",
    name: "list",
    component: IdealListView,
  },
  {
    path: "/create",
    name: "create",
    component: IdealCreateView,
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
