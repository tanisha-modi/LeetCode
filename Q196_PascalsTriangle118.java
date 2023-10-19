// link to the question --> https://leetcode.com/problems/pascals-triangle/

class Solution {
    public List<List<Integer>> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

for(int j = 0; j < rowIndex; j++){
        List<Integer> l = new ArrayList<>();
        long result = 1;
        l.add(1);
        for(int i = 0; i < j; i++){
            result = result * (j - i);
            result = result/(i+1);
            l.add((int)result);
        }
        list.add(l);
}
        return list;
    }
}