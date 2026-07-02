class Solution {
    public int majorityElement(int[] nums) {
       int prevCount = 0;
    int maxIndex = -1;

    for (int i = 0; i <  nums.length; i++) {
        int count = 1;  

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }

        if (count > prevCount) {
            prevCount = count;
            maxIndex = nums[i];
        }
    }

    return maxIndex;
}}

