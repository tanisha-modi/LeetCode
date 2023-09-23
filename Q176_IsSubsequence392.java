// link to the question --> https://leetcode.com/problems/is-subsequence/description/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        if(s.length() > t.length()){
            return false;
        }
        if(s.length() ==0){
            return true;
        }
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(count) == t.charAt(i)){
                count++;
            if(count == s.length()){
                return true;
            }
            }
        }
        return false;
    }
}