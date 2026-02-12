class Solution {
    public class Pair{

        int i;
        int j;
       Pair(int i, int j){
        this.i=i;
        this.j=j;
       }
    }

    public void dfs(int i, int j, int[][] visited,char[][] grid){

        visited[i][j]=1;
        int r=visited.length;
        int c=visited[0].length;

        int[][] directions= {{0,1},{0,-1},{1,0},{-1,0}};

        Queue<Pair> queue=new LinkedList<>();

        queue.add(new Pair(i,j));

        while(!queue.isEmpty()){

            Pair p= queue.remove();

            for(int[] dir: directions){
                int d1=dir[0]+p.i;
                int d2=dir[1]+p.j;

                if(d1>=0 && d1<r && d2>=0 && d2<c && visited[d1][d2]==0 && grid[d1][d2]=='1' ){
                    visited[d1][d2]=1;
                    queue.add(new Pair(d1,d2));
                }
            }


        }

    }
    public int numIslands(char[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int[][] visited=new int[r][c];
        int ans=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){

                if(grid[i][j]=='1' && visited[i][j]==0){
                     ans++;
                    dfs(i,j,visited,grid);
                }
            }
        }
        return ans;
    }
}