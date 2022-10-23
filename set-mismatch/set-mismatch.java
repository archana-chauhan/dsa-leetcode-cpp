class Solution {
    public int[] findErrorNums(int[] arr) {
        int duplicate = 0, missingNumber = 0;
        Set<Integer> res = new HashSet<>();

        // find duplicate
        for (int element : arr) {
            if (res.contains(element)) {
                duplicate = element;
            }
            res.add(element);
        }

        // find missing number
        for (int i = 1; i <= arr.length; i++) {
            if (!res.contains(i)) {
                missingNumber = i;
                break;
            }
        }
        return new int[]{duplicate, missingNumber};
    }
}