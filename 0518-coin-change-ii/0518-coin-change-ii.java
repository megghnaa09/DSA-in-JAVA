class Solution {
    public int solve(int coins[], int amount, int n, int dp[][]){
        if(amount == 0) return 1;
        if(dp[n][amount]!= -1){
            return dp[n][amount];
        }
        if(n==0 || amount<0) return 0;
        if(coins[n-1]<= amount){
            //include and exclud
            dp[n][amount]= solve(coins, amount-coins[n-1], n,dp)+ solve(coins, amount, n-1,dp);
        }else{
            dp[n][amount]= solve(coins, amount, n - 1, dp);
        }
        return dp[n][amount];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][]= new int[n+1][amount+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        return solve(coins, amount, n,dp);
    }
}