class Solution {
    public int findLucky(int[] arr) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> mapp: map.entrySet()) {
            System.out.println("Keys: " + mapp.getKey() + " value: " + mapp.getValue());
            if (mapp.getKey().equals(mapp.getValue())) {
                result = mapp.getKey();
            }
        }
        if (result > 0) {
            return result;
        }
        return -1;
    }
}