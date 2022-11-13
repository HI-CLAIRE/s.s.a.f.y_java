<template>
  <div class="container">
    <div class="mb-3">
      <label for="name" class="form-label">이름</label>
      <input type="text" class="form-control" id="name" v-model="name" />
    </div>
    <div class="mb-3">
      <label for="picture" class="form-label">사진</label>
      <input type="text" class="form-control" id="picture" v-model="picture" />
    </div>
    <div class="mb-3">
      <label for="age" class="form-label">나이</label>
      <input type="number" class="form-control" id="age" v-model="age" />
    </div>
    <div class="mb-3">
      <label for="height" class="form-label">키</label>
      <input type="number" class="form-control" id="height" v-model="height" />
    </div>
    <div class="mb-3">
      <div>성별</div>
      <input type="checkbox" v-model="gender" value="man" />남자
      <input type="checkbox" v-model="gender" value="woman" />여자
      <button @click="checkBox()" class="btn btn-danger">선택</button>
    </div>
    <div class="mb-3">
      장르
      <!--드롭다운-->
      <select v-model="genre">
        <option disabled value="">선택해!</option>
        <option>큐티</option>
        <option>섹시</option>
        <option>앙</option>
      </select>
    </div>
    <div class="mb-3">
      <label for="review" class="form-label">콩순이의 생각은?</label>
      <input type="text" class="form-control" id="review" v-model="review" />
    </div>
    <div class="mb-5">
      <button class="btn btn-danger" v-on:click="createIdeal">등록</button>
      <button class="btn btn-danger" v-on:click="createIdeal">
        <router-link to="/list" class="nav-link">돌아가기</router-link>
      </button>
    </div>
    <!-- <div>
      <p>ID: {{ id }}</p>
      <p>제목: {{ title }}</p>
      <p>감독: {{ director }}</p>
      <p>장르: {{ genre }}</p>
      <p>상영시간: {{ runningTime }}</p>
    </div> -->
  </div>
</template>

<script>
export default {
  name: "IdealCreateContainer",
  data() {
    return {
      name: "",
      picture: "",
      age: "",
      height: "",
      gender: [],
      genre: "",
      review: "",
    };
  },
  methods: {
    createIdeal() {
      const idealList = localStorage.getItem("idealList");
      let temp = [];
      if (idealList) {
        temp = JSON.parse(idealList);
      }

      let idealObj = {
        name: this.name,
        picture: this.picture,
        age: this.age,
        height: this.height,
        gender: this.gender,
        genre: this.genre,
        review: this.review,
      };

      temp.push(idealObj);

      localStorage.setItem("idealList", JSON.stringify(temp));

      this.$router.push("/list");
    },
    checkBox() {
      console.log("selected");
      this.gender;
    },
  },
};
</script>

<style>
.btn {
  margin: 5px;
}
</style>
