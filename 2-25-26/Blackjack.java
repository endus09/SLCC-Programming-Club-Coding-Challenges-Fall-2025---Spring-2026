public class Blackjack {
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Given an array of cards return if the value is <= 21.
   * Card values can range from 2 to 10 or may be a zero (ace).
   * If zero, the cards value can be 1 or 11 (Whatever benefits the player).
   * You can get mutliple zeros.
   */
  public static boolean blackjack(int[] cards) {
    return false;
  }

  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  static void main(String[] args) {
    test("Simple win", new int[] {10, 7}, true);
    test("Blackjack with ace", new int[] {10, 0}, true);
    test("Two aces and 9", new int[] {0, 0, 9}, true);
    test("Lose", new int[] {10, 10, 5}, false);
    test("Many aces Lose", new int[] {0, 0, 10, 10}, false);
  }

  public static void test(String name, int[] input, boolean expected) {
    final boolean real = blackjack(input);
    if (real == expected) {
      System.out.printf("%s: PASSED%n     'IS %b' == 'EXPECTS %b'%n%n", name, real, expected);
    } else {
      System.out.println("------------------------------------");
      System.out.printf("%s: FAILED%n     'IS %b' != 'EXPECTS %b'%n%n", name, real, expected);
      System.out.println("------------------------------------");
    }
  }
}
