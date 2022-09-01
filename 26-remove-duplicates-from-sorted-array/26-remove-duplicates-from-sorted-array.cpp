class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
    vector<int> removed;
    int temp;
    int jump = 0;

    for (int i = 0; i < nums.size();) {
        removed.push_back(nums[i]);
        for (int j = 0; j < nums.size(); j++) {
          if (nums[i] == nums[j]) {
            jump++;
          }
        }
        i = i + jump;
        jump = 0;
    }
  nums.erase(nums.begin(), nums.end());
  for (int i = 0; i < removed.size(); i++) {

    nums.push_back(removed[i]);
  }

  for (auto num : nums) {
    cout << "num:: " << num << endl;
  }

  for (auto remove : removed) {
    cout << "remove:: " << remove << endl;
  }

  return nums.size();
    }
};