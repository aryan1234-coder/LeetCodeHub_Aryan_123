class Solution {
    public class Pair{
        int i;
        int j;
        int step;
    
    Pair(int i, int j, int step){

        this.i=i;
        this.j=j;
        this.step=step;
    }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {

        int m=grid.length;
        int n=grid[0].length;

        if(grid[0][0]==1 || grid[m-1][n-1]==1){
            return -1;
        }

        boolean[][] visited=new boolean[m][n];

        int[][] directions={ {1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};

        visited[0][0]=true;

        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,0,1));

        while(!queue.isEmpty()){

            Pair pair= queue.remove();

            if(pair.i== m-1 && pair.j==n-1){
                return pair.step;
            }

            for(int[] dir: directions){
                int x1= pair.i + dir[0];
                int y1= pair.j + dir[1];

                if(x1>=0 && y1>=0 && x1<m && y1<n && grid[x1][y1]==0 && !visited[x1][y1]){
                    visited[x1][y1]=true;
                    queue.add(new Pair(x1,y1,pair.step+1));

                }
            }
        }
        return -1;

    }
}