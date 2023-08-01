// link to the question --> https://leetcode.com/problems/maximum-subarray/description/


class Solution {
    public int maxSubArray(int[] nums) {

// --------------- brute force approachh -----------------------------

        // int sum =0;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j =i; j < nums.length; j++){
        //         for(int l = i; l <= j; l++){
        //             sum += nums[l];
        //         }
        //         if(sum > max){
        //             max = sum;
        //         }
        //         sum = 0;
        //     }
        // }
        // return max;

// ---------------- Cumulative sum approach --------------------

        // int max = Integer.MIN_VALUE;
        // int[] currSum = new int[nums.length + 1];
        // currSum[0] = 0;
        // for(int i = 1; i <= nums.length; i++){
        //     currSum[i] = nums[i-1] + currSum[i-1];
        // }
        // for(int i = 0; i < currSum.length; i++){
        //      int sum = 0;
        //      for(int j = 0; j < i; j++){
        //          sum = currSum[i] - currSum[j];
        //          max = Math.max(sum, max);
        //      }
        // }
        // return max;


// ------------------- Kadane`s Algo -------------------------
         int currentSum = 0;
         int maxSum = Integer.MIN_VALUE;
         for(int i = 0; i < nums.length; i++){
             currentSum += nums[i];
             maxSum = Math.max(currentSum, maxSum);
             if(currentSum < 0){
                 currentSum = 0;
             }
         }
         return maxSum;
    }
}