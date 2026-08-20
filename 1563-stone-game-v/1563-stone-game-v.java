class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        
        // Prefix sums to query range sum in O(1)
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + stoneValue[i];
        }
        
        // memo[i][j] stores the max score for subarray stoneValue[i...j]
        int[][] memo = new int[n][n];
        
        return solve(0, n - 1, prefix, memo);
    }
    
    private int solve(int i, int j, int[] prefix, int[][] memo) {
        if (i == j) {
            return 0;
        }
        
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        
        int maxScore = 0;
        
        // Try every possible split point k
        for (int k = i; k < j; k++) {
            int leftSum = prefix[k + 1] - prefix[i];
            int rightSum = prefix[j + 1] - prefix[k + 1];
            
            if (leftSum < rightSum) {
                maxScore = Math.max(maxScore, leftSum + solve(i, k, prefix, memo));
            } else if (rightSum < leftSum) {
                maxScore = Math.max(maxScore, rightSum + solve(k + 1, j, prefix, memo));
            } else {
                // If sum is equal, Alice can choose either side
                int takeLeft = leftSum + solve(i, k, prefix, memo);
                int takeRight = rightSum + solve(k + 1, j, prefix, memo);
                maxScore = Math.max(maxScore, Math.max(takeLeft, takeRight));
            }
        }
        
        return memo[i][j] = maxScore;
    }
}