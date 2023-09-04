// link to the question --> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        int start = 0; 
        int end = nums.length -1; 
        int mid;

        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                 arr[0] = mid;
                 end = mid -1; // Move left to find the first occurrence 
            }

            else if( nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }


          start = 0; 
         end = nums.length -1; 
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target){
                 arr[1] = mid;
                 start = mid +1; // Move right to find the last occurrence
            }

            else if( nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr;
    }
}