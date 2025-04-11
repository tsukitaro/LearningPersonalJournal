<script>
export default {
  data() {
    return {
      count: 0
    }
  },
  methods: {
    increment() {
      this.count++
}
  },  
}
</script>

<template>
  <button v-on:click="increment">
    {{ count }}
  </button>
  <button @click="increment">{{ count }}</button>
</template>
