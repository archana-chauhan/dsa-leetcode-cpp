class Solution {
    public int maxPower(String s) {
        char[] ch = s.toCharArray();
        int answer = 1;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && ch[i] == ch[i + 1]) {
                answer++;
            } 
            else {
                if (answer > count) {
                    count = answer;
                }
                answer = 1;
            }
        }
        // if (ch[s.length() - 1] == ch[s.length() - 2]) {
        //     answer++;
        // }
        return count;
    }
}