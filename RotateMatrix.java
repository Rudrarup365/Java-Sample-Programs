package testing;

public class RotateMatrix {

	static void rotate90(int[][] mat) {
		int n = mat.length;

		// Initialize the result matrix with zeros
		int[][] res = new int[n][n];

		// Flip the matrix clockwise using nested loops
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[j][n - i - 1] = mat[i][j]; //clockwise
				//res[i][j] = mat[j][n - i - 1]; //anti clockwise
			}
		}

		// Copy result back to mat
		for (int i = 0; i < n; i++) {
			System.arraycopy(res[i], 0, mat[i], 0, n);
		}
	}

	// Driver code
	public static void main(String[] args) {
		int[][] mat = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 1, 2, 3},
				{4, 5, 6, 7}
		};

		for (int[] row : mat) {
			for (int x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println();
		rotate90(mat);

		// Print the rotated matrix
		for (int[] row : mat) {
			for (int x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
