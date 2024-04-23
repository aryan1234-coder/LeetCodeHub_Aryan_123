class Solution {
    public int countNegatives(int[][] grid) {
        int r1=0;
        int r=grid.length;
        int count=0;
    
        int c1=grid[0].length-1;

        while(r1<r && c1>=0){
            if(grid[r1][c1]>=0){
                r1++;
            }
            else{
              count=count +r-r1;
              c1--;
            }
        }
        return count;


       
        
    }
}