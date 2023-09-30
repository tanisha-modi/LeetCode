// link to the question --> https://leetcode.com/problems/valid-parentheses/description/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }
                else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


 class Solution {
    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
}