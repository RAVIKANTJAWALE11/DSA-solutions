class Solution {
    public int mySqrt(int x) {
        int lo = 1 ; 
        int hi = x;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(x/mid==mid) return (int)mid;
            if(x/mid<mid) hi=mid-1;
            else lo = mid+1;
        }
        return (int)hi;
    }
}