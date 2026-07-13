class Solution {
    int floorSqrt(int n) {
        // code here
        int sqrt=0;
       for(int i =0;i<=n;i++){
           if(i*i>n) break;
           sqrt = i;
       }
       return sqrt;
    }
}