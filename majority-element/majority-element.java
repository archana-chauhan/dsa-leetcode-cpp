class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            System.out.println("Key: " + m.getKey() + " : Value: " + m.getValue());
            if (m.getValue() > nums.length/2) {
                return m.getKey();
            }
        }
        return result;
    }
}