// link to the question --> https://leetcode.com/problems/reverse-words-in-a-string/description/


class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=temp.length-1; i>0; i--){
            if(temp[i]==""){
                continue;
            }
            ans.append(temp[i]+" ");
        }
        ans.append(temp[0]);
        return ans.toString();
    }
}



// class Solution {
//     public String reverseWords(String s) {
//         String[] st = s.split(" ");
//         for(int i = 0; i < st.length/2; i++){
//             String temp = st[i];
//             st[i] = st[st.length -i -1];
//             st[st.length - i-1] = temp; 
//         }

//         StringBuilder sb = new StringBuilder();
//         sb.append(st[0]);
//         for(int i = 1; i < st.length; i++){

//             if(!st[i].equals("")){
//             sb.append(" ");  
//             sb.append(st[i]);
//             }
//         }
//         return sb.toString();
//     }
// }