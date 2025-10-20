import java.util.Arrays;

/**
 * Welcome to another week of coding challenges,
 * you'll be happy to know we are not doing 2D arrays this week!!!!
 * 
 * This week we will be doing cellular automata, specifically rule 110.
 * 
 * Your goal is to generate the next step of the automaton given the previous step's array,
 * a "neighborRule", and a "newCellRule"
 * 
 * In Rule 110, the pattern rules go as follows:
 * 
 * 				  |-----|-----|-----|-----|-----|-----|-----|-----|
 * Neighbor Rule: | 111 | 110 | 101 | 100 | 011 | 010 | 001 | 000 |
 * 				  |-----|-----|-----|-----|-----|-----|-----|-----|
 * 
 * 				  |-----|-----|-----|-----|-----|-----|-----|-----|
 * newCell Rule:  |  0  |  1  |  1  |  0  |  1  |  1  |  1  |  0  | (110 in binary by the way)
 * 				  |-----|-----|-----|-----|-----|-----|-----|-----|
 * 
 * Given The Previous Board Pattern:
 * 
 * 		0	0	0	0	0	0	0	0	0	0
 * 		^	^	^
 * 		|-------|	
 * 			|
 * 		 Step 1.
 * 
 * 1. Check the neighbors, in this case it would be: [0 0 0]
 * 2. Find the pattern in the "Neighbor Rule" rule set, 
 * 	  [0 0 0] is the 8th  element (7th index) in neighbor ruleset.
 * 3. In the new board take the index of the neighbor ruleset -- 7 in this case --
 * 	  and place the newCell[7] element at index 0 of the new board
 * 4. move on to the next index in the board and previous board.
 * 
 * For a visual representation of the rule see:
 * https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/One-d-cellular-automaton-rule-110.gif/250px-One-d-cellular-automaton-rule-110.gif
 *
 * For more information on Rule 110
 * https://en.wikipedia.org/wiki/Rule_110
 * 
 * I urge you to look at the visual representation, it WILL help
 * 
 * @author Bryson Crader
 */
class Rule110 {

	// Rule 110 Rule Sets:
	static private String[] neighborRuleSet = {"111","110","101","100","011","010","001","000"};
	static private char[]   newCellRuleSet = {'0','1','1','0','1','1','1','0'};
  
	/**
	 * IMPLEMENT YOUR CODE HERE:
	 * 
	 * @param lastBoard The board to apply the rules to
	 * @param neighborRule The rule to check neighbors, one is provided in this challenge "neighborRuleSet", but you can also set your own
	 * @param newCellRule The rule to set the cells in the new board, one is provided in this challenge "newCellRuleSet", but you can also set your own
	 * @return A new board with the rules applied to paramter "lastBoard" once
	 */
	public static char[] stepBoard(char[] lastBoard, String[] neighborRule, char[] newCellRule) {
    return null;
	}


	/**
	 * Helper Function For Better Visuals In Test Cases
	 * 
	 * NOTE: May Look Strange If Font Is Not The Same Size For Each Character
	 * 
	 * @param board The Board (char array)
	 * @param filled The character to use if the cell is filled
	 * @param empty The character to use if the cell is empty
	 * @return A String Of The Characters On The Board
	 */
	public static String boardToString(char[] board, char filled, char empty) {
		StringBuilder sb = new StringBuilder();
		for (char c : board)
			sb.append((c == '1' ? filled+" " : empty+" "));
		return sb.toString();
	}
	/**
	 * Helper Function To Print A State Of The Board
	 * 
	 * NOTE: May Look Strange If Font Is Not The Same Size For Each Character
	 * 
	 * @param board The Board (char array)
	 */
	public static void printBoard(char[] board) {
		System.out.printf("%s\n", boardToString(board,'*',' '));
	}
	

	public static void main(String[] args) {
		char[] emptyBoard = {'0','0','0','0','0','0','0','0','0','0'};
		runTest(emptyBoard, 5, new char[]{'0','0','0','0','0','0','0','0','0','0'});

		char[] lastCellFilled = {'0','0','0','0','0','0','0','0','0','1'};
		runTest(lastCellFilled, 10, new char[]{'1','1','0','0','0','0','1','1','0','1'});
		
		char[] fullCellBoard = {'1','1','1','1','1','1','1','1','1','1'};
		runTest(fullCellBoard, 20, new char[]{'1','0','0','0','1','1','0','0','0','1'});

		char[] first3Filled = {'1','1','1','0','0','0','0','0','0','0'};
		runTest(first3Filled, 50, new char[]{'1','1','1','0','0','0','0','0','0','0'});

		char[] middleFilled = {'0','0','0','0','1','1','0','0','0','0'};
		runTest(middleFilled, 100, new char[]{'1','1','1','1','1','1','0','0','0','0'});
	}


	public static void runTest(char[] board, int iterations, char[] expected) {
		char[] result = board;
		for (int i = 0; i < iterations; i++) {
			result = stepBoard(result, neighborRuleSet, newCellRuleSet);
			System.out.print(i + ": ");
			printBoard(result);
		}
		System.out.printf("\n= = = Test %s = = =\n", Arrays.equals(result, expected) ? "Passed" : "Failed");
		System.out.printf("Expected: |%s|\n", boardToString(expected, '*', '_'));
		System.out.printf("Got:      |%s|\n", boardToString(result, '*', '_'));
		System.out.printf("= = = = = = = = = = = =\n\n");
	}
}

