class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        Queue<Pair> queue = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        // Step 1: Add all 0s to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.add(new Pair(i, j));
                    visited[i][j] = true;
                }
            }
        }

        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

      
        while (!queue.isEmpty()) {

            Pair p = queue.remove();

            for (int[] dir : directions) {

                int x = p.i + dir[0];
                int y = p.j + dir[1];

                if (x >= 0 && y >= 0 && x < m && y < n && !visited[x][y]) {

                    mat[x][y] = mat[p.i][p.j] + 1;  // distance logic
                    visited[x][y] = true;
                    queue.add(new Pair(x, y));
                }
            }
        }

        return mat;
    }
}
