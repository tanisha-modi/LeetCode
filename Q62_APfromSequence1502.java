// link to the question --> https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

// class Solution {        // Complexity : O(nlogn)
//     public boolean canMakeArithmeticProgression(int[] arr) {
//         Arrays.sort(arr);
//         int d = arr[1] - arr[0];
//         for(int i = 2; i < arr.length; i++){
//             if(arr[i] - arr[i-1] != d){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// Optimization // Complexity : O(n) => find minimun and maximum element, diff and then using hashset check whether every element of the AP is
                                     // present in the sequence or not.

// further optimizatin // time Complexity : O(n), Space Complexity : O(1)

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        int n = arr.length;

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int num : arr)   // finding min and max 
        {
            if (minNumber > num)
                minNumber  = num;
            if (maxNumber < num)
                maxNumber = num;
        }

        if ((maxNumber - minNumber) % (n - 1) != 0)   
            return false;

        int difference = (maxNumber - minNumber) / (n - 1);   // (an - a)/(n-1) = d 

        int i = 0;

        while (i < n)
        {
            if (arr[i] == minNumber + difference * i)   // already on correct location
                i++;
            else if ((arr[i] - minNumber) % difference != 0)   // no corrent location 
                return false;
            else
            {
                int pos = (arr[i] - minNumber) / difference;   // finding correct location 

                if (pos < i || arr[pos] == arr[i])   // if correction position is is less than current, if previous position are already correct 
                    return false;                    // OR 2 elements with same value present 

                int tmp = arr[pos];  // if correct position found swap
                arr[pos] = arr[i];
                arr[i] = tmp;
            }
        }

        return true;
    }
}