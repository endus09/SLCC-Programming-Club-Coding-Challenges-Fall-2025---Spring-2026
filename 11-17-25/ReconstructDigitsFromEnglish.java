/**
 * Welcome to the programming club!
 * 
 * Today you will be given a string, in this string will be letters of english words
 * for each digit 1-9.
 * 
 * Your job will be to construct a new string which translates the english digit string
 * into the numeral string.
 * 
 * Example:
 * "owoztneoer" == "012"
 * Because the string has the letters for "zero", "one", and "two"
 * Note: The output is expected to be sorted in accending order
 * 
 * From: https://leetcode.com/problems/reconstruct-original-digits-from-english/?envType=problem-list-v2&envId=string
 */
class ReconstructDigitsFromEnglish {

    public static String originalDigits(String s) {
        return ""; // TODO
    }

    public static void main(String[] args) {
        TestCase("fviefuro", "45");
        TestCase("owoztneoer", "012");
        TestCase("sevfoenur", "47");
    }

    public static void TestCase(String input, String expected) {
        var result = originalDigits(input);
        System.out.printf("======= Test %s =======\n", (result.equals(expected) ? "Passed" : "Failed"));
        System.out.printf("Expected: %s\n", expected);
        System.out.printf("Got:      %s\n", result);
        System.out.println("====================");
    }
}
