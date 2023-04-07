// https://leetcode.com/problems/rotate-array/description/
// not correct answer

public class Q4_RotatedArray {
    public static void main(String[] args) {
        int t = 4;
        int[] arr = { 12, 23, 34, 53, 23, 4323, 23, 27 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int[] ans = RotateArray(arr, t);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ", ");
        }

    }

    // int n1 = arr[arr.length - 3];
    // int n2 = arr[arr.length - 2];
    // int n3 = arr[arr.length - 1];

    // for (int i = arr.length - 1; i > 2; i--) {
    // // System.out.println(arr[i]);
    // arr[i] = arr[i - 3];
    // System.out.println(arr[i]);

    // }
    // arr[0] = n1;
    // arr[1] = n2;
    // arr[2] = n3;

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + ", ");
    // }

    // }
    static int[] RotateArray(int[] nums, int t) {

        int[] arr = new int[t];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = nums[nums.length - t + i];

        }
        for (int i = nums.length - 1; i > t - 1; i--) {
            // System.out.println(nums[i]);
            nums[i] = nums[i - t];
            // System.out.println(nums[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
    }

}
