public class ArrayMethods{
  /*
     *PART 1
     */
    public static int rowSum(int[][] ary, int x) {
      if (x > ary.length || x < 0) return 0;
      int sum = 0;
      for (int i = 0; i < ary[x].length; i++) {
        sum += ary[x][i];
      }
      return sum;
    }


  }
