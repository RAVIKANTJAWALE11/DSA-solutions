class Solution {
    public int[] searchRange(int[] arr, int target) {
        int x = first(arr, target);
        int y = last(arr, target);
        return new int[] { x, y };
    }

    static int first(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int one = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                one = mid;
                high = mid - 1; 
            }
        }
        return one;
    }

    static int last(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int last = -1;
        
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
        return last;
    }
}