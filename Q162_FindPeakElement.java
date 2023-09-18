// link to the question --> https://leetcode.com/problems/find-peak-element/

class Solution {
    public int findPeakElement(int[] nums) {
        int start = 1; 
        int end = nums.length -2;
        int mid;


        if(nums.length == 1){
            return 0;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        if(nums[nums.length-2] < nums[nums.length-1]){
            return nums.length-1;
        }

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid +1]){
                return mid;
            }
            else if(nums[mid] > nums[mid -1]){
                start = start +1;
            }
            else{
                end = end -1;
            }
        }
        return nums[0];
    }
}