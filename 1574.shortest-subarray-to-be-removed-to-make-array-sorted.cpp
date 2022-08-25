/*
 * @lc app=leetcode id=1574 lang=cpp
 *
 * [1574] Shortest Subarray to be Removed to Make Array Sorted
 */

// @lc code=start
class Solution {
public:
    int findLengthOfShortestSubarray(vector<int>& arr) {
        int smallest = INT_MAX;
        int largest = INT_MIN;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            if (isOutOfOrder(arr, i)) {
                smallest = min (smallest, x);
                largest = max (largest, x);
            }
        }
        int left = 0;
        int right = arr.size() - 1;
        while (arr[left] <= smallest) {
            left++;
        }
        while (arr[right] >= largest) {
            right--;
        }
        int count = 0;
        for (int i = left; i <= right; i++) {
            count++;
        }
        return count;
    }

    bool isOutOfOrder(vector<int> arr, int i) {
        int x = arr[i];
        int n = arr.size();
        if (i == 0) {
            return x > arr[1];
        }
        if (i == n-1) {
            return x < arr[i-1];
        }
        else return x > arr[i+1] or x < arr[i-1];
    }
};
// @lc code=end

