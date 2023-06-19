// link to the question --> https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/

class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int i;
        for(i = 0; i < salary.length; i++){
            sum += salary[i];
            max = Math.max(max, salary[i]);
            min = Math.min(min, salary[i]);
        }
        sum = sum - min - max;
        return sum/(i-2);
    }
}