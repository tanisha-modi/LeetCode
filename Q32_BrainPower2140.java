// link to the question --> https://leetcode.com/problems/solving-questions-with-brainpower/

class Solution {
    // dynamic programming // bottom-up approach 
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];
        Arrays.fill(dp, 0);
        
        // end se start kiya 
        for(int i=n-1; i>=0 ;i--){
            int point = questions[i][0];
            int jump = questions[i][1];

            int nextQuestion = Math.min(n, i+jump+1);
            dp[i] = Math.max(dp[i+1], point + dp[nextQuestion]);
        }
        return dp[0];
    }
}