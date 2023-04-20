// link to the question --> https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            int nz = 0; // nonzero
            int z = 0; // zero

            while(nz < nums.length){
                if(nums[nz]!=0){
                    int temp = nums[nz];
                    nums[nz] = nums[z];
                    nums[z] = temp;
                    z++;
                    nz++;
                }
                else{
                    nz++;
                }
            }
        }
    }
}