<script>
export default {
  data() {
    return {
      awesome: true
    }
  },
  methods: {
    toggle() {
      this.awesome = !this.awesome
    }
  },
}
</script>
<template>
  <button @click="toggle">Toggle</button>
  <h1 v-if="awesome">vue is awesome</h1>
  <h1 v-else>Oh no :sad:</h1>
</template>
