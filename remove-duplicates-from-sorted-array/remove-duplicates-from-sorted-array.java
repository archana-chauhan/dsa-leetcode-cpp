class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        if (nums.length == 0) return 0;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[index]) {
                index++;
                nums[index] = nums[j];
            }
        }
        return index+1;
    }
}