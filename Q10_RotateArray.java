// link to the question --> https://leetcode.com/problems/rotate-array/

class Solution {
    public void rotate(int[] nums, int k) {

        // what if k value greater than length of nums 
        k = k%nums.length;
        // step 1 - full array reverse
        reverse(nums, 0, nums.length -1);

        // step 2 - reverse array till k -1
        reverse(nums, 0 , k-1);

        //step 3 - reserve array from k to nums.length
        reverse(nums, k, nums.length -1);
    }

    public static void reverse(int[] arr, int start, int end){
         while(start<end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
}