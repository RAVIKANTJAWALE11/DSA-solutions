class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        int res = 0;
        for(int i = 0 ;i<arr.length;i++){
            res = arr[k-1];
        }
        return res;
    }
}
