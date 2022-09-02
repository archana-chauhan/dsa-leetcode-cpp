class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        int max_water_level = 0;
        vector<int> left(n), right(n), minWaterLevel(n);
        left[0] = height[0];
        right[n-1] = height[n-1];
        
        for (int i = 1; i < n; i++) {
            left[i] = max(height[i], left[i-1]);
            right[n-i-1] = max(height[n-i-1], right[n-i]);   
        }
        
        for (int i = 1; i < n; i++) {
            minWaterLevel[i] = min(left[i], right[i]) - height[i];
        }
        
        for (int i = 0; i < n; i++) {
            max_water_level += minWaterLevel[i];
        }
        return max_water_level;
    }
};