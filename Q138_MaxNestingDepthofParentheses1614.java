// link to the question --> https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
	for(int i = 0; i < s.length(); i++){
		char ch = s.charAt(i);
		if(ch == '('){
			count++;
            if(count > max){
                max = count;
            }
		}
        else if(ch == ')'){
            count--;
        }
	}
	return max;
    }
}