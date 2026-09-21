class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        // dp[r] stores the number of subarrays ending at the previous index with product % k == r
        long[] dp = new long[k];

        for (int num : nums) {
            long[] nextDp = new long[k];
            int val = num % k;

            // Every new element can start a new subarray by itself
            nextDp[val]++;

            // Extend existing subarrays ending at the previous element
            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int nextRem = (r * val) % k;
                    nextDp[nextRem] += dp[r];
                }
            }

            // Accumulate counts into the final answer array
            for (int r = 0; r < k; r++) {
                result[r] += nextDp[r];
            }

            dp = nextDp;
        }

        return result;
    }
}