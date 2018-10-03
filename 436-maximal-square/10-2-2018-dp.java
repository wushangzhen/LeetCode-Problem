public class Solution {
    /**
     * @param matrix: a matrix of 0 and 1
     * @return: an integer
     */
    public int maxSquare(int[][] matrix) {
        // write your code here
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                if (i == 0 || j == 0) {
                    if (matrix[i][j] == 1) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                    max = Math.max(max, dp[i][j]);
                    continue;
                }
                dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;
    }
}
