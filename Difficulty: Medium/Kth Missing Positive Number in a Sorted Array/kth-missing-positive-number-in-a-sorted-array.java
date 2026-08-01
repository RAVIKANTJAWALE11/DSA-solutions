class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo=0, hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int cn = mid +1;
            int mis = arr[mid] - cn;
            if(mis>=k) hi = mid-1;
            else lo = mid+1;
        }
        return hi+1+k;
    }
}