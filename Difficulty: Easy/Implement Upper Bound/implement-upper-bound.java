class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int hi = n-1;
        int lo = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<=target){
                lo = mid+1;
            }else hi = mid-1;
        }
        return lo;
    }
}
