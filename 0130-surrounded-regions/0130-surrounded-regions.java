class Solution {
    public void solve(char[][] board) {

        int r=board.length;
        int c=board[0].length;

        for(int i=0;i<r;i++){
            if(board[i][0]=='O'){

                dfs(i,0,board);

            }
            if(board[i][c-1]=='O'){
                dfs(i,c-1,board);
            }
        }
         for(int j=0;j<c;j++){
            if(board[0][j]=='O'){

                dfs(0,j,board);

            }
            if(board[r-1][j]=='O'){
                dfs(r-1,j,board);
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';

                }
                if(board[i][j]=='%'){
                    board[i][j]='O';
                }
            }

        }



        
    }

    public void dfs(int i1,int j1, char[][] board){

         int[][] directions= {{0,1},{0,-1},{1,0},{-1,0}};
         board[i1][j1]= '%';
         int lengthRow=board.length;
         int columnLength=board[0].length;


        for(int[] dir: directions){
              int x1= dir[0]+ i1;
              int x2=dir[1] + j1;

              if(x1<0 || x1>=lengthRow || x2<0 || x2>=columnLength || board[x1][x2] != 'O'){
                continue;
              }
              dfs(x1,x2,board);



        }
    }
}