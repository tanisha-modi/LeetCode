// link to the question --> https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end =nums.length -1;
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            
            if(mid < end && nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            else if(mid > start && nums[mid] < nums[mid -1]){
                return nums[mid];
            }
            else if(nums[mid] < nums[start]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return nums[0];
    }
}