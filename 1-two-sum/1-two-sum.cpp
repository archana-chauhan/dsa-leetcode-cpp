class Solution {
public:
    vector<int> twoSum(vector<int> nums, int target) {
        int n = nums.size();
        unordered_set<int> s;
        vector<int> result;
        
        for (int i = 0; i < n; i++) {
            int x = target - nums[i];
            int index;
            //find index
            if (find(nums.begin(), nums.end(), x) != nums.end()) {
                index = find(nums.begin(), nums.end(), x) - nums.begin();
            }
            
            if (s.find(x) != s.end()) {
                result.push_back(index);
                result.push_back(i);
            }
            s.insert(nums[i]);
        }
        return result;
        
    }
};