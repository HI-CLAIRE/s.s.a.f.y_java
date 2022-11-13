<template>
  <div class="container">
    <h2>💌 콩순's LOVE List 💌</h2>
    <button class="btn btn-danger d-grid mx-auto">
      <router-link to="/create" class="nav-link">내 맘 속에 저장</router-link>
    </button>
    <div v-if="ideals.length">
      <div class="card-group">
        <div
          v-for="(ideal, index) in ideals"
          :key="index"
          class="card"
          style="width: 18rem"
        >
          <img class="card-img-top" :src="ideal.picture" alt="Card image cap" />
          <div class="card-body">
            <h5 class="card-title">{{ ideal.name }}</h5>
            <p class="card-text">
              까먹지마 메모!: <br />
              {{ ideal.review }}
            </p>
          </div>
          <ul class="list-group list-group-flush">
            <li class="list-group-item">나이: {{ ideal.age }}</li>
            <li class="list-group-item">
              성별: {{ ideal.gender | genderFilter }}
            </li>
            <li class="list-group-item">키: {{ ideal.height }}</li>
            <li class="list-group-item">장르: {{ ideal.genre }}</li>
          </ul>
          <button class="btn btn-danger" @click="deleteIdeal(ideal)">
            삭제
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "IdealListContainer",
  created() {
    const idealList = localStorage.getItem("idealList");
    if (idealList) {
      this.ideals = JSON.parse(idealList);
    }
  },
  data() {
    return {
      ideals: [],
    };
  },
  filters: {
    genderFilter(value) {
      let [g] = value;
      if (g === "man") return "남자";
      else return "여자";
    },
  },
  methods: {
    deleteIdeal(ideal) {
      let idealList = JSON.parse(localStorage.getItem("idealList"));
      for (let i = 0; i < idealList.length; i++) {
        if (idealList[i].name === ideal.name) {
          idealList.splice(i, 1);
          break;
        }
      }
      localStorage.setItem("idealList", JSON.stringify(idealList));
      location.href = "/list";
    },
  },
};
</script>

<style>
h2 {
  padding: 20px;
  text-align: center;
}

.card {
  margin: 20px;
}
</style>
