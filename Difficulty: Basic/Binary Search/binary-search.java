class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid]>k) high = mid-1;
            else if(arr[mid]<k) low = mid+1;
            else return true;
        }
        return false;
    }
}