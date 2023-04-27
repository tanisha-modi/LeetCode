// link to the question --> https://leetcode.com/problems/subarray-sum-equals-k/    

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        map.put(0,1);
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];

            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            if(map.containsKey(sum)){
            map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
             
        }
        return ans;
    }
}