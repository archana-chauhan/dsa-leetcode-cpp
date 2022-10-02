class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        if (strs.length == 0)
            return "";
        
        int n = strs.length;
        Arrays.sort(strs);

        String firstElement = strs[0];
        String lastElement = strs[n-1];
        String result = "";
        int counter = 0;
        // Sorting
        for (int i = 0; (i < firstElement.length()) && (i < lastElement.length()); i++) {
            if (firstElement.charAt(i) == lastElement.charAt(i)) 
                counter++;
            else 
                break;
        }
        
        if (counter == 0)
            return "";
        
        return firstElement.substring(0, counter);
    }
}