class Solution {
    public boolean checkPossibility(int[] nums) {
        
        int n = nums.length;
        int counter = 0;
        
        for (int i = 0; i < n-1; i++) {
            if (nums[i] > nums[i+1]) {
                counter++;
                if (counter > 1) return false;
                
                if (i > 0 && nums[i-1] > nums[i+1]) {
                    nums[i+1] = nums[i];
                }
            }
        }
        return true;
    }
}