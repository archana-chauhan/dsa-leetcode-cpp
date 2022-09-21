class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};
        int n = nums.length;
        boolean first = false, second = false;
        
        for (int i = 0; i < n; i++) {
            if (target == nums[i] && !first) {
                result[0] = i;
                first = true;
            }
            else if (target == nums[i] && first) {
                result[1] = i;
                second = true;
            }
        }
        
        if (!second) {
            result[1] = result[0];
        }
        
        return result;
    }
}