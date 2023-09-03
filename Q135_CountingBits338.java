// link to the question --> https://leetcode.com/problems/counting-bits/description/

class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;

        for(int i = 1; i < arr.length; i++){
            String j = Integer.toBinaryString(i);
            int count = 0;
            for(int k = 0; k < j.length(); k++){
                if(j.charAt(k) == '1'){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
// public class Solution {
//     public int[] countBits(int n) {
//         int[] ans = new int[n + 1];
//         for (int i = 1; i <= n; i++) {
//             ans[i] = ans[i >> 1] + (i & 1);
//         }
//         return ans;
//     }
// }