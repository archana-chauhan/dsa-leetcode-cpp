class Solution {
public:
    bool isValid(string s) {
        
        stack<char> validStack;
        
        for (char ch: s) {
            
            switch(ch) {
                case '(': 
                case '{':
                case '[':
                    validStack.push(ch);
                    break;
                    
                case ')': 
                    if (!validStack.empty() && validStack.top() == '(') validStack.pop();
                    else {
                        return false;
                    }
                    break;
                    
                case '}':
                    if (!validStack.empty() && validStack.top() == '{') validStack.pop();
                    else {
                        return false;
                    }
                    break;
                    
                case ']':
                    if (!validStack.empty() && validStack.top() == '[') validStack.pop();
                    else {
                        return false;
                    }
                    break;
                    
                default: continue;   
            }
        }
        
        if (validStack.empty()) return true;
        return false;
    }
};