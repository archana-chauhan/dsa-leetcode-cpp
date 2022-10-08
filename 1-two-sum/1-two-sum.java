class Solution {
    public int[] twoSum(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println("List: " + list);
        int[] result = new int[list.size()];
        int i = 0;
        for (int index : list) {
            result[i++] = index;
        }
        return result;
        
    }
}