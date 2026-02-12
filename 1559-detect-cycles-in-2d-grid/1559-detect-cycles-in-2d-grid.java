public class Pair{

    int i1;
    int j2;
    int pi;
    int pj;

    Pair(int i1,int j2,int pi,int pj){
        this.i1=i1;
        this.j2=j2;
        this.pi=pi;
        this.pj=pj;
    }

}
class Solution {


    public boolean bfs(int i, int j, int pi, int pj, char[][] grid, boolean[][] visited){
        
         int m=grid.length;
         int n=grid[0].length;
        visited[i][j]=true;

        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(i,j,pi,pj));

        int[][] directions= { {0,1},{0,-1},{1,0},{-1,0} };

        while(!queue.isEmpty()){

            Pair p=queue.remove();

            for(int[] dir: directions){
                  int x1=dir[0]+p.i1;
                  int y1=dir[1]+p.j2;
                  int parentRow= p.pi;
                  int parentColumn=p.pj;

                  if(x1>=0 && y1>=0 && x1<m && y1<n && grid[x1][y1]==grid[i][j] && (parentRow!=x1 || parentColumn!=y1) ){
                    if(visited[x1][y1]==true){
                        return true;
                    }
                    else{
                         queue.add(new Pair(x1,y1,p.i1,p.j2));
                         visited[x1][y1]=true;
                    }
                  }

            }

        }
           return false;

    }
   
    public boolean containsCycle(char[][] grid) {

        int r=grid.length;
        int c=grid[0].length;

        boolean[][] visited=new boolean[r][c];
        if(r<=1 && c<=1){
            return false;
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              

                if(visited[i][j]==false){
               if( bfs(i,j,-1,-1,grid,visited)){
                return true;
               }
                }
 

            }
        }

       return false;
        
    }
}