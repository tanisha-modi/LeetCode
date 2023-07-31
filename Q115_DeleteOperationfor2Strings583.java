// link to the question --> https://leetcode.com/problems/delete-operation-for-two-strings/description/

class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];
        return helper(word1, word2, 0, 0);
    }
    public int  helper(String s1, String s2, int i, int j){
        if(i == s1.length() && j == s2.length())
        return 0;

        if(i == s1.length() || j == s2.length())
        return Math.max(s1.length() - i, s2.length() - j);

        if(dp[i][j] != 0)
        return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j))
        return helper(s1, s2, i+1, j+1);

        return dp[i][j] = 1 + Math.min(helper(s1, s2, i+1, j), helper(s1, s2, i, j+1));
    }
}