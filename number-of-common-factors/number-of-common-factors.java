class Solution {
    public int commonFactors(int a, int b) {
        
        int min = Math.min(a,b);
        int count = 0;
        System.out.println("Min: " + min);
        
        for (int i = 1; i <= min; i++) {
            
            if (a % i == 0 && b % i == 0) {
                count++;
                System.out.println("i : " + i + " : min: " + min + " count: " + count);
            }
        }
        return count;
    }
}