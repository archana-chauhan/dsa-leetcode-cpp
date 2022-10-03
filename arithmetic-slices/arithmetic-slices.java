class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        int combination = 0;
        if (nums.length <= 2) return 0;
        for (int i = 2; i < nums.length; i++) {
            if ((nums[i] - nums[i-1]) == (nums[i-1] - nums[i-2])) {
                combination++;
            }
            else {
                combination = 0;
            }
            result += combination;
        }
        return result;
        
    }
}