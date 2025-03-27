class Solution {
    public int minOperations(int[][] grid, int x) {

        int m=grid.length;
        int n=grid[0].length;



        int [] singleArray=new int[m*n];
        int temp=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                singleArray[temp++]=grid[i][j];
            }
        }

       int answer=0;
        Arrays.sort(singleArray);

        int mid=(m*n)/2;

        int middle=singleArray[mid];

        for(int i=0;i<singleArray.length;i++){

            if(Math.abs(singleArray[i]-middle) % x !=0){
                return -1;
            }
            answer=answer+Math.abs(singleArray[i]-middle)/x ;

        }
         return answer;





        
    }
}