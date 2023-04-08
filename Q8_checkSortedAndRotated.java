// link to the question --> https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {
    public boolean check(int[] nums) {
        boolean flag =  true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > nums[i]){    // jaha se rotate hua vo point 
                 
                 if(nums[0]<nums[nums.length-1]){  // agr first element last se kam ho 
                     return false;
                 }
                 flag = checkRotate(nums, 1, i-1);  // array ko do parts me divide kiya aur dekha k dono sorted h yaah nhi 
                 if(flag == true){
                     flag = checkRotate(nums, i+1, nums.length -1);
                 }
                 else{
                     return flag;
                 }
            }
        }
        return flag;
    }
    public static boolean checkRotate(int[] arr, int start, int end){
        for(int i = start; i <= end; i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}