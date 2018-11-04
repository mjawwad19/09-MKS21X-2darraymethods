public class Drive2D {
  //the printArray are borrowed from Vivian!
  public static void printArray1(int[]ary) {
    String result="{";
    for (int i = 0; i < ary.length; i++) {
      result+=ary[i];
      if (i != ary.length -1) {
        result+=", ";
      }
    }
    System.out.print(result+"}");
  }
  //ob
  public static void printArray2(int[][]ary) {
    for (int i = 0; i < ary.length; i++) {
      printArray1(ary[i]);
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int[][] multiC = new int[][]{
		{1,0,2,0},
		{2},
		{},
    {1,4,9,2}
		};
    printArray2(multiC);;
    System.out.println(ArrayMethods.rowSum(multiC, 0)); //3
    System.out.println(ArrayMethods.rowSum(multiC, 1)); //2
    System.out.println(ArrayMethods.rowSum(multiC, 2)); //0
    System.out.println(ArrayMethods.rowSum(multiC, 3)); // 16
    printArray1(ArrayMethods.allRowSums(multiC)); // [3, 2, 0, 16]
    System.out.println();
    System.out.println(ArrayMethods.columnSum(multiC, 0)); //4
    System.out.println(ArrayMethods.columnSum(multiC, 1)); //4
    System.out.println(ArrayMethods.columnSum(multiC, 2)); //11
    System.out.println(ArrayMethods.columnSum(multiC, 3)); //2
    printArray1(ArrayMethods.allColSums(multiC)); // [4, 4, 11, 2]
    System.out.println();
    

  }
}
