class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    
    Arrays.sort(arr);

    List<List<Integer>> ans=new ArrayList<>();

    int minDiff=Integer.MAX_VALUE;

     for (int i = 0; i < arr.length - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }

    for(int i=0;i<arr.length-1;i++){

         if (arr[i + 1] - arr[i] == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
    }
    return ans;
        
    }
}