// link to the question --> https://leetcode.com/problems/permutations/description/

class Solution {
    List<List<Integer>> ans;
    boolean[] freq;
    List<Integer> ds;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        ds = new ArrayList<>();
        freq = new boolean[nums.length];
        recurPermute(nums);
        return ans;
    }
    private void recurPermute(int[] nums){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
            recurPermute(nums);
            ds.remove(ds.size() - 1);
            freq[i] = false;
            }
        }
    }
}