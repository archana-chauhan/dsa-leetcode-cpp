class Solution {
    public int largestPerimeter(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i-1] + nums[i-2] > nums[i]) {
                sum += nums[i-1] + nums[i-2] + nums[i];
                return sum;
            }
        }
        return sum;
    }
}