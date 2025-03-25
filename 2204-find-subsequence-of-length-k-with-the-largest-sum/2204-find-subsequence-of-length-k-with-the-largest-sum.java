class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1]; // If values are equal, sort by index
            return b[0] - a[0]; // Otherwise, sort by value (descending order)
        });

        // Add elements with their indices into the PriorityQueue
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }

        // Extract the top k largest elements
        List<int[]> selected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            selected.add(pq.poll());
        }

        selected.sort(Comparator.comparingInt(a -> a[1]));

        // Extract the values while maintaining original order
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = selected.get(i)[0];
        }

        return ans;

        
    }
}