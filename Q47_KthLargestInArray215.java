// link to the question --> https://leetcode.com/problems/kth-largest-element-in-an-array/description/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);    // O(nlogn) complexity
        return nums[nums.length-k];
    }
}

// creating min heap // O(logn) complexity 
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//         for (int num : nums) {
//             minHeap.add(num);
//             if (minHeap.size() > k) {
//                 minHeap.poll();
//             }
//         }
//         return minHeap.peek();
//     }
// }