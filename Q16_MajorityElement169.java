// link to the question --> https://leetcode.com/problems/majority-element/description/

class Solution {
    public int majorityElement(int[] nums) {

        // Maximum element occurs more than n/2 times thats why it is confirm it will be on mid after sorting array
        // Arrays.sort(nums);
        // return nums[nums.length/2];
      


        
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

        for(int k : map.keySet()){
            if(map.get(k) > n/2 ){
                return k;
            }
        }

    return  n;



    // moore voting algorithm  // time complexity : O(n)
        // 2 variable // count // element 
    //     int count = 0;
    //     int element = nums[0];
    //     for(int i = 0; i < nums.length; i++){
    //     if(count == 0){
    //         count = 1;
    //         element = nums[i];
    //     }
    //     else if(element == nums[i]){
    //         count++;
    //     }
    //     else{
    //         count--;
    //     }
    //     }


    // return element;
}
}