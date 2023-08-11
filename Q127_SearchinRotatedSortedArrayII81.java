// link to the question --> https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/




// ---------------------------------- more optimized Solution -----------------------------

class Solution {
    public boolean search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] == nums[i] && nums[mid] == nums[j]) {
                i = i + 1;
                j = j - 1;
            } else if (nums[mid] >= nums[i]) {
                if (target >= nums[i] && target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else if (nums[mid] <= nums[j]) {
                if (target > nums[mid] && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }
        return false;
    }
}




// --------------------------------------------- Kunal Kushwah's solution ----------------------------------- 

// class Solution {
//     public boolean search(int[] nums, int target) {
//          int pivot = findPivotWithDuplicates(nums);
    
//             if (pivot == -1) {
//                 return binarySearch(nums, target, 0 , nums.length - 1);
//             }
//             if (nums[pivot] == target) {
//                 return true;
//             }
    
//             if (target >= nums[0]) {
//                 return binarySearch(nums, target, 0, pivot - 1);
//             }
    
//             return binarySearch(nums, target, pivot + 1, nums.length - 1);
//     }

//     static boolean binarySearch(int[] arr, int target, int start, int end) {
//             while(start <= end) {
//                 int mid = start + (end - start) / 2;
    
//                 if (target < arr[mid]) {
//                     end = mid - 1;
//                 } else if (target > arr[mid]) {
//                     start = mid + 1;
//                 } else {
//                     return true;
//                 }
//             }
//             return false;
//         }
//         static int findPivotWithDuplicates(int[] arr) {
//             int start = 0;
//             int end = arr.length - 1;
//             while (start <= end) {
//                 int mid = start + (end - start) / 2;
//                 // 4 cases over here
//                 if (mid < end && arr[mid] > arr[mid + 1]) {
//                     return mid;
//                 }
//                 if (mid > start && arr[mid] < arr[mid - 1]) {
//                     return mid-1;
//                 }
    
//                 // if elements at middle, start, end are equal then just skip the duplicates
//                 if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                     // skip the duplicates
//                     // NOTE: what if these elements at start and end were the pivot??
//                     // check if start is pivot
//                     if (start < end && arr[start] > arr[start + 1]) {
//                         return start;
//                     }
//                     start++;
    
//                     // check whether end is pivot
//                     if (end > start && arr[end] < arr[end - 1]) {
//                         return end - 1;
//                     }
//                     end--;
//                 }
//                 // left side is sorted, so pivot should be in right
//                 else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//                     start = mid + 1;
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//             return -1;
//         }
// }