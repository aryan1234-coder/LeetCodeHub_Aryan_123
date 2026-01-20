class Solution {
    public int candy(int[] ratings) {

    // firstly give ecah student have atleast 1 candy
    int n=ratings.length;
    int[] candy=new int[n];
        for(int i=0;i<ratings.length;i++){
          candy[i]=1;
        }
        // from left to right
        for(int j=1;j<ratings.length;j++){
            if(ratings[j]>ratings[j-1]){
                candy[j]=candy[j-1]+1;
            }
        }
        // from right to left
        for(int k=ratings.length-2;k>=0;k--){
            if(ratings[k]>ratings[k+1]){
             
                candy[k]=Math.max(candy[k],candy[k+1]+1);
            }
        }
        int totalcandy=0;
        for(int l=0;l<candy.length;l++){
            totalcandy=totalcandy+candy[l];
        }
          return totalcandy;
    }
}