class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int j = n; 
        for (int k = 0; k < n; k++) {
            if (nums[k] >= 0) {
                j = k;
                break;
            }
        }
        
        int i = j - 1; 
        int p = 0;  
        while (i >= 0 || j < n) {
            if (i < 0) {
                arr[p++] = nums[j] * nums[j];
                j++;
            } else if (j >= n) {
                arr[p++] = nums[i] * nums[i];
                i--;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                arr[p++] = nums[i] * nums[i];
                i--;
            } else {
                arr[p++] = nums[j] * nums[j];
                j++;
            }
        }
        
        return arr;
    }
}