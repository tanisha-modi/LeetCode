// link to the question --> https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/

class Solution {
    int dp[][];
    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length() +1][s2.length() +1];
        return helper(s1, s2, 0, 0);
    }
    public int helper(String s1, String s2, int i, int j){
        int x = 0, y = 0, z =0;
        if( i == s1.length() && j == s2.length()) 
        return 0;

        if(i == s1.length() || j == s2.length()){
            if(i == s1.length()){
                for(int p = j; p <s2.length(); p++){
                    z += s2.charAt(p);
                }
            }
            else{
                   for(int p = i; p <s1.length(); p++){
                    z += s1.charAt(p); 
                }
        }
                return z;
        }

        if(dp[i][j] != 0)
        return dp[i][j];


        if(s1.charAt(i) == s2.charAt(j)){
            return helper(s1, s2, i+1, j+1);
        }
        return dp[i][j] = Math.min((int)s1.charAt(i) + helper(s1, s2, i+1, j),(int)s2.charAt(j) + helper(s1, s2, i, j+1));
    }
}
