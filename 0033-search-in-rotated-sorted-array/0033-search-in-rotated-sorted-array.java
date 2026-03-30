class Solution {
    static int rot_sort(int arr[], int low, int high, int target) {
        if (arr.length == 1) {
            if (arr[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid]<=arr[high]) {
                if (arr[mid] <= target && target <= arr[high]) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            } 
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        return rot_sort(nums, 0, nums.length - 1, target);
    }
}

