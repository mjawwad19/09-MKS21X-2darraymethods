public class Drive2D {
  public static void main(String[] args) {
    int[][] multiC = new int[][]{
		{1,0,2,0},
		{2},
		{},
    {1,4,9,2}
		};
    System.out.println(ArrayMethods.rowSum(multiC, 0)); //3
    System.out.println(ArrayMethods.rowSum(multiC, 1)); //2
    System.out.println(ArrayMethods.rowSum(multiC, 2)); //0
    System.out.println(ArrayMethods.rowSum(multiC, 3)); //16
    System.out.println(ArrayMethods.columnSum(multiC, 0));

  }
}
