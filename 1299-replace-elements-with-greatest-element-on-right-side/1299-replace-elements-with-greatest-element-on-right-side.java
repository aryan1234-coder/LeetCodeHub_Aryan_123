class Solution {
    public int[] replaceElements(int[] arr) {

        // int maxValue=-1;

        // for(int i=arr.length-1;i>=0;i--){

        //     int a=arr[i];
        //     arr[i]=maxValue;
        //     maxValue=Math.max(maxValue,a);
        // }

        // return arr;

       

        for(int i=0;i<arr.length;i++){

             int max=-1;

            for(int j=i+1;j<arr.length;j++){

                 max=Math.max(max,arr[j]);

            }
            arr[i]=max;
        }
        return arr;
        
    }
}