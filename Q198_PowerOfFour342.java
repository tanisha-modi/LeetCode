// link to the question --> https://leetcode.com/problems/power-of-four/

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0){
            return false;
        }
        int[] arr = new int[16];
        for(int i = 0; i <= 15; i++){
            arr[i] = (int)Math.pow((double)4, (double)i);
        }
        for(int i : arr){
            if(i == n){
                return true;
            }
        }
        return false;
    }
}



class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        
        return n == 1;
    }
}