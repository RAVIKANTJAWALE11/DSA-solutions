class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;

        //  negatives ke liya
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int necount = low;

        // positive ke liye
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int pocount = n - low;

        return Math.max(necount, pocount);
    }
}