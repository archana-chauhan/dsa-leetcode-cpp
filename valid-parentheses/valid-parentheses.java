class Solution {
    public boolean isValid(String str) {
        if (str.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            else {
                switch (str.charAt(i)) {
                    case ')':
                        if (!stack.empty() && stack.peek() == '(') stack.pop();
                        else return false;
                        break;
                    case '}':
                        if (!stack.empty() && stack.peek() == '{') stack.pop();
                        else return false;
                        break;
                    case ']':
                        if (!stack.empty() && stack.peek() == '[') stack.pop();
                        else return false;
                        break;
                }
            }
        }
        return stack.empty();
    }
}