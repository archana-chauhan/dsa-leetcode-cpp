class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left)/2;
        while (left < right) {
            if (arr[mid] < arr[mid+1]) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
            mid = left + (right - left)/2;
        }
        return left;
    }
}