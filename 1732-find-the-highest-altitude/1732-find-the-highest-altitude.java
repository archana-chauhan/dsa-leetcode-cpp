class Solution {
    public int largestAltitude(int[] arr) {
        // New array will contain N+1 length
        int[] res = new int[arr.length + 1];
        int high = Integer.MIN_VALUE;   // Will return maximum altitude
        res[0] = 0;                     // Storing 0 at 0th index of new array
        
        // Iterating the loop from 1 to N+1
        for (int i = 1; i < arr.length+1; i++) {
            res[i] = arr[i-1] + res[i-1];
        }
        for (int element: res) {
            // comparing maximum element
            if (high < element) {
                high = element;
            }
        }
        return high; 
    }
}