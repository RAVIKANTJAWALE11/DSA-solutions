class Solution {
    public int[] runningSum(int[] arr) {
        int [] res = new int [arr.length];
        if(arr.length == 1) return arr;
        for(int i =1;i<arr.length;i++){
            res[0] = arr[0];
            res[i]= arr[i]+res[i-1];
        }
        return res;
    }
}