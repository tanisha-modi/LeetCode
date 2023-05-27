// link to the questin --> https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int i = nums.length - 1;
        int j = nums.length - 1;
        while(i >= 0){
            if(nums[i] == val){
                nums[i] = nums[j];
                i--;
                j--;
            }
            else{
                count++;
                i--;
            }
        }
        return i + count + 1;
    }
}