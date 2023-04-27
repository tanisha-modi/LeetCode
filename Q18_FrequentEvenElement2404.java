// link to the question --> https://leetcode.com/problems/most-frequent-even-element/description/

class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean flag = false;
        int n = nums.length;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%2 == 0){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 1);
                }else{
                    map.put(nums[i], map.get(nums[i])+1);
            }
            }
        }
        int max = 0;
        int max_index = 0;

        for(int k : map.keySet()){
            if(map.get(k) >= max){
                if((map.get(k) == max && k < max_index) || map.get(k) > max){  
                max = map.get(k);
                max_index = k;
                flag = true;
                }
            }
        }
        if(flag == true){
            return max_index;
        }else{
            return -1;
        }
    }
}