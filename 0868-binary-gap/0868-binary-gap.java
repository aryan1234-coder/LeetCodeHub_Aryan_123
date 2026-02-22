class Solution {
    public int binaryGap(int n) {

        int currDistance=0;
        int maxDistance=0;

        boolean found=false;


        while(n>0){

            int bit=n%2;

            if(bit==1){

                if(found){
                     maxDistance=Math.max(maxDistance,currDistance);
                }
                found=true;
                currDistance=1;

            }
            else{

                if(found){
                  currDistance++;
                }

            }
              n=n/2;

        }

        return maxDistance;
        
    }
}