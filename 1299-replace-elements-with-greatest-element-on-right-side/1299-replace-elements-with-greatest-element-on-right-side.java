class Solution {
    public int[] replaceElements(int[] arr) {

        int maxValue=-1;

        for(int i=arr.length-1;i>=0;i--){

            int a=arr[i];
            arr[i]=maxValue;
            maxValue=Math.max(maxValue,a);
        }

        return arr;
        
    }
}