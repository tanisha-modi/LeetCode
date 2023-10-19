// link to the question --> https://leetcode.com/problems/pascals-triangle-ii/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
            list.add((int) comb(rowIndex, i));
        }
        return list;
    }

    private long comb(int n, int r){
        long result = 1;
        for(int i = 0; i < r; i++){
            result = result * (n - i)/ (i+1);
        }
        return result;
    }
}