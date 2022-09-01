class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int count = 0;
        int n = nums.size();
        if(n == 1) return 1;
        int j = 0;
        int i = 0;
        for (; i < n-1; i++) {
            if (nums[i] == nums[i+1]) {
                count++;
            }
            else {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[i];
        return j;
    }
};