class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0 || amount < 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        if(dp[amount] != amount + 1)
            return dp[amount];
        else
            return -1;
    }
}
