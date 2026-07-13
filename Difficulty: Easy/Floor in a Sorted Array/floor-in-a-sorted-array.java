class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int pos = -1;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=x){
                pos = mid ;
                low = mid+1;
            }else high = mid-1;
        }
        return pos;
    }
}
