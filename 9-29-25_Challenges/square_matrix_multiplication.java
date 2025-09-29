/*
 * Square Matrix Multiplication
 * by Markus Gulla
 * 
 * Welcome to the third programming challenge of the club!
 * In today's challenge, you will be creating a function that receives two square
 * (n * n) matrices (2D arrays) and returns the product of the two.
 * Only square matrices will be given.
 * If you are not doing this challenge in the club, search how to multiply matrices.
 * If you are attending the club, Markus will show you how to multiply matrices.
 * 
 * Example:
 * 		
 * 	  A       B        C
 *  {1,2} X {3,2} =  {5,4}
 *  {3,2}   {1,1}   {11,8}
 * 
 */

public class square_matrix_multiplication {

	private static int[][] dotProduct(int[][] a, int[][] b) {
		// WRITE YOUR CODE HERE
		return null;
	}




	
	public static void main(String[] args) {
		exampleTest();
		basicTest();
	}

  public static void exampleTest() {
		
    int[][] a = {
    		{1,2}, 
    		{3, 2}
    		};
		
    int[][] b = {
    		{3,2}, 
    		{1, 1}
    		};
    
    int[][] expected = {
    		{5, 4},
    		{11, 8}
    		};
    
    int[][] actual = dotProduct(a, b);
    compare(actual, expected, "CASE 1");
  }
	
	public static void basicTest() {

		{
			int[][] a = { 
					{ 9, 7 }, 
					{ 0, 1 } 
					};
			
			int[][] b = { 
					{ 1, 1 }, 
					{ 4, 12 } 
					};

			int[][] expected = { 
					{ 37, 93 }, 
					{ 4, 12 } 
					};

			int[][] actual = dotProduct(a, b);
			compare(actual, expected, "CASE 2");
		}

		{

			int[][] a = { 
					{ 1, 2, 3 }, 
					{ 3, 2, 1 }, 
					{ 2, 1, 3 }};
			
			int[][] b = { 
					{ 4, 5, 6 }, 
					{ 6, 5, 4 }, 
					{ 4, 6, 5 }};
			
			int[][] expected = { 
					{ 28, 33, 29 }, 
					{ 28, 31, 31 }, 
					{ 26, 33, 31 } };

			int[][] actual = dotProduct(a, b);
			compare(actual, expected, "CASE 3");
		}
	}

	public static  void compare(int[][] a, int[][] b, String c){
		boolean t = true;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length; j++){
				if(a[i][j] != b[i][j])
				{
					System.out.println("FAILED " + c);
					t = false;
					break;
				}				
			}
			if(t == false) {break;}
		}
		if(t == true) {System.out.println("PASSED " + c);}
		if(t == false){
			System.out.println("YOUR ANSWER:");
			for(int i = 0; i < a.length; i++){
				System.out.printf("{");
				for(int j = 0; j < a.length; j++){
						System.out.printf(""+a[i][j]+", ");	
				}
				System.out.printf("}\n");
			}

			System.out.println("EXPECTED:");
			for(int i = 0; i < b.length; i++){
				System.out.printf("{");
				for(int j = 0; j < b.length; j++){
						System.out.printf(""+b[i][j]+", ");	
				}
				System.out.printf("}\n");
			}
		}
		System.out.println();
}
}