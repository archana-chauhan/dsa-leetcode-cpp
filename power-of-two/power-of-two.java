class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int answer = 0;
        for (int i = 0; i <= 30; i++) {
            answer = (int) Math.pow(2,i);
            
            if (answer == n) return true;
        }
        
        return false;
    }
}