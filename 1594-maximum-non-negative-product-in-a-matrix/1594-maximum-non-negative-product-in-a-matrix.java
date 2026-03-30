// class Solution {
//     public int maxProductPath(int[][] grid) {

//         int r = grid.length;
//         int c = grid[0].length;
//         int mod = 1_000_000_007;

//         // Store {row, col, maxProduct, minProduct}
//         // Track both min and max even in BFS
//         // because negative × negative = positive
//         Queue<long[]> queue = new LinkedList<>();

//         // {row, col, currentMax, currentMin}
//         queue.offer(new long[]{0, 0, grid[0][0], grid[0][0]});

//         int[][] directions = {{0, 1}, {1, 0}};  // right and down only

//         long globalMax = Long.MIN_VALUE;

//         while (!queue.isEmpty()) {

//             long[] cell = queue.poll();

//             int row      = (int) cell[0];
//             int col      = (int) cell[1];
//             long curMax  = cell[2];
//             long curMin  = cell[3];

//             // Reached bottom-right — record answer
//             if (row == r - 1 && col == c - 1) {
//                 globalMax = Math.max(globalMax, curMax);
//                 continue;
//             }

//             for (int[] dir : directions) {

//                 int newRow = row + dir[0];
//                 int newCol = col + dir[1];

//                 if (newRow >= r || newCol >= c) continue;

//                 long val = grid[newRow][newCol];

//                 // Multiply both max and min by next cell value
//                 long prod1 = curMax * val;
//                 long prod2 = curMin * val;

//                 long newMax = Math.max(prod1, prod2);
//                 long newMin = Math.min(prod1, prod2);

//                 queue.offer(new long[]{newRow, newCol, newMax, newMin});
//             }
//         }

//         if (globalMax < 0) return -1;
//         return (int)(globalMax % mod);
//     }
// }
class Solution {
    public int maxProductPath(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int mod = 1_000_000_007;

        // dp[i][j][0] = max product reaching (i,j)
        // dp[i][j][1] = min product reaching (i,j)
        // track BOTH because negative × negative = positive
        long[][][] dp = new long[r][c][2];

        // Base case
        dp[0][0][0] = grid[0][0];
        dp[0][0][1] = grid[0][0];

        // Fill first row — only one way (←→)
        for (int j = 1; j < c; j++) {
            dp[0][j][0] = dp[0][j-1][0] * grid[0][j];
            dp[0][j][1] = dp[0][j-1][1] * grid[0][j];
        }

        // Fill first column — only one way (↑↓)
        for (int i = 1; i < r; i++) {
            dp[i][0][0] = dp[i-1][0][0] * grid[i][0];
            dp[i][0][1] = dp[i-1][0][1] * grid[i][0];
        }

        // Fill remaining cells
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {

                long val = grid[i][j];

                long fromTopMax  = dp[i-1][j][0] * val;
                long fromTopMin  = dp[i-1][j][1] * val;
                long fromLeftMax = dp[i][j-1][0] * val;
                long fromLeftMin = dp[i][j-1][1] * val;

                dp[i][j][0] = Math.max(
                    Math.max(fromTopMax, fromTopMin),
                    Math.max(fromLeftMax, fromLeftMin)
                );

                dp[i][j][1] = Math.min(
                    Math.min(fromTopMax, fromTopMin),
                    Math.min(fromLeftMax, fromLeftMin)
                );
            }
        }

        long result = dp[r-1][c-1][0];

        if (result < 0) return -1;
        return (int)(result % mod);
    }
}
