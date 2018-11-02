public class ArrayMethods{
  /*
     *PART 1
     */
     private static int arraySum(int[]ary) {
       int sum = 0;
       for (int i = 0; i <ary.length; i++) {
         sum+= ary[i];
       }
       return sum;
     }
     public static int rowSum(int[][] ary, int x){
       return arraySum(ary[x]);
     }
      //returns the sum of the elements in Row x of ary.


  }
