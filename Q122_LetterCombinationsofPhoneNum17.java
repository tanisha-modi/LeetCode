// link to the question --> https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

class Solution {
    public static String[] keypad = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static ArrayList<String> arr = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return arr;
        }
        comb(digits, 0, "");
        ArrayList<String> arr1 = new ArrayList<>(arr);
        arr.clear(); 
        return arr1;
    }

    public static void comb(String str, int idx, String combination){

        if(idx == str.length()){
            arr.add(combination);
            return;
        }

        char curr = str.charAt(idx);
        String mapping = keypad[curr - '2'];

        for(int i = 0; i < mapping.length(); i++){
            comb(str, idx+1, combination + mapping.charAt(i));
        }
    }
}