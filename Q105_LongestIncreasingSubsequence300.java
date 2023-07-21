// link to the question --> https://leetcode.com/problems/longest-increasing-subsequence/description/

class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sublist = new ArrayList<>();
	sublist.add(nums[0]);

	for (int i = 1; i < nums.length; i++) {

		int curr = nums[i];

		// if current element is greater than max value in sublist, add it in sublist
		if (curr > sublist.get(sublist.size() - 1)) {
			sublist.add(curr);
		} else {
			// replace with smallest element that is greater than or equal to curr
			int positionToInsert = binarySearch(sublist, curr);
			sublist.set(positionToInsert, curr);
		}
	}

	return sublist.size();
}

private int binarySearch(ArrayList<Integer> sublist, int curr) {
	int left = 0, right = sublist.size() - 1;

	while (left < right) {

		int mid = left + (right - left) / 2;

		if (sublist.get(mid) == curr) {
			return mid;
		}

		if (sublist.get(mid) > curr) {
			right = mid;
		} else {
			left = mid + 1;
		}
	}
	return left;
    }
}