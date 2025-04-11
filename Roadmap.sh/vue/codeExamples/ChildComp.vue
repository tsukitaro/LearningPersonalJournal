<script>
export default {
  emits: ['response'],
  created() {
    this.$emits('response', 'Hello from the child')
  },
  props: {
    msg: String
  }
}
</script>
<template>
  <!-- <h2>A child Component!</h2> -->
  <slot>fallback content</slot>
  <h2>{{ msg || 'No props passed yet' }}</h2>

</template>
