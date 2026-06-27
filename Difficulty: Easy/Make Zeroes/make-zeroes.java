class Solution {

    void makeZeros(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int [][] copy = new int [n][m];
        for(int i = 0;i<n;i++){
            for(int j =0 ;j<m;j++){
                copy[i][j] = mat[i][j];
            }
        }
        int[]dx={-1,0,0,1};
        int[]dy={0,-1,1,0};
        int ni =0;
        int nj =0;
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(copy[i][j]==0){
                    for(int k=0;k<4;k++){
                        ni=i+dx[k];
                        nj=j+dy[k];
                        if(ni>=0&&ni<n&&nj>=0&&nj<m){
                            mat[i][j] += copy[ni][nj];
                            mat[ni][nj]=0;
                        }
                    }
                }
            }
        }
    }
}