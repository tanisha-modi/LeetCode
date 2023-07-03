// link to the question --> https://leetcode.com/problems/buddy-strings/description/

class Solution {
    public boolean buddyStrings(String s, String goal) {
        int index = 0;
        int count = 0;
        String t = s;
        if(s.length() != goal.length()){
            return false;
        }else if(s.equals(goal)){
            int[] frequency = new int[26];
            for (char ch : s.toCharArray()) {
                frequency[ch - 'a'] += 1;
                if (frequency[ch - 'a'] == 2) {
                    return true;
                }
            }
        }
        else{
                for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) != goal.charAt(i) && count == 0){
                    index = i;
                    count++;
                }else if(s.charAt(i) != goal.charAt(i) && count > 0){
                    t = swap(s, index, i);
                    if(t.equals(goal)){
                        return true;
                    }else{
                        return false;
                    }
                }
                if(count == 0){
                    return true;
                }
            }
                return false;
        }
    static String swap(String str, int k, int l){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(k, str.charAt(l));
        sb.setCharAt(l, str.charAt(k));
        return sb.toString();
    }
}