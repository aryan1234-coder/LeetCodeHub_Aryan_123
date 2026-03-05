class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas=0;
        int totalCost=0;

        for(int i=0;i<gas.length;i++){

            totalGas=totalGas+gas[i];
            totalCost=totalCost+cost[i];
        
        
        }

         if(totalGas<totalCost){
              return -1;
         }
         int tankGasHas=0;
         int start=0;

         for(int i=0;i<gas.length;i++){

            tankGasHas += gas[i]-cost[i];

            if(tankGasHas<0){
                start=i+1;
                tankGasHas=0;
            }
         }
         return start;
        
    }
}