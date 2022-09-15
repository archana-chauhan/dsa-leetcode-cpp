class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int n = arr.length;
        
        if (n <= 2) return 0;
        
        for (int i = 1; i < n-1; i++) {
            
            if (arr[i] > arr[i+1] && arr[i] > arr[i-1]) {
                return i;
            }
        }
        return -1;
        
    }
}