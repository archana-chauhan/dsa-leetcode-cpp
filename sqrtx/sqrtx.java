class Solution {
    public int mySqrt(int x) {
        
        int start = 0;
        int end = x;
        long answer = -1;
        long mid = start + (end - start)/2;
        
        while (start <= end) {
            
            long square = mid * mid;
            if (mid * mid > x) {
                end = (int) mid - 1;
            }
            else if (mid * mid < x) {
                answer = mid;
                start = (int) mid + 1;
            }
            else if (mid * mid == x) {
                return (int) mid;
            }
            mid = start + (end - start)/2;
        }
        return (int) answer;
    }
}