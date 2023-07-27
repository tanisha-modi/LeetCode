//  link to the question --> https://leetcode.com/problems/maximum-running-time-of-n-computers/description/

class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long low = 0L;
        long high = 0L;
        long ans = 0L;

        for(int i = 0; i < batteries.length; i++){
            high += batteries[i];
        }

        while(low <= high){
            long mid = low + (high - low)/2;

            if(isPossible(batteries, n, mid)){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] batteries, int n, long time){
        long toTime = 0;

        for(int i = 0; i < batteries.length; i++){
            int bTime = batteries[i];
            if(bTime < time) toTime += bTime;
            else toTime += time;

        }
        return toTime >= time*n;
    }
}