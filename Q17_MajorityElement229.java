// linnk to the question --> https://leetcode.com/problems/majority-element-ii/description/

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }

         List<Integer> li = new ArrayList<>();
        for(int k : map.keySet()){
            if(map.get(k) > n/3 ){
                li.add(k);
            }
        }


    return li;
 
    }
}