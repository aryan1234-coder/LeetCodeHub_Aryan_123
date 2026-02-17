class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<int[]> stk1=new Stack<>();
        Stack<int[]> stk2=new Stack<>();

        int[] left=new int[arr.length];
        int[] right=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            left[i]=i+1;
            right[i]= arr.length-i;
        }

        for(int i=0;i<arr.length;i++){

            while(!stk1.isEmpty()  && stk1.peek()[0]>arr[i]){
                stk1.pop();
            }

            left[i]=stk1.isEmpty()? i+1 : i-stk1.peek()[1];
            stk1.push(new int[]{arr[i],i});

        }

        for (int i = arr.length - 1; i >= 0; i--) {
    while (!stk2.isEmpty() && stk2.peek()[0] >= arr[i]) {
        stk2.pop();
    }

    right[i] = stk2.isEmpty() ? arr.length - i : stk2.peek()[1] - i;
    stk2.push(new int[]{arr[i], i});
      }

        long ans = 0;
        int mod = 1_000_000_007;
        
        for (int i = 0; i < arr.length; i++) {
            ans = (ans + (long) arr[i] * left[i] * right[i]) % mod;
        }
        
        return (int) ans;

        
    }
}