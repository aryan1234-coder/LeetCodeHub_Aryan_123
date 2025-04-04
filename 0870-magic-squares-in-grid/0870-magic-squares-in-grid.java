// class Solution {
//     public int numMagicSquaresInside(int[][] grid) {
//      int ans=0;
//      for(int i=0;i<grid.length-3;i++){
//         for(int j=0;j<grid[0].length-3;j++){
//               if(isMagicSquare(grid,i,j)) {
//                 ans++;
//               }
//         }
//      }
//      return ans;
     
        
//     }
//     public boolean isMagicSquare(int[][] grid,int r,int c){
//         boolean[] seen=new boolean[10];
//         for(int i=r;i<=r+3;r++){
//             for(int j=c;j<=c+3;j++){
//                 int num=grid[i][j];
//                 if(num<1 || num>9 || seen[num]){
//                     return false;
//                 }
//                 seen[num]=true;
//             }
//         }
//         int sum = grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
//         for (int i = r; i < r + 3; i++) {
//             if (grid[i][c] + grid[i][c + 1] + grid[i][c + 2] != sum) {
//                 return false;
//             }
//         }
//         for (int j = c; j < c + 3; j++) {
//             if (grid[r][j] + grid[r+1][j] + grid[r+2][j] != sum) {
//                 return false;
//             }
//         }
//         if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != sum) {
//             return false;
//         }
//         if (grid[r][c + 2] + grid[r + 1][c + 1] + grid[r+ 2][c] != sum) {
//             return false;
//         }
//         return true;
 
//     }
// }
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Iterate through each possible 3x3 subgrid
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagicSquare(int[][] grid, int rowStart, int colStart) {
        // Check if the 3x3 grid contains all numbers from 1 to 9
        boolean[] seen = new boolean[10];
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }

        // Calculate the sum of the first row
        int sum = grid[rowStart][colStart] + grid[rowStart][colStart + 1] + grid[rowStart][colStart + 2];

        // Check rows
        for (int i = rowStart; i < rowStart + 3; i++) {
            if (grid[i][colStart] + grid[i][colStart + 1] + grid[i][colStart + 2] != sum) {
                return false;
            }
        }

        // Check columns
        for (int j = colStart; j < colStart + 3; j++) {
            if (grid[rowStart][j] + grid[rowStart + 1][j] + grid[rowStart + 2][j] != sum) {
                return false;
            }
        }

        // Check diagonals
        if (grid[rowStart][colStart] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart + 2] != sum) {
            return false;
        }
        if (grid[rowStart][colStart + 2] + grid[rowStart + 1][colStart + 1] + grid[rowStart + 2][colStart] != sum) {
            return false;
        }

        return true;
    }
}