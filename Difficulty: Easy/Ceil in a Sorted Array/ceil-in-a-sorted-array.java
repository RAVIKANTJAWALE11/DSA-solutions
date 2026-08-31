class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int n = arr.length;
        int hi = n-1;
        int lo = 0 ;
        int pos = n;
        if(arr[hi]<x) return -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]>=x){
                pos = mid;
                hi = mid-1;
            }else lo = mid+1;
        }
        return pos;
    }
}
