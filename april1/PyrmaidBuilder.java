public class PyrmaidBuilder {
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Function to figure out how many bricks will be required to build a pyramid.
   * This pyramid is a 3d object.
   * The first layer will start at 1 brick.
   * A second layer, for example would contain 9 bricks.
   * Next would be 25 bricks.
   * So in total 3 rows would be 1 + 9 + 25 = 35.
   *
   * This function should be recursive, no loops.
   */
  public static int numberOfBricksInPyramid(int rows) {
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  static void main(String[] args) {
    test("0 rows", 0, 0);
    test("1 rows", 1, 1);
    test("2 rows", 2, 1 + 9);
    test("3 rows", 3, 1 + 9 + 25);
    test("4 rows", 4, 1 + 9 + 25 + 49);
    test("5 rows", 5, 1 + 9 + 25 + 49 + 81);
  }

  public static void test(String name, int input, int expected) {
    final int real = numberOfBricksInPyramid(input);
    if (real == expected) {
      System.out.printf("%s: PASSED%n     'IS %d' == 'EXPECTS %d'%n%n", name, real, expected);
    } else {
      System.out.println("------------------------------------");
      System.out.printf("%s: FAILED%n     'IS %d' != 'EXPECTS %d'%n%n", name, real, expected);
      System.out.println("------------------------------------");
    }
  }
}
