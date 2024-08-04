class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr=new int[n*(n+1)/2];
        int temp=0;

        for(int i=0;i<n;i++){
            int sum=0;
        for(int j=i;j<n;j++){
              sum=sum+nums[j];
              arr[temp++]=sum;
        }
        }
        Arrays.sort(arr);
        final int mod = (int) 1e9 + 7;
        int ans=0;
        for(int i=left-1;i<right;i++){
            ans=(ans+arr[i])%mod;
        }
        return ans;


    }
}