public class GetSum {
  /**
   * Get the sum of each number in a string.
   * For example "1234" you would do as 1 + 2 + 3 + 4.
   * There may me other characters in the string.
   * For example "12steamedhams34" would also be 1 + 2 + 3 + 4
   */
  public static int getSumOfNumbers(String message) {

  }

  public static void main(String[] args) {
    test("Just A Number", "2", "2");
    test("Multiple Numbers", "1234", "10");
    test("Multiple Numbers not in order", "848204", "26");
    test("Char in between", "848a204", "26");
    test("Chars in between", "8b4c8a2j0i4", "26");
    test("Chars in between but more", "848 Because of the 2 Implication 04", "26");
    test("Empty String", "", "0");
    test("No numbers", "Can I offer you a nice egg in this trying time?", "0");
  }

  public static void test(String name, String input, String expected) {
    final String real = String.valueOf(getSumOfNumbers(input));
    if (real.equals(expected)) {
      System.out.printf("%s: PASSED%n     'IS %s' == 'EXPECTS %s'%n%n", name, real, expected);
    } else {
      System.out.printf("%s: FAILED%n     'IS %s' != 'EXPECTS %s'%n%n", name, real, expected);
    }
  }
}
