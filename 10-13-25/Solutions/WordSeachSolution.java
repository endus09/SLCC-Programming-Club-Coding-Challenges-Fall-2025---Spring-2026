
import java.util.LinkedList;
import java.util.concurrent.Callable;


/**
 * For visual view of how algorithm should work, visit: https://leetcode.com/problems/word-search/description/
 * 
 * Welcome to another week of coding challenges!
 * 
 * This week you will be given a 2d grid of characters of size M x N as input as well as a target word.
 * 
 * You must go through the grid without repeating any cells and return if there is a path that contains the target word
 * 
 * You can only travel to cells to the sides and top and bottom of the current cell.
 * 
 * Example:
 * m = board.length
 * n = board[i].length
 * target = 'ABFG'
 * 
 * |---|---|---|---|
 * | A | B | C | D |
 * |---|---|---|---|
 * | E | F | G | H |
 * |---|---|---|---|
 * | I | J | K | L |
 * |---|---|---|---|
 * 
 * the target 'ABFG' exists: you can travel the path (0,0) -> (1,0) -> (1,1) -> (2,1)
 * @author Bryson Crader, Leet Code: https://leetcode.com/problems/word-search
 */
class WordSearch {

	private static char[][] copyBoard(char[][] board) {
		char[][] mat = new char[board.length][];
		for(int i = 0; i < board.length; i++)
			mat[i] = board[i].clone();
		return mat;
	}

	private static char boundsCheck(char[][] board, int x, int y) {
		if (y < 0 || y >= board.length) return '_';
		if (x < 0 || x >= board[y].length) return '_';
		return board[y][x];
	}

	private static boolean searchForWord(char[][] board, int startX, int startY, String targetWord) {
		// all possible sucessful next-steps
		java.util.Queue<Callable<Boolean>> todoqueue = new LinkedList<>();
		
		if (targetWord.isEmpty()) return true;
		// top
		if (boundsCheck(board, startX, startY-1) == targetWord.charAt(0)) {
			var b = copyBoard(board);
			b[startY-1][startX] = '_';
			todoqueue.add(()->searchForWord(b, startX, startY-1, targetWord.substring(1)));
		}
		// bottom
		if (boundsCheck(board, startX, startY+1) == targetWord.charAt(0)) {
			var b = copyBoard(board);
			b[startY+1][startX] = '_';
			todoqueue.add(()->searchForWord(b, startX, startY+1, targetWord.substring(1)));
		}
		// left
		if (boundsCheck(board, startX-1, startY) == targetWord.charAt(0)) {
			var b = copyBoard(board);
			b[startY][startX-1] = '_';
			todoqueue.add(()->searchForWord(b, startX-1, startY, targetWord.substring(1)));
		}
		// right
		if (boundsCheck(board, startX+1, startY) == targetWord.charAt(0)) {
			var b = copyBoard(board);
			b[startY][startX+1] = '_';
			todoqueue.add(()->searchForWord(b, startX+1, startY, targetWord.substring(1)));
		}
		for (var todo : todoqueue) {
			try {
				if (todo.call() == true) return true;	
			} catch (Exception e) {
			}
		}
		return false;
	}

	public static boolean wordExistsInBoard(char[][] board, String targetWord) {
		// all possible sucessful next-steps
		java.util.Queue<Callable<Boolean>> todoqueue = new LinkedList<>();

		for (int y = 0; y < board.length; y++) {
			for (int x = 0; x < board[y].length; x++) {
				// check to see if character is a match
				if (board[y][x] == targetWord.charAt(0)) {
					board[y][x] = '_';
					int atX = x;
					int atY = y;
					// if so add it to the "possiblity queue"
					todoqueue.add(()->searchForWord(board, atX, atY, targetWord.substring(1)));
				}
			}
		}

		// run all possible points in queue
		for (var todo : todoqueue) {
			try {
				if (todo.call() == true) return true;	
			} catch (Exception e) {
			}
		}
		return false;
	}

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
