class Solution {
    public long sqrt(long x) {
        if (x == 0)
            return 0;

        long lo = 1, hi = x;

        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;

            if (mid == x / mid)
                return mid;
            else if (mid > x / mid)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        return hi;
    }

    public int arrangeCoins(int n) {
        return (int) ((sqrt(8L * n + 1) - 1) / 2);
    }
}