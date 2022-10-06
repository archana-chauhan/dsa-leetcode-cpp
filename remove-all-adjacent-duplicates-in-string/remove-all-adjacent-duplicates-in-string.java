class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty()) {
                if (stack.peek().equals(s.charAt(i))) {
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }

        for (Character ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }
}