class Solution {
    
    int calculateNextNum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit*digit;
            n /= 10;
        }
        System.out.println("Sum :" + sum);
        return sum;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> checkedSet = new HashSet<>();
        while (n != 1 && !checkedSet.contains(n)) {
            checkedSet.add(n);
            n = calculateNextNum(n);
        }
        for (int index: checkedSet) {
            System.out.println("index:: " + index);
        }
        return n==1;
    }
}