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


public class ValidPhoneNumber {

    public static boolean  validPhoneNumber(String phoneNumber){
        // WRITE YOUR CODE HERE
        return false;
    }

    public static void main(String[] args)
    {
        String p1 = "(1234) 213-5543";  // false
		String p2 = "(123)-456-7890";   // false
		String p3 = "Hello world";      // false
		String p4 = "(123) 456-78901";  // false
		String p5 = "100 780-8999"; 	// false
		String p6 = "1207908797"; 		// false
		String p7 = "(120)7908797"; 	// false
		String p8 = "(120)423-8888"; 	// false
		String p9 = "520-999-7856"; 	// false
		String p10 = "(321) 654-9870";  // true
		String p11 = "(123) 456-7890";  // true

		test(p1, false);
		test(p2, false);
		test(p3, false);
		test(p4, false);
		test(p5, false);
		test(p6, false);
		test(p7, false);
		test(p8, false);
		test(p9, false);
		test(p10, true);
		test(p11, true);

    }

    public static void test(String x, boolean t){
         System.out.println(x + "\n\texpected: " + validPhoneNumber(x) + "\n\tactual:   " + t);
    }

}
