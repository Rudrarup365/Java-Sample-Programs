package testing;

public class testRotation {
	 public static void rotateMatrix(int[][] matrix) {
	        int n = matrix.length;
	        
	        // Transpose the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }
	        
	        // Reverse each row
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n / 2; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[i][n - j - 1];
	                matrix[i][n - j - 1] = temp;
	            }
	        }
	    }
	    
	    // Function to print the matrix
	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int val : row) {
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 1, 2, 3},
	            {4, 5, 6, 7}
	        };
	        
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);
	        
	        rotateMatrix(matrix);
	        
	        System.out.println("\nRotated Matrix:");
	        printMatrix(matrix);
	    }
}
