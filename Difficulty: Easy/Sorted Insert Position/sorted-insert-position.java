class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==k) return mid;
            else if(arr[mid]>k) high = mid-1;
            else low = mid+1;
        }
        return high+1;
    }
};