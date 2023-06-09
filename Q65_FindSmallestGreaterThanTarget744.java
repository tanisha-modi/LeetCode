// link to the question --> https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid;
        while (start <= end) {
            mid =start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start == letters.length ? letters[0] : letters[start];
    

        // brute-force approach ..approach same but no clean code 
    //     char res = BS(letters, target);
    //     if(res <= target){
    //         return letters[0];
    //     }
    //     return res;
    // }



        // int start = 0; 
        // int end = letters.length -1;
        // int mid = 0 ;

        // while(start <= end){
        //     mid = start + (end - start)/2;

        //     if(letters[mid] == t){

        //         if(mid == letters.length -1){
        //             return letters[mid];
        //         }
        //         else{
        //             for(int i = mid +1; i < letters.length -1; i++){
        //                 if(letters[i] == letters[mid])
        //                 mid++;
        //             }
        //         }
        //         return letters[mid+1];
        //     }
        //     else if(letters[mid] < t){
        //         start = mid +1 ;
        //     }
        //     else{
        //         end = mid -1;
        //     }
        // }
        // if(start == letters.length){
        //     return letters[end-1];
        // }else{
        //     return letters[start];
        // }
    }
}