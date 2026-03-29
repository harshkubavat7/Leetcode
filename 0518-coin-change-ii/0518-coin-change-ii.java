class Solution {
    public int change(int amount, int[] coins) {
        //dp array to store the number ways to make each amount
        int[] dp = new int[amount+1]; //amount+1 because we consider 0 as well
        dp[0]=1;
        for(int nums : coins){
            for(int i=nums;i<=amount;i++){
                dp[i] = dp[i]+dp[i-nums];
            }
        }

        return dp[amount];
    }
}