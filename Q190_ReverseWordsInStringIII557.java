// link to the question --> https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

class Solution {
    public String reverseWords(String s) {
        String[] arr =  s.split(" ");
        StringBuilder sb = new StringBuilder();
        int j = arr.length -1;
        for(int i = 0; i < arr.length/2; i++){
            String temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
        }
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length -1){
                sb.append(arr[i]);
                break;
            }
            sb.append(arr[i] + " ");
        }
        return sb.reverse().toString();
        
    }
}



public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse(); 
            reversed.append(reversedWord).append(" "); 
        }
        return reversed.toString().trim();
    }
}