class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int one = -1;
        int last = -1;
        int high = n - 1;
        int low = 0;
        //1st occurance ka code 
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target)
                high = mid - 1;
            else if (arr[mid] < target)
                low = mid + 1;
            else {
                one = mid;
                high = mid - 1;
            }
        }
        if (one == -1) return 0;
        //last occurance 
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (last-one)+1;
    }
}
