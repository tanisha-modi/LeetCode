// lin to the question -->https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
         // Code here
        if(x < 0){
            return false;
        }
        int k = x;
        int ans = 0;
        int unit = 0;
        while(x!=0){
            unit = x%10;
            ans = ans*10 + unit;
            x = x/10;
        }
        if(ans == k){
            return true;
        }
        else{
            return false;
        }
    }
}