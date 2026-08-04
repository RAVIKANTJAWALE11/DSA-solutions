class Solution {
    public void rotate(int[][] mat) {
        for(int i=1;i<mat.length;i++ ){
            for(int j = 0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i = 0 ; i<mat.length;i++){
            int st = 0 ; 
            int end = mat[0].length-1;
            while(st<end){
                int temp = mat[i][st];
                mat[i][st]=mat[i][end];
                mat[i][end] = temp;
                st++;
                end--;
            }
        }   
    }
}