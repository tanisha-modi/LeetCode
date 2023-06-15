// link to the question --> https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class Solution {
    public int countNegatives(int[][] grid) {
        // int count = 0;
        // for(int i = 0; i < grid.length; i++){
        //     for(int j = 0; j < grid[i].length; j++){
        //         if( grid[i][j] < 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // optimization ..2 pointers 
        int i = 0;                  // column
        int j = grid[0].length - 1; // row 
        int count = 0;
        
        while (i < grid.length && j >= 0) {      
            if (grid[i][j] < 0) {
                count += (grid.length - i);      // row-length - col ..coz uske baad saare negative hai 
                j--;                             // row decremented 
            } else if (grid[i][j] >= 0) {
                i++;                             // column incremented 
            }
        }
        
        return count;
    }
}