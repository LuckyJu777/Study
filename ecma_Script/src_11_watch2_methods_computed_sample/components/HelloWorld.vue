<template>
   <div>
      값: <input type="text" v-model="num"><br>
      <button v-on:click="xxx">xxx method call</button><br>    
      변경된 값 :{{num}}
      {{yyy}}
     

   </div>
</template>

<script>
export default {
   name:"HelloWorld",
   props:{},
   data:function(){
      return {
         num:10
      }
   },
   ///////////////////////
   watch:{
      num:function(changeValue){
         console.log("watch xxx실행====", this.num,"\t", changeValue );
      }
   },
   //////////////////////
   methods:{
      xxx:function(){
         console.log("methods xxx실행=====", this.num);
         this.yyy;   //computed함수 호출 computed는 () 없이 호출
      }
   },
   computed:{
      yyy:function(){
         console.log("computed yyy실행=====", this.num);
         return "";
      }
   }

}
</script>

<style>

</style>