// link to the question --> https://leetcode.com/problems/remove-outermost-parentheses/description/


class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) return "";
        char[] c = s.toCharArray();
        StringBuilder newString = new StringBuilder();
        int open = 1;
        for (int i = 1; i < len; i++) {
            if (c[i] == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();
    }
}

// ------------------------------- using stack ----------------------------
// class Solution {
//     public String removeOuterParentheses(String s) {
//         Stack<Character> st = new Stack<>();
//         StringBuilder sb = new StringBuilder();

//         for(int i = 0; i < s.length(); i++){
//             char ch = s.charAt(i);

//             if(ch == '('){
//                 if(st.size() > 0){
//                     sb.append(ch);
//                 }
//                 st.push(ch);
//             }else{
//                 st.pop();
//                 if(st.size() > 0){
//                     sb.append(ch);
//                 }
//             }
//         }
//         return sb.toString();
//     }
// }