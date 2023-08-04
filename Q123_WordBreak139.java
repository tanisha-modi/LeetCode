// link to the question --> https://leetcode.com/problems/word-break/description/

class Solution {
    boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
         int len = s.length();
         dp = new boolean[s.length()+1];
         Arrays.fill(dp, false);
         dp[s.length()] = true;

         for(int i = len- 1; i >= 0; i--){
             for(int j = 0; j < wordDict.size(); j++){
                 String word = wordDict.get(j);
                 int n = word.length();
                 if(i + n <= len){
                     if(word.equals(s.substring(i, i+n)))
                     dp[i] = dp[i + n];
                     if(dp[i] == true)
                     break;
                 }
             }
         }
         return dp[0];
    }
}