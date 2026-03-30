class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {

        int column=y;
        int row=x;


        for(int j=column;j<column+k;j++){

            for(int i=0;i<k/2;i++){


                int temp= grid[row+i][j];
                grid[row+i][j]=grid[row+k-1-i][j];
                grid[row+k-1-i][j]=temp;
            }


        }
        return grid;
        
    }
}