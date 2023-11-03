// link to the question --> https://leetcode.com/problems/build-an-array-with-stack-operations/

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        Arrays.sort(target);

        int j = 0;
        for(int i = 0; j < target.length & i < n; i++){
            if(target[j] == i+1){
                list.add("Push");
                j++;
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}