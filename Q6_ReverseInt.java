// link to the quesyion --> https://leetcode.com/problems/reverse-integer/submissions/926757925/

class Solution {
    public int reverse(int x) {
       int n;
       int ans = 0;
       boolean flag = false;
        if(x < 0){
            x = -1*x;
            flag = true;
        }
        while(x>0){
           n = x%10;
           if(ans > Integer.MAX_VALUE/10){
                   return 0;
               }
           ans = 10*ans + n;
           x = x/10;
        }
       if(flag == false){
            return ans;
       }else{
           return -ans;
       }
}
}