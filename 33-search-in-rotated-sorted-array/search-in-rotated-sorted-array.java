class Solution {

    public int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        // Array is not rotated
        if (pivot == -1) {
            return binary(nums, 0, nums.length - 1, target);
        }

        // Pivot itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Decide which half to search
        if (target >= nums[0]) {
            return binary(nums, 0, pivot - 1, target);
        }

        return binary(nums, pivot + 1, nums.length - 1, target);
    }

    public int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int binary(int[] nums, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}