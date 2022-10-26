class Solution {
    public String makeFancyString(String s) {
        int counter = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i-1)) {
                counter++;
            }
            else {
                counter = 1;
            }

            if (counter < 3) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}