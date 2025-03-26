class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){

            max=Math.max(weights[i],max);
            sum=sum+weights[i];
        }

        while(max<sum){

            int mid= max+(sum-max)/2;

            int D=1;
            int totalSum=0;

            for(int i=0;i<weights.length;i++){
                
                if((totalSum+weights[i])>mid){
                    D++;
                    totalSum=0;
                }
                totalSum=totalSum+weights[i];

            }

            if(D>days){
                max=mid+1;
            }
            else{
                sum=mid;
            }
        }

        return max;

        
        
    }
}