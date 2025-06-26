class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Create a new matrix to store the rotated values
        int[][] matrix2 = new int[n][n];

        // Step 2: Perform the rotation
        // For a 90-degree clockwise rotation,
        // The element at matrix[i][j] moves to matrix2[j][n - i - 1]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[j][n - i - 1] = matrix[i][j];
            }
        }

        // Step 3: Copy the rotated matrix back to the original matrix
        // This modifies the input matrix in-place
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }

        // The original matrix is now rotated 90 degrees clockwise
    }
}
