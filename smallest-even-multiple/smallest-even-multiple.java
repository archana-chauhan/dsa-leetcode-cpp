class Solution {
    public int smallestEvenMultiple(int n) {
        int multiple = 0;
        if (n < 2) return 2*n;

        if (n == 2) return 2;
        for (int i = 1; i < n; i++) {
            multiple = n * i;
            if (multiple % 2 == 0) {
                return multiple;
            }
        }
        return 0;
    }
}