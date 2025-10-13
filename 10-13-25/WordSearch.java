/**
 * For visual view of how algorithm should work, visit: https://leetcode.com/problems/word-search/description/
 * 
 * Welcome to another week of coding challenges!
 * 
 * This week you will be given a 2d grid of characters (chars) of size M x N as input as well as a target word.
 * 
 * You must go through the grid without repeating any cells and return if there is a path that contains the target word
 * 
 * You can only travel to cells to the sides and top and bottom of the current cell.
 * 
 * Example:
 * Board Size: M * N
 *   - m = board.length
 *   - n = board[i].length
 * targetWord = "ABFG"
 * 
 * |---|---|---|---|
 * | A | B | C | D |
 * |---|---|---|---|
 * | E | F | G | H |
 * |---|---|---|---|
 * | I | J | K | L |
 * |---|---|---|---|
 * 
 * the target "ABFG" exists: you can travel the path (0,0) -> (1,0) -> (1,1) -> (2,1)
 *
 * @author Bryson Crader, Leet Code: https://leetcode.com/problems/word-search
 */
class WordSearch {
  
	public static boolean wordExistsInBoard(char[][] board, String targetWord) {
		return false;
	}

  // Helper Function To Print Out The Board
	public static void printBoard(char[][] board) {
		for (char[] yBoard : board) {
			for (char letter : yBoard)
				System.out.printf("%c ", letter);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		char[][] board1 = {{'A','B','C','D'}, {'E','F','G','H'},{'I','J','K','L'}};
		String word1 = "ABFG";
		char[][] board2 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word2 = "ABCCED";
		char[][] board3 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word3 = "SEE";
		char[][] board4 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word4 = "ABCB";

		runTest(wordExistsInBoard(board1, word1), true);
		runTest(wordExistsInBoard(board2, word2), true);
		runTest(wordExistsInBoard(board3, word3), true);
		runTest(wordExistsInBoard(board4, word4), false);
	}

	public static void runTest(boolean result, boolean expected) {
		System.out.printf("\n= = = Test %s = = =\n", result == expected ? "Passed" : "Failed");
		System.out.printf("Expected: %s\n", expected);
		System.out.printf("Got:      %s\n", result);
		System.out.printf("= = = = = = = = = = = =\n\n");
	}

}
