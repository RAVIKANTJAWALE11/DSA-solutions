class Solution {
    public int distinctSubseqII(String s) {
        long[] last = new long[26];
        long mod = 1_000_000_007;

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            long currentTotal = 0;
            for (long count : last) {
                currentTotal = (currentTotal + count) % mod;
            }
            last[idx] = (currentTotal + 1) % mod;
        }

        long result = 0;
        for (long count : last) {
            result = (result + count) % mod;
        }

        return (int) result;
    }
}