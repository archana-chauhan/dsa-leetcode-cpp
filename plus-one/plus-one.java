class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;  
        int newArray[] = new int[n+1];
        for (int i = n-1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            else if (digits[i] >= 9) {
                digits[i] = 0;
            }
        }
        // in case digits[] = [9]
        newArray[0] = 1;
        return newArray;
    }
}