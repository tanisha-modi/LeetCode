// link to the question --> https://leetcode.com/problems/search-in-rotated-sorted-array/

class Solution {
    public int search(int[] arr, int t) { 
        int pivot = findPivot(arr);
        // if theres no pivot // array is not rotated 
        if( pivot == -1){
            return BS(arr, t, 0, arr.length -1);
        }
        // if pivot is found, you have found 2 ascending sorted arrays 
        if(arr[pivot] == t){
            return pivot;
        }
        if(t >= arr[0]){
            return BS(arr, t, 0, pivot -1);
        }
        return BS(arr, t, pivot +1, arr.length -1);
    }
    public static int BS(int[] arr, int t, int start, int end){
        while(start <= end){
        int mid = start + (end - start)/2;
            if(arr[mid] == t){
                return mid;
            }
            else if(arr[mid] > t ){
                 end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1; 
    }
     
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
        int mid = start + (end - start)/2;
            // 4 cases over here 
            if(mid < end && arr[mid+1] <  arr[mid]){
                    // des 
                    return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return -1;
    }
}


// by kunal kushwah // binary search interview question 
// approach --
// 1. find the pivot // pivot is maximum element in the array  
// 2. search in first half 
// 3. search in third half 

// 1. (a) now the question is how to find a pivot 
      // pivot is only point where the array is descending otherwise its ascending 
      // if mid > mid+1 element => mid is pivot
      // if mid < mid-1 element => mid-1 is pivot
      // if start >= mid => all elemetns after mid are < start  => end = mid -1 
      // if start < mid => all elements before mid are smaller than mid => start = mid +1

// 2. (a) after finding pivot there are 3 cases 
      // pivot element is ans
      // target > start => start = 0, end = pivot -1
      // target < start => start = pivot +1 

