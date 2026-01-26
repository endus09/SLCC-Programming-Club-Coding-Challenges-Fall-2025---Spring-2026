public class TranslateMessage {
  /**
   * Translate an encoded message into proper English.
   * Replace underscores with spaces.
   * Put spaces after periods.
   * Capitalize first letters of sentences.
   * the_quick_brown.fox. -> The quick brown. Fox.
   */
  public static String translateMessage(String message) {
    return message;
  }

  public static void main(String[] args) {
    test("Underscores", "&__&___&.", "&  &   &.");
    test("Period", "&.&.", "&. &.");
    test("Caps", "the.", "The.");
    test("Full", "the_quick_brown_fox.jumped_over_the.", "The quick brown fox. Jumped over the.");
  }

  public static void test(String name, String input, String expected) {
    final var real = translateMessage(input);
    if (real.equals(expected)) {
      System.out.printf("%s: PASSED%n     '%s' == '%s'%n%n", name, real, expected);
    } else {
      System.out.printf("%s: FAILED%n     '%s' != '%s'%n%n", name, real, expected);
    }
  }
}
