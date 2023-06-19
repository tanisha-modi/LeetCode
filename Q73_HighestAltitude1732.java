// link to the question --> https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
            int max = 0;
            max = max > gain[0] ? max : gain[0];
        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i-1] + gain[i];
            max = Math.max(max,gain[i]);
        }
        return max;
    }
}