// link to the question --> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int free = 0;
        int hold = -prices[0];
        for(int i:prices){
            int tmp = hold;
            hold = Math.max(hold, free-i);
            free = Math.max(free, tmp+i-fee);
        }
        return free;
    }
}