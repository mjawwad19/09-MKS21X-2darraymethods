public class ArrayMethods{
     /*
     *PART 1

     returns the sum of the elements in Row x of ary. */
    public static int rowSum(int[][] ary, int x) {
      if (x > ary.length || x < 0) return 0;
      int sum = 0;
      for (int i = 0; i < ary[x].length; i++) {
        sum += ary[x][i];
      }
      return sum;
    }
    /*returns the sum of the elements in Column x
    of ary (careful with rows of different lengths!).*/
    public static int columnSum(int[][] ary, int x) {
      int sum = 0;
      for (int i = 0; i <ary.length; i++) {
        if (x < ary[i].length) {
          //this takes care of diff length rows
          sum += ary[i][x];
        }
      }
      return sum;
    }
    /*
   *PART 2 - use prior methods where appropriate
   returns an array of the row sums for each row of ary.
   Index i of the return array contains the sum of elements
   in row i.*/
   public static int[] allRowSums(int[][] ary) {
     int[] rowSums = new int[ary.length];
     for (int i = 0; i <ary.length; i++) {
       rowSums[i] = rowSum(ary, i);
       // hehe cheat :)
     }
     return rowSums;
   }

  /*
  Returns an array with the column sum of each column of ary.
  When a row is not long enough to reach the column count it as a zero.
  (NO indexOutOfBounds should ever occur)
  Index i of the return array contains the sum of elements in column i,
  ignoring any rows that are too short.
  The length of the returned array should be the length of the LONGEST array in ary.
  */
  public static int[] allColSums(int[][] ary){
    int maxLength = 0;
    for (int i = 0; i <ary.length; i++) {
      if (maxLength < ary[i].length) {
        maxLength = ary[i].length;
      }
    }
    int[] colSums = new int[maxLength];
    for (int i = 0; i <ary.length; i++) {
      colSums[i] = columnSum(ary, i);
    }
    return colSums;
  }
  //helper for part3
  private static boolean isMagic(int[] ary) {
    if (ary.length == 0) {return true;}
    int val = ary[0];
    for (int i = 1; i <ary.length; i++) {
      if (val != ary[i]) return false;
    }
    return true;
  }
  /*
  *PART 3 - use prior methods where appropriate
  checks if the array is row-magic (this means that every row has the same row sum).
  */
  public static boolean isRowMagic(int[][] ary){
    return isMagic(allRowSums(ary));
    //hehe cheat
  }
  //checks if the array is column-magic (this means that every column has the same column sum).
  public static boolean isColumnMagic(int[][] ary){
    return isMagic(allColSums(ary));
    //hehe cheat
  }

}
