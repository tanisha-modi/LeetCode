// link to the question --> https://leetcode.com/problems/fibonacci-number/description/

class Solution {
    public int fib(int n) {

        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}