//  link to the question --> https://leetcode.com/problems/number-of-good-pairs/description/



class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        int count = 0; 
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            count += fact(e.getValue() -1); 
        }
        return count;
    }
    private int fact(int i){
        if(i <= 1){
            return i;
        }
        return i+fact(i-1);
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (numCount.containsKey(num)) {
                count += numCount.get(num);
                numCount.put(num, numCount.get(num) + 1);
            } else {
                numCount.put(num, 1);
            }
        }
        return count;
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}