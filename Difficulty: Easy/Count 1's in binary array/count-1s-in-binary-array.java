class Solution {
    public int countOnes(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0 ;
        for(int i = 0 ; i<n;i++){
            if(arr[i]==1) count++;
        }
        return count;
    }
}