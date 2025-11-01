
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Welcome To Another Week Of Coding Challenges!
 * 
 * This Week We Are Doing What I Call "Roman Prefix Calculator": A Mix Between Roman Numerals And A Prefix Notation Calculator
 * First Step Is Figuring Out Roman Numerals:
* 
* 	I = 1
* 	V = 5
* 	X = 10
* 	L = 50
* 	C = 100
* 
* 	III = 3
* 	XII = 12
* 	IX = 9
* 	XLV = 45 You Can Think Of As (10 - 50 + 5)
* 	IIXX = 18 You Can Think Of As (2 - 20)
* 
* (10 - 50, Is Typically Negative 40, But For Sake Of Demonstration, The Values Are Where They Appear In The Roman Numeral (i.e. 10 Came Before 50),
* Since We Aren't Doing Negatives, You May Also Simply Return An Absolute Value, If It Makes More Sense)
* 
 * The Next Stage Is Prefix Notation:
 * 
 * 	In Prefix Notation, The Operation Comes Before The Left And Right Values: 
 * 		(+ 1 1)
 * 	This Is Exactly The Same Operation As
 * 		1 + 1
 * 
 * 	You Can Also Chain Operations:
 * 		(* (+ 2 3) 5)
 * 	Which Is The Same As:
 * 		(2 + 3) * 5
 * 
 * Notes:
 * 	- Input Numerals Will Always Be Less Than Or Equal 100, But May Contain The C Character
 *  - IIII And IV Are The Same And Are Equally Valid Historically
 * 	- Parenthesis Will Not Be Used For The Test Inputs, 
 * 			So You Will Get "+ I I" As An Example Rather Than "(+ I I)"
 * 			And "* * III III III" Instead Of "(* (* III III) III)"
 * 			They Evaluate The Same, But Just Keep This In Mind
 * 
 * @author Bryson Crader
 */

public class RomanPrefixCalculator {

	// PART 1: Roman Numerals
	private static int RomanNumeralToInt(String numeral) {
    	return 0;
	}

	// PART 2: Calculator
	public static int EvaluateRomanPrefixNotation(String str) {
    	return 0;
	}

	public static void main(String[] args) {
		RunTest("+ I I", 2);
		RunTest("* + I I II", 4);
		RunTest("* - I I II", 0);
		RunTest("/ L C", 2);
		RunTest("- XLV X", 35);
		RunTest("+ XXII IV", 26);
		RunTest("* * * I II III IIII", 24);
		RunTest("+ + VII II XC", 99);
	}	

	public static void RunTest(String input, int expected) {
		int result = EvaluateRomanPrefixNotation(input);
		System.out.printf("\n= = = Test %s = = =\n", result == expected ? "Passed" : "Failed");
		System.out.printf("Expected: %s\n", expected);
		System.out.printf("Got:      %s\n", result);
		System.out.printf("= = = = = = = = = = = =\n\n");
	}


}
