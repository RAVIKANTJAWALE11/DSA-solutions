class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfSets(int n, int k) {
        int N = n + k - 1;
        int R = 2 * k;
        if (R > N) return 0;

        return (int) nCr(N, R);
    }

    private long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        if (r > n - r) r = n - r;

        long num = 1, den = 1;
        for (int i = 0; i < r; i++) {
            num = (num * (n - i)) % MOD;
            den = (den * (i + 1)) % MOD;
        }

        return (num * modInverse(den, MOD)) % MOD;
    }

    private long modInverse(long a, int m) {
        return power(a, m - 2, m);
    }

    private long power(long base, long exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}