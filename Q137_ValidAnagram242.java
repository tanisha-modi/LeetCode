// link to the question --> https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray(); 
        char[] arr2 = t.toCharArray(); 

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String str1 = String.valueOf(arr1);
        String str2 = String.valueOf(arr2);



        if(str1.equals(str2))
        return true;

        return false;
    }
}