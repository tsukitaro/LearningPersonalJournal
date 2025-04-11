<script>
import ChildComp from './ChildComp.vue'
export default {
  components: {
    ChildComp
  },
  data() {
    return {
      greeting: 'Hello from parent',
      ChildMsg: 'No child msg yet'
    }
  },

}
</script>

<template>
  <!-- <ChildComp :msg="greeting" /> -->
  <ChildComp @response="(ms) => ChildMsg = ms" />
  <p>{{ ChildMsg }}</p>
  <childComp>This is a some slot conent</childComp>
</template>
