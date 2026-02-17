public class IsOverlapping {
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns true if the rectangles are Overlapping.
   * Hint: Check if the left side of a is less than the right side of b.
   */
  public static boolean isOverlapping(Rect a, Rect b) {
    return false;
  }

  /**
   * Returns true if the circles are Overlapping.
   * Hint: Have you heard of the distance formula?
   * Bonus Challange: Don't use Square Root
   */
  public static boolean isOverlapping(Circle a, Circle b) {
    return false;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  record Rect(float x, float y, float width, float height) {}
  record Circle(float x, float y, float radius) {}

  public static void main(String[] args) {
    test("RECT Partial Overlap", new Rect(0, 0, 10, 10), new Rect(5, 5, 10, 10), true);
    test("RECT Contained Inside", new Rect(0, 0, 10, 10), new Rect(2, 2, 5, 5), true);
    test("RECT Identical Rectangles", new Rect(0, 0, 10, 10), new Rect(0, 0, 10, 10), true);
    test("RECT Touching Edge Right", new Rect(0, 0, 10, 10), new Rect(10, 0, 5, 10), false);
    test("RECT Touching Edge Top", new Rect(0, 0, 10, 10), new Rect(0, 10, 10, 5), false);
    test("RECT Touching Corner", new Rect(0, 0, 10, 10), new Rect(10, 10, 5, 5), false);
    test("RECT Separate Right", new Rect(0, 0, 10, 10), new Rect(20, 0, 5, 5), false);
    test("RECT Separate Left", new Rect(20, 0, 10, 10), new Rect(0, 0, 5, 5), false);
    test("RECT Separate Above", new Rect(0, 20, 10, 10), new Rect(0, 0, 10, 10), false);
    test("RECT Separate Below", new Rect(0, 0, 10, 10), new Rect(0, -20, 10, 10), false);
    test("RECT Overlap Negative Coordinates", new Rect(-10, -10, 15, 15), new Rect(-5, -5, 10, 10), true);
    test("RECT Thin Vertical Overlap", new Rect(0, 0, 10, 10), new Rect(9, 0, 5, 10), true);
    test("RECT Thin Horizontal Overlap", new Rect(0, 0, 10, 10), new Rect(0, 9, 10, 5), true);
    test("RECT Zero Width", new Rect(0, 0, 0, 10), new Rect(0, 0, 10, 10), false);
    test("RECT Zero Height", new Rect(0, 0, 10, 0), new Rect(0, 0, 10, 10), false);

    test("CIRCLE Partial Overlap", new Circle(0, 0, 10), new Circle(15, 0, 10), true);
    test("CIRCLE Contained Inside", new Circle(0, 0, 10), new Circle(2, 2, 3), true);
    test("CIRCLE Identical Circles", new Circle(0, 0, 10), new Circle(0, 0, 10), true);
    test("CIRCLE Touching Externally", new Circle(0, 0, 10), new Circle(20, 0, 10), false);
    test("CIRCLE Separate", new Circle(0, 0, 10), new Circle(25, 0, 10), false);
    test("CIRCLE Far Apart", new Circle(0, 0, 5), new Circle(100, 100, 5), false);
    test("CIRCLE Overlap Negative Coordinates", new Circle(-10, -10, 10), new Circle(-5, -5, 10), true);
    test("CIRCLE Tiny Overlap", new Circle(0, 0, 10), new Circle(19.999f, 0, 10), true);
    test("CIRCLE Tiny Gap", new Circle(0, 0, 10), new Circle(20.001f, 0, 10), false);
    test("CIRCLE Zero Radius Inside", new Circle(0, 0, 0), new Circle(0, 0, 10), true);
  }

  public static void test(String name, Rect input, Rect input2, boolean expected) {
    final boolean real = isOverlapping(input, input2);
    if (real == expected) {
      System.out.printf("%s: PASSED%n     'IS %s' == 'EXPECTS %s'%n%n", name, real, expected);
    } else {
      System.out.println("------------------------------------");
      System.out.printf("%s: FAILED%n     'IS %s' != 'EXPECTS %s'%n%n", name, real, expected);
      System.out.println("------------------------------------");
    }
  }

  public static void test(String name, Circle input, Circle input2, boolean expected) {
    final boolean real = isOverlapping(input, input2);
    if (real == expected) {
      System.out.printf("%s: PASSED%n     'IS %s' == 'EXPECTS %s'%n%n", name, real, expected);
    } else {
      System.out.println("------------------------------------");
      System.out.printf("%s: FAILED%n     'IS %s' != 'EXPECTS %s'%n%n", name, real, expected);
      System.out.println("------------------------------------");
    }
  }
}
