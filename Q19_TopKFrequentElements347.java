// link to the question --> https://leetcode.com/problems/top-k-frequent-elements/description/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // creating hashmap with all the elements in array with their frequency
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
            map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        int result[] = new int[k];
        int max = 0;
        int max_index = 0;
        // traversing the map 
        for(int j = 0; j < k; j++){
            for(int key : map.keySet()){
                if(map.get(key) > max){
                    max = map.get(key);
                    // System.out.print(max);
                    max_index = key;
                }
            }
            max = 0;
            map.put(max_index, 0);
            result[j] = max_index; 
        }
        
       return result;
    }
}