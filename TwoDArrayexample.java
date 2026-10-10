public class TwoDArrayexample {
    public static void main(String[] args) {
        // Example 1: Declaring and Initializing a 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Example 2: Accessing Elements in a 2D Array
        System.out.println("Element at (0,0): " + matrix[0][0]); // Output: 1
        System.out.println("Element at (1,2): " + matrix[1][2]); // Output: 6

        // Example 3: Iterating through a 2D Array using Nested For Loops
        System.out.println("Iterating through the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Example 4: Calculating the Sum of All Elements in a 2D Array
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements in the 2D array: " + sum);
    }
}
