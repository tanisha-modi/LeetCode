// link to the question --> https://leetcode.com/problems/monotonic-array/description/

// ---------------------------------------------------------------------------------------------------
class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;

        if(n == 1){
            return true;
        }
        int i = 0;
        while((i < n-1) && nums[i] == nums[i+1]){

            i++;
        }
        if((i < n-1) && nums[i] > nums[i+1]){
            while(i < n-1){
                if(nums[i] < nums[i+1]){
                    return false;
                }
                i++;
            }
        }
        else if((i < n-1)){
            while(i < n-1){
                if(nums[i] > nums[i+1]){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}


// ---------------------------------------------------------------------------------------------------
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            } else if (nums[i] < nums[i - 1]) {
                increasing = false;
            }

            if (!increasing && !decreasing) {
                return false;
            }
        }

        return true;
    }
}



