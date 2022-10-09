class Solution {
    public int countWords(String[] words1, String[] word2) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        int counter = 0;
        for (String s : words1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : word2) {
            map2.put(s, map2.getOrDefault(s, 0) + 1);
        }
        System.out.println("map: " + map + " :map2 : " + map2);
        for (String s : words1) {
            System.out.println("IF: " + map.getOrDefault(s, 0) + " :: map2: " + map2.getOrDefault(s, 0));
            if (map.getOrDefault(s, 0) == 1 && map2.getOrDefault(s, 0) == 1) {
                counter++;
            }
        }
        return counter;
    }
}