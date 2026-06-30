class Solution {
    public int maxDotProduct(int[] A, int[] B) {
        // code here
        int n = A.length;
        int m = B.length;
        int[] dp = new int[m + 1];
        Arrays.fill(dp, Integer.MIN_VALUE / 2); 
        dp[0] = 0; 
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                int skip = dp[j]; 
                int pair = dp[j - 1] + (A[i - 1] * B[j - 1]);

                dp[j] = Math.max(skip, pair);
            }
        }

        return dp[m];
    }
    
}