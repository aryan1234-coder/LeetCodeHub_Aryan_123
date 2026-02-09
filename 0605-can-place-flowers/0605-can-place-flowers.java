class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i=0;i<flowerbed.length;i++){


            // find left and find right and check we can put there

           if(flowerbed[i]==0){

                int left= (i==0) ? 0 : flowerbed[i-1];
                int right= i==(flowerbed.length-1) ? 0: flowerbed[i+1];

                if(left==0 && right==0){

                       flowerbed[i]=1;
                       n--;

                       if(n==0){
                        return true;
                       }

                }

           }


        }

        return n<=0;

      
        
    }
}