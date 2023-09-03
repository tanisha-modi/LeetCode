// link to the question --> https://leetcode.com/problems/sort-characters-by-frequency/

// class Solution {
//     public String frequencySort(String str) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         TreeMap<Integer, List<Character>> tree = new TreeMap<>();

//         for(int i = 0; i < str.length(); i++){
//              map.put(i, map.getOrDefault(i, 0) +1);
//         } 

//         for(char key : map.keySet()){
//             if(tree.contains(map.get(key))){
//                 List<Character> l = tree.get(map.get(key));
//                 l.add(key);
//                 tree.put(map.get(key), l);
//             }
//             else{
//                 List<Character> l = new LinkedList<>();
//                 l.add(key);
//                 tree.put(map.get(key), l);
//             }
//         }

//         StringBuilder sb = new StringBuilder();
//         for(int key : tree.keySet()){
//             for(int i = 0; i < tree.get(key).size(); i++){
//                 for(int j = 0; j < key; j++){
//                     sb.append(tree.get(key).get(i));
//                 }
//             }
//         }
//         sb.reverse();
//         return sb;
//     }
// }

class Solution {
    public String frequencySort(String s) {
        int[] a=new int[128];
        for(char ch: s.toCharArray()){
            a[ch]++;
        }
        char [] c =new char[s.length()];
        for(int i=0;i<s.length();){
            int max=0;
            int index=0;

        for(int j=0;j<128;j++){
            if(a[j]>max){
                max=a[j];
                index=j;
            }
        }
        while(a[index]>0){
            c[i++]=(char)index;
            a[index]--;
        }    
        }
        return new String(c);    
    }
}