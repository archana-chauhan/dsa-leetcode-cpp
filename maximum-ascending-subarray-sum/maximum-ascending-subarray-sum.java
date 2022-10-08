class Solution {
    public int maxAscendingSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length;) {
            int sum = nums[i];
            int j = i + 1;
            while (j < nums.length && nums[j-1] < nums[j]) {
                sum += nums[j];
                j++;
            }
            i = j;
            result = Math.max(result, sum);
        }
        return result;
    }
}