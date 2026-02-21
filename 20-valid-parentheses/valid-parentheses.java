class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            char ch = arr[i];

           
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            }
            
            else {
                if (stk.isEmpty()) return false;

                char top = stk.pop();

                if (
                    (ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }

        
        return stk.isEmpty();
    }
}