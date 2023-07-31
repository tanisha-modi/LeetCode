// link to the question --> https://leetcode.com/problems/single-number/description/

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                ans = e.getKey();
                break;
            }
        }
        return ans;
    }
}

// class Solution {
//     public int singleNumber(int[] nums) {
//          Arrays.sort(nums);

//          for(int i = 0; i< nums.length -1; i = i+2){
//              if(!(nums[i] == nums[i+1])){
//                  return nums[i];
//              }
//          }
//          return nums[nums.length -1];
//     }
// }


// ------------------------100% beats, bit manipulation ----------------------

// class Solution {
//     public int singleNumber(int[] nums) {
//         int result=0;
//         for(int i=0; i<nums.length; i++) {
//             result = result^nums[i];
//         }
//         return result;
//     }
// }