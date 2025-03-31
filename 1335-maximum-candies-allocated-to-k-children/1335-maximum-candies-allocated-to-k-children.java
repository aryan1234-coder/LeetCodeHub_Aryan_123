class Solution {
    public int maximumCandies(int[] candies, long k) {

        int minSpeed=1;
        int maxSpeed=Integer.MIN_VALUE;
        int ans=0;


        // this is like similar problem to Ko Ko monkey problem but the difference is we have to find exact distribution and in ko we ued to find the ceiling value 

        for(int i=0;i<candies.length;i++){
            maxSpeed=Math.max(candies[i],maxSpeed);
        }

        while(minSpeed<=maxSpeed){

            int mid=minSpeed+(maxSpeed-minSpeed)/2;

            if(checkSpeed(candies,k,mid)){

                ans=mid;
                minSpeed=mid+1;
              
            }
            else{

                maxSpeed=mid-1;

            }


        }
        return ans;
        
    }
     public boolean checkSpeed(int[] candies,long k,int mid){

        long ans=0;
        for(int candy:candies){
            if(candy>=mid){
            ans += (candy /mid);
            }
        }
        return ans>=k;
    }
}