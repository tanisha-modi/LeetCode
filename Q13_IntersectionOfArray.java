// link to the ques --> https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        

        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int array[] = new int[set2.size()];
        int i = 0;

        for(int key : set2){
            array[i++] = key;
        }
        return array;
    }
}