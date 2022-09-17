class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int current_sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            current_sum += nums[i];
            if (current_sum > max) {
                max = current_sum;
            }
            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        return max;
    }
}