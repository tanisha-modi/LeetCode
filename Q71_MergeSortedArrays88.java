// link to the question --> https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] num1, int m, int[] second, int n) {
        int[] mix = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;     // for new mix array

        while( i < m && j < n){
            if(num1[i] < second[j]){
                mix[k] = num1[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete 
        // copy the remaining elements
        while( i < m){
            mix[k] = num1[i];
            i++;
            k++;
        }

        while( j < n){
            mix[k] =  second[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, num1, 0, m+n);
    }
}