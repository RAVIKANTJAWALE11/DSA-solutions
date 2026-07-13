class Solution {
    int transitionPoint(int arr[]) {
        // code here
        int n = arr.length;
        int pos =-1;
        int low = 0;
        int high = n-1;
        if(arr[0]==1) return 0;
        if(arr[n-1]==0) return -1;
        while(low<=high){
            int mid = (high-low)/2+low;
            if(arr[mid]==1){
                pos = mid ;
                high = mid -1;
            }
            else if(arr[mid]<1) {
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        
        return pos;
    }
}