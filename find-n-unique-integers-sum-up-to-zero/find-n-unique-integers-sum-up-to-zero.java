class Solution {
    public int[] sumZero(int n) {
        
        int result[] = new int[n];
        int left = 0;
        int right = n - 1;
        int count = 1;
        
        while(left < right) {
            result[left] = count;
            left++;
            result[right] = -count;
            right--;
            count++;
        }
        return result;
    }
}