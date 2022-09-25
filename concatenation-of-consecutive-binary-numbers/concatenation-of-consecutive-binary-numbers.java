class Solution {
    public int concatenatedBinary(int n) {
        int left = 0;
        long answer = 0;
        int mod = (int)(1e9+7);
        
        for (int i = 1; i<=n; i++) {
            //check
            if ((i & (i-1)) == 0) left++;
            answer = ((answer << left) | i) % mod;
        }
        return (int) answer;
    }
}