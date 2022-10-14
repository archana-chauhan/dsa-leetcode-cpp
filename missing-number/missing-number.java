class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int result = 0;
        int expectedSum = n * (n + 1) / 2;
        for (int element : arr) {
            result += element;
        }
        return expectedSum - result;
    }
}