// link to the question --> https://leetcode.com/problems/minimum-size-subarray-sum/description/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, k = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        int n = nums.length;
        while(k < n){
            sum += nums[k];
            while(sum >= target){
                ans = Math.min(ans, k-i +1);
                sum -= nums[i];
                i++;
            }
            k++;
        }
        if(ans == Integer.MAX_VALUE)
        return 0;
        return ans;
    }
}