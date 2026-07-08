class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int pos = -1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid]>k) high = mid -1;
            else if(arr[mid]<k) low = mid +1;
            else{
                pos = mid;
                high = mid-1;
            }
        }
        return pos;
    }
}