class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        long lo = 1;
        long hi = x;
        while(lo<=hi){
            long mid = lo +(hi-lo)/2;
            if(mid==x/mid) return (int)mid;
            else if(mid>x/mid) hi = mid-1;
            else lo = mid +1;
        }
        return (int)hi;
    }
}