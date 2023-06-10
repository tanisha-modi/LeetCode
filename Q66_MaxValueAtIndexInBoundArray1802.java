// link to the question -->https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/description/

class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int emptyR = n - 1 - index;           // empty Right
        int emptyL = index;                   //empty Left

        int low = 1,high = maxSum;            // min and max value of mid or at index, low and high of binary search 
        int result = 0;

        while(low <= high){                  // binary search 
            int mid = low + (high - low)/2;

            long leftSum =0, rightSum =0,el = mid -1;

            // finding Right Sum
            if(emptyR <= el){
                rightSum = el*(el +1)/2 - (el - emptyR)*(el - emptyR + 1)/2;
            } 
            else{
                rightSum = el*(el +1)/2 + (emptyR - el);
            }
            // finding Left Sum
            if(emptyL <= el){
                leftSum = el*(el +1)/2 - (el - emptyL)*(el - emptyL + 1)/2;
            } 
            else{
                leftSum = el*(el +1)/2 + (emptyL - el);
            }

            long sum = rightSum + leftSum + mid;
            if(sum <= maxSum){
                low = mid+ 1;
                result = mid;
            }
            else{
                high = mid- 1;
            }
        }
        return result;
    }
}