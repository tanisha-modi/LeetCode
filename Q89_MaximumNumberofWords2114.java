// link to the question --> https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int res=0;
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String str[]=sentences[i].split(" ");
            
            if(str.length>max)
            {
                max=str.length;
            }
        }
        res=max;
        return res;
        
    }
}