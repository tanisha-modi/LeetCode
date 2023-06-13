// link to the question --> https://leetcode.com/problems/equal-row-and-column-pairs/

class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        HashMap<String, Integer> x = new HashMap<>();
	    HashMap<String, Integer> y = new HashMap<>();
	
        for(int i=0; i<n; i++){
            StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
            for(int j=0; j<n; j++){
                sb1.append(grid[i][j]);
                sb2.append(grid[j][i]);
                sb1.append(','); sb2.append(',');
            }
            String curr1 = sb1.toString(), curr2 = sb2.toString();
            x.put(curr1, x.getOrDefault(curr1, 0)+1);
            y.put(curr2, y.getOrDefault(curr2, 0)+1);
        }
    
        for(String str : x.keySet())
            if(y.containsKey(str))
                res += x.get(str)*y.get(str);
        return res;
    }
}