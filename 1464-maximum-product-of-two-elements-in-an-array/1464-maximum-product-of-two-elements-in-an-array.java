class Solution {
    public int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int pro = (arr[n-2]-1)*(arr[n-1]-1);
        return pro;
    }
}