class Solution {
public:
    bool isPalindrome(int x) {
        
        long result=0;
        int remainder = 0, number = x;
    
        // find reverse number
        while(x > 0) {
            remainder = x %10;
            x = x/10;
            result = result * 10 + remainder;
        }
        
        if (result == number) return true;
        return false; 
    }
};