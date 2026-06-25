class Solution {
    public int maxZeros(int[][] arr) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int col = -1;
        int sum = 0;
       for(int j = 0;j<m;j++){
            int count = 0;
            for(int i = 0;i<n;i++){
                if(arr[i][j]==0) count++;
            }
            if(count>sum){
                sum = count;
                col = j;
            }
       }
       return col;
    }
}