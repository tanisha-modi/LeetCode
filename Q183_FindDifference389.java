// link to the question --> https://leetcode.com/problems/find-the-difference/description/

// ---------------------------------------------------------------------------------------
class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1 = new char[26];
        char[] arr2 = new char[26];

        for(int i = 0; i < s.length(); i++ ){
          arr1[s.charAt(i) - 'a'] += 1;
        }
        for(int i = 0; i < t.length(); i++ ){
          arr2[t.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < 26; i++){
          if(arr1[i] != arr2[i]){
            return (char)(i+97);
          }
        }
        return 'a';
    }
}

// ---------------------------------------------------------------------------------------
class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        
        for(char c : t.toCharArray())
            sum += c;
        
        for(char c : s.toCharArray())
            sum -= c;
        
        return (char) sum;
    }
}