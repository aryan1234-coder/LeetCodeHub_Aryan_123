class Solution {
    public int[][] constructProductMatrix(int[][] grid) {

        int r=grid.length;
        int c=grid[0].length;
        int[] arr=new int[r*c];

        int temp=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[temp++]=grid[i][j];
            }
        }
        int mod=12345;
       
       int[] ans=new int[arr.length];
       long leftProduct=1;
       long rightProduct=1;

       for(int i=0;i<arr.length;i++){

              ans[i]=(int)leftProduct;
              leftProduct=(leftProduct*arr[i]) %mod;

       }
       for(int j=arr.length-1;j>=0;j--){

            ans[j]=(int)((ans[j]*rightProduct)%mod);
            rightProduct=((rightProduct*arr[j])%mod);

       }

        int[][] newans=new int[r][c];
        int temp1=0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                newans[i][j]=(int)(ans[temp1++]%mod);
            }
        }
        return newans;
        
    }
}