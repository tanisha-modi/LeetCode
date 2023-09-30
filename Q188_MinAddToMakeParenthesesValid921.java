// link to the question --> https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

// -----------------------------------------------------------------------------------------

class Solution {
    public int minAddToMakeValid(String s) {
        int a = 0, b = 0; 
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                a++;
            } 
            else
            {
                if(a > 0)
                {
                    a--;
                } 
                else
                {
                    b++;
                }
            }
        } 
        return a+b;
    }
}

// ---------------------------------------------------------------------
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
         for( char c : s.toCharArray()){
             if(c == ')'){
                 if(!stack.isEmpty() && stack.peek() == '('){
                     stack.pop();
                 }
                 else{
                     stack.push(c);
                 }
             }else{
                 stack.push(c);
             }
         }
         return stack.size();
    }
}