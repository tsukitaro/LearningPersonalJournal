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
  mounted() {
    console.log(`El conteo inicial es ${this.count}`)
  }
}

</script>

<template>
  <button @click="increment">El conteo inicial es de: {{ count }}</button>
</template>
