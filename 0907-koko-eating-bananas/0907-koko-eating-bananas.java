class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int minSpeed=1;
        int maxSpeed=0;

        for(int i=0;i<piles.length;i++){
            maxSpeed=Math.max(piles[i],maxSpeed);
        }

        while(minSpeed<maxSpeed){

            int mid=minSpeed+(maxSpeed-minSpeed)/2;

            if(checkSpeed(piles,h,mid)){

                maxSpeed=mid;
              
            }
            else{

                minSpeed=mid+1;

            }


        }
        return minSpeed;
        
    }

    public boolean checkSpeed(int[] piles,int h,int speed){

        int hours=0;
        for(int pile:piles){
            hours += (int)Math.ceil((double) pile /speed);
        }
        return hours<=h;
    }
}