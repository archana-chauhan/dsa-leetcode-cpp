class Solution {
    
    int reverseNum(int number) {
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result = result * 10 + digit;
            number /= 10;
        }
        return result;
    }
    
    
    public boolean isPalindrome(int x) {
        int number = x;
        
        if (number < 0) return false;
        
        if (reverseNum(x) == number) return true;
        return false;
    }
}