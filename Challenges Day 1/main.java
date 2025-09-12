/*
 * Valid Phone Number
 * by Markus Gulla
 * 
 * Hello everyone!!!! Welcome to the first programming challenge of the club!
 * In today's challenge, you will be creating a function that receives a string, and returns true if it is in the form of a phone number.
 * Assume that any integer from 0 to 9 in any of the spots will produce a valid phone number.
 * 
 * Here is the following format:
 * 
 *       (123) 456-7890
 * 
 * Do not forget the space after the closed parentheses!
 */


public class main{

    public static boolean  validPhoneNumber(String phoneNumber){
    // WRITE YOUR CODE HERE
        return false;
    }

    public static void main(String[] args)
    {
    // test phone numbers:
    String p1 = "(1234) 213-5543";  // false
    String p2 = "(123)-456-7890";   // false
    String p3 = "Hello world";      // false
    String p4 = "(123) 456-78901";  // false
    String p5 = "(321) 654-9870";   // true
    String p6 = "(123) 456-7890";   // true

    test(p1, false);
    test(p2, false);
    test(p3, false);
    test(p4, false);
    test(p5, true);
    test(p6, true);

    }

    public static void test(String x, boolean t){
         System.out.println(x + " returned: " + validPhoneNumber(x) + " and is supposed to be: " + t);
    }

}
