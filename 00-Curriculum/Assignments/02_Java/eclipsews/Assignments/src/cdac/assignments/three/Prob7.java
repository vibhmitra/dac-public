/* Problem 7. Write a Java Program to Add the corresponding elements of two
        matrices [2 X 3].
        A[ ][ ] = {{1, 2}, {3, 4}, {5,6}}
        B[ ][ ] = {{1, 2}, {2, 3}, {5,6}}
        Output: {{2, 4}, {5, 7}, {10, 12}}

 */

package cdac.assignments.three;

public class Prob7 {

    public static void main(String[] args) {
        int A[][] = {{1, 2}, {3, 4}, {5,6}};
        int B[][] = {{1, 2}, {2, 3}, {5,6}};
        int[][] sum = new int[3][2];

        System.out.print("{ ");
        for (int col = 0; col < 3; col++) {
            System.out.print("{ ");
            for (int row = 0; row < 2; row++) {
                sum[col][row] = A[col][row] + B[col][row];
                System.out.print(sum[col][row] + " ");
            }
            System.out.print("} ");
        }
        System.out.print("} ");

    }
}
