// link to the question --> https://leetcode.com/problems/reverse-string/description/

class Solution {
    public void reverseString(char[] s) {
        reverse(0, s.length -1, s);
        System.out.println(Arrays.toString(s));
    }

    public static int reverse(int start, int end, char[] s){

        if(start >= end){
            return 1;
        }
        char temp = s[end];
        s[end] = s[start];
        s[start] = temp;
        return reverse(start +1, end -1, s);

    }
}