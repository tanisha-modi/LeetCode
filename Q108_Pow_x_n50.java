//  link to the question --> https://leetcode.com/problems/powx-n/description/


// one line solution --> 


// class Solution {
//     public double myPow(double x, int n) {
//          return Math.pow(x, n);
//     }
// }


class Solution {
    public double myPow(double x, int n) {
        double ans = solve(x, Math.abs(n));
        if(n < 0){
            return 1/ans;
        }
        return ans;
    }
    public double solve(double x, int n){
        if(n == 0){
            return 1;
        }
        double temp = solve(x, n/2);
        temp = temp* temp;
        if(n%2 == 0){
            return temp;
        }
        return temp*x;
    }
}