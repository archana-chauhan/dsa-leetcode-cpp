class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(s.charAt(i))) {
                map.put(c, map.get(c) + 1);
            }
            else { 
                map.put(c, 1);
            }
        }
        int value = map.get(s.charAt(0));
        for (int mapVal : map.values()) {
            if (mapVal != value) {
                return false;
            }
        }
        return true;
    }
}