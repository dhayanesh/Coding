class Solution {
    public int maxProfit(int[] prices) {
        int start = 0, end = 1, max = 0;
        while(end < prices.length) {
            if(prices[start] < prices[end]) {
                max += prices[end] - prices[start];
                start = end;
                end++;
            }
            else {
                start = end;
                end++;
            }
        }
        return max;
    }
}