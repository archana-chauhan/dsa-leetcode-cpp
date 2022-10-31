class Solution {
    public String truncateSentence(String s, int k) {
        String[] res = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i == k-1) {
                result.append(res[i]);
            }
            else {
                result.append(res[i]).append(" ");
            }
        }
        return result.toString();
    }
}