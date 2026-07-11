class Solution {
    public int countOnes(int[] arr) {
        int n = arr.length;
        
        if (n == 0 || arr[0] == 0) {
            return 0;
        }

        int low = 0;
        int high = n - 1;
        int last = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == 1) {
                last = mid;   
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }

        return last + 1;
    }
}