public class Driver {
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
      System.out.println("");
    }
  }
  public static void main(String[] args) {
    int[][] tester1 = new int[][]{
      {3,7,8,2,10},
      {4,6,7,4,9},
      {5,5,6,6,8},
      {10,10,5,5,0},
      {30,0,0,0,0}
    };
    int[][] tester2 = new int[][]{
      {3,4,5,10,30},
      {7,6,5,10},
      {8,7,6,5},
      {2,4,6,5},
      {10,9,8},
    };
    System.out.println();
    System.out.println(" ---------------------------------");
    System.out.println("|                                 |");
    System.out.println("|              START              |");
    System.out.println("|                                 |");
    System.out.println(" ---------------------------------");
    System.out.println("int[][] tester1:");
    printArray2(tester1);
    System.out.println();
    System.out.println("int[][] tester2:");
    printArray2(tester2);

    System.out.println();
    System.out.println("TESTING rowSum");
    System.out.println();
    System.out.println("ArrayMethods.rowSum(tester2, 0) should return 52");
    System.out.println(ArrayMethods.rowSum(tester2, 0));
    System.out.println("ArrayMethods.rowSum(tester2, 1) should return 28");
    System.out.println(ArrayMethods.rowSum(tester2, 1));
    System.out.println("ArrayMethods.rowSum(tester2, 2) should return 26");
    System.out.println(ArrayMethods.rowSum(tester2, 2));
    System.out.println("ArrayMethods.rowSum(tester2, 3) should return 17");
    System.out.println(ArrayMethods.rowSum(tester2, 3));
    System.out.println("ArrayMethods.rowSum(tester2, 4) should return 27");
    System.out.println(ArrayMethods.rowSum(tester2, 4));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING columnSum");
    System.out.println();
    System.out.println("ArrayMethods.columnSum(tester1, 0) should return 52");
    System.out.println(ArrayMethods.columnSum(tester1, 0));
    System.out.println("ArrayMethods.columnSum(tester1, 1) should return 28");
    System.out.println(ArrayMethods.columnSum(tester1, 1));
    System.out.println("ArrayMethods.columnSum(tester1, 2) should return 26");
    System.out.println(ArrayMethods.columnSum(tester1, 2));
    System.out.println("ArrayMethods.columnSum(tester1, 3) should return 17");
    System.out.println(ArrayMethods.columnSum(tester1, 3));
    System.out.println("ArrayMethods.columnSum(tester1, 4) should return 27");
    System.out.println(ArrayMethods.columnSum(tester1, 4));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING allRowSums");
    System.out.println();
    System.out.println("ArrayMethods.allRowSums(tester1) should return {30,30,30,30,30}");
    printArray1(ArrayMethods.allRowSums(tester1));
    System.out.println("\nArrayMethods.allRowSums(tester2) should return {52,28,26,17,27}");
    printArray1(ArrayMethods.allRowSums(tester2));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING allColSums");
    System.out.println();
    System.out.println("ArrayMethods.allColSums(tester1) should return {52,28,26,17,27}");
    printArray1(ArrayMethods.allColSums(tester1));
    System.out.println("\nArrayMethods.allColSums(tester2) should return {30,30,30,30,30}");
    printArray1(ArrayMethods.allColSums(tester2));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING isRowMagic");
    System.out.println();
    System.out.println("ArrayMethods.isRowMagic(tester1) should return true");
    System.out.println(ArrayMethods.isRowMagic(tester1));
    System.out.println("ArrayMethods.isRowMagic(tester2) should return false");
    System.out.println(ArrayMethods.isRowMagic(tester2));
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("TESTING isColumnMagic");
    System.out.println();
    System.out.println("ArrayMethods.isColumnMagic(tester1) should return false");
    System.out.println(ArrayMethods.isColumnMagic(tester1));
    System.out.println("ArrayMethods.isColumnMagic(tester2) should return true");
    System.out.println(ArrayMethods.isColumnMagic(tester2));
    System.out.println();
    System.out.println(" ---------------------------------");
    System.out.println("|                                 |");
    System.out.println("|             FINISH              |");
    System.out.println("|                                 |");
    System.out.println(" ---------------------------------");
  }
}
