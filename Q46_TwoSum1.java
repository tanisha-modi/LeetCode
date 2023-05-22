// link to the question --> https://leetcode.com/problems/two-sum/description/

// optimized using hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {

        // optimized approach using hashmap
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int sum = 0;
//         boolean flag = false;
//         int[] res = new int[2];
//         for(int i = 0; i < nums.length; i++){
//             for(int j = 1; j < nums.length; j++){
//                 if(i == j){
//                     continue;
//                 }
//                 sum =  nums[i] + nums[j];
//                 if(sum == target){
//                     res[0] = i;
//                     res[1] = j;
//                     flag = true;
//                 }
//             }
//             if(flag == true){
//                 break;
//             }
//         }
//         return res;
//     }
// }



// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         // bruteforce approchh 
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i+1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                    return new int[] {i, j};
//                 }
//             }
//         }
//         return new int[] {};
//     }
// }

