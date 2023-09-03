// link to the question --> https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
      
        int i;
        for( i = 0; i < strs[0].length(); i++){
            // char k = strs[0].charAt(i);
            if(strs[0].charAt(i) != strs[strs.length -1].charAt(i)){

                break;
            }
            
           
        }
        
        return strs[0].substring(0, i);
    }
}