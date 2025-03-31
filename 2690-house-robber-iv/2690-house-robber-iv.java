// class Solution {
//     public int minCapability(int[] nums, int k) {

//         List<List<Integer>> ans=new ArrayList<>();

//         findNonAdjacent(nums,k,0,new ArrayList<>(),ans);

//         List<Integer> min=new ArrayList<>();
       
//         int minAns=Integer.MAX_VALUE;

        
//         for (List<Integer> subseq : ans) {
//              int maxAns=Integer.MIN_VALUE;

//             for(int i=0;i<subseq.size();i++){

//                 maxAns=Math.max(subseq.get(i),maxAns);

//             }

//             min.add(maxAns);
           
             
//         }
//           for(int i=0;i<min.size();i++){
//             System.out.print(min.get(i));
//             minAns=Math.min(min.get(i),minAns);
//           }

//           return minAns;

       
        
//     }

//     public void findNonAdjacent(int[] nums,int k,int start,List<Integer> current,List<List<Integer>> result){

//         if(current.size()==k){
//             result.add(new ArrayList<>(current));
//             return;
//         }

//         for(int i=start;i<nums.length;i++){
//             current.add(nums[i]);
//             findNonAdjacent(nums,k,i+2,current,result);
//             current.remove(current.size()-1);

//         }
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     private int minAns = Integer.MAX_VALUE;

//     public int minCapability(int[] nums, int k) {
//         findNonAdjacent(nums, k, 0, new ArrayList<>(), Integer.MIN_VALUE);
//         return minAns;
//     }

//     private void findNonAdjacent(int[] nums, int k, int start, List<Integer> current, int maxInSubseq) {
//         // Base case: If we have selected k elements
//         if (current.size() == k) {
//             minAns = Math.min(minAns, maxInSubseq);
//             return;
//         }

//         // Iterate through the array and select elements with a gap of at least one index
//         for (int i = start; i < nums.length; i++) {
//             int newMax = Math.max(maxInSubseq, nums[i]); // Update max in subsequence
//             current.add(nums[i]);  
            
//             findNonAdjacent(nums, k, i + 2, current, newMax); // Move at least 2 indices forward
            
//             current.remove(current.size() - 1); // Backtrack
//         }
//     }

  
// }

class Solution {
    public int minCapability(int[] nums, int k) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;

        // Find the range for binary search
        for (int num : nums) {
            left = Math.min(left, num);
            right = Math.max(right, num);
        }

        //  binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canFormSubsequence(nums, k, mid)) {
                right = mid; // Try to minimize the max value
            } else {
                left = mid + 1; // Increase the max value constraint
            }
        }
        return left; // The smallest max capability that allows k selections
    }

    private boolean canFormSubsequence(int[] nums, int k, int maxAllowed) {
        int count = 0, i = 0;

        while (i < nums.length) {
            if (nums[i] <= maxAllowed) {
                count++;
                if (count == k) return true;
                i++; // Skip next index to ensure non-adjacency
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 3, 5, 9};
        int k = 2;
        System.out.println("Minimum Capability: " + sol.minCapability(nums, k));
    }
}

