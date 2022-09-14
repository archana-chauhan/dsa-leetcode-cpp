class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> bannedSet = new HashSet<>();
        for (String ban: banned) {
            bannedSet.add(ban);
        }
        
        int max = 0;
        String result = "";
        Map<String, Integer> map = new HashMap<>();
        
        
        String updatedWords = paragraph.replaceAll("[!?',;.]", " ");
        String words[] = updatedWords.split("\\s+");
        for (String word: words) {
            String key = word.toLowerCase();

            if (bannedSet.contains(key)) {
                continue;
            }
            map.put(key, map.getOrDefault(key, 0) + 1);

            
            if (map.get(key) >= max) {
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }
}