class Solution {

    class Cell {
        int x, y, sum;
        Cell(int x, int y, int sum) {
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
    }

    public int minPathSum(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;

        int[][] dist = new int[r][c];
        for (int i = 0; i < r; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Cell> pq = 
            new PriorityQueue<>((a, b) -> a.sum - b.sum);

        pq.offer(new Cell(0, 0, grid[0][0]));
        dist[0][0] = grid[0][0];

        int[][] directions = {{0,1},{1,0}};

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();

            if (curr.x == r - 1 && curr.y == c - 1) {
                return curr.sum;
            }

            for (int[] dir : directions) {
                int nx = curr.x + dir[0];
                int ny = curr.y + dir[1];

                if (nx < r && ny < c) {
                    int newSum = curr.sum + grid[nx][ny];

                    if (newSum < dist[nx][ny]) {
                        dist[nx][ny] = newSum;
                        pq.offer(new Cell(nx, ny, newSum));
                    }
                }
            }
        }

        return -1;
    }
}
