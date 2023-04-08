// link to the question --> https://leetcode.com/problems/missing-number/

import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

            if(nums[0] != 0){
                return 0;
            }
        int i =1;
        while(i < nums.length ){
            
            if(nums[i-1] == nums[i]-1){
                i++;
            }
            else{
                return nums[i-1]+1;
                }
        }
         
        return nums[nums.length-1] +1;
    }
}