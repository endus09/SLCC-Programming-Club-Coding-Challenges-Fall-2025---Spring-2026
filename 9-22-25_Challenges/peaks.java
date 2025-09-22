/*
 * Peaks
 * by Markus Gulla
 * 
 * Welcome to the second programming challenge of the club!
 * In today's challenge, you will be creating a function that receives a 2D grid of integer elevations representing a terrain map.
 * A cell is called a peak if its value is greater than ALL of its adjacent neighbors (north, south, east, west, and the four diagonals).
 * 
 * Your job is to:
 *  - Count how many peaks there are.
 *  - List the coordinates (row, column) of each peak, sorted first by row then by column.
 * 
 * Here is an example:
 * 
 * Input:
 *  1 2 1 3 4
 *  5 1 1 1 1
 *  1 1 9 1 1
 *  2 1 1 1 2
 *  1 3 1 4 1
 * 
 * Output:
 * 5
 * 0 4
 * 1 0
 * 2 2
 * 4 1
 * 4 3
 */


public class peaks {

    public static void is_peak(int[][] x){
        // WRITE YOUR CODE HERE
    }

    public static void main(String[] args)
    {
        int[][] a = {
            {1,2,1},
            {2,9,2},
            {1,2,1}};
        String aExpected = "1\n1 1";

        int[][] b = {
            {1,2,1,3,4},
            {5,1,1,1,1},
            {1,1,9,1,1},
            {2,1,1,1,2},
            {1,3,1,4,1}};
        String bExpected = "5\n0 4\n1 0\n2 2\n4 1\n4 3";

        test(a,aExpected);
        test(b,bExpected);
    }

    public static void test(int[][] x, String t){
         System.out.println("Your Answer:");
         is_peak(x);
         System.out.println("\nExpected:\n" + t + "\n");
    }

}