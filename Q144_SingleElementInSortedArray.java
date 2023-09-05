// link to question --> https://leetcode.com/problems/single-element-in-a-sorted-array/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 1;
        int end = nums.length -2;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            else if((mid%2 == 1 && nums[mid] == nums[mid -1]) || (mid%2 == 0 && nums[mid] == nums[mid+1])){
                start = mid+1;
            }
            else{
                end = mid -2;
            }
        }
        return -1;
    }
}