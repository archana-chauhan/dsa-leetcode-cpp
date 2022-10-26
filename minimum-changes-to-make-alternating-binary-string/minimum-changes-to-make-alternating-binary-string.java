class Solution {
    public int minOperations(String s) {
        char flipBit = '0';
        int answerNew = 0, answer = 0;
        for (char ch: s.toCharArray()) {
            if (ch != flipBit) answer++;
            else answerNew++;
            flipBit ^= 1;
        }
        return Math.min(answer, answerNew);
    }
}