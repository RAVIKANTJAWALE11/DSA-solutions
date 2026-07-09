class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        int res = 0;
        int rem[]=new int[k];
        for(int i = 0 ;i<arr.length;i++){
            int r = arr[i]%k;
            int sec = (k-r)%k;
            res+=rem[sec];
            rem[r]++;
        }
        return res;
    }
}