class Solution {
    public int[] findRightInterval(int[][] intervals) {

         int n=intervals.length;
        int[] arr=new int[n];
        int[] ans=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=intervals[i][0];
        }
        for(int j=0;j<n;j++){
           map.put(arr[j],j);
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            int val=binarySearch(arr,intervals[i][1]);
            if(val==-1){
                ans[i]=-1;
            }
            else{
                ans[i]=map.get(arr[val]);
            }
        }
        return ans;
        
    }
    public int binarySearch(int[] arr1,int target){
        int s=0;
        int e=arr1.length-1;
         int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr1[mid]==target){
                return mid;
            }
            else if(arr1[mid]>target){
                 ans=mid;
                e=mid-1;
            }
            else{
               s=mid+1;
            }
        }
        return ans;
    }
}