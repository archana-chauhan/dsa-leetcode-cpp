class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        
        // Remove all whitespaces
        String removeSpaces[] = s.replaceAll("\\s+", " ").split(" ");
        for (int i = removeSpaces.length - 1; i >= 0; i--) {
            result.append(removeSpaces[i].trim());
            if (i > 0) {
                result.append(" ");
            }
        }        
        String res = result.toString();
        return res.trim();
    }
}