class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int max = Integer.MIN_VALUE, sum = nums[0];
        int result = 0;
        
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] > nums[i-1]) {
                sum += nums[i];
            }
            else {
                if (result < sum) {
                    result = sum;
                }
                sum = nums[i];
            }
        }
        if (result < sum) {
            result = sum;
        }
        return result;
    }
}