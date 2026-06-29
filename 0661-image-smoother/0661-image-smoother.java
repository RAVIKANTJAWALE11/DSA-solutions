class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int ans = 0;
        int [][] res = new int [n][m];
        int [] dx ={0,-1,-1,-1,0,1,1,1,0};
        int [] dy ={0,-1,0,1,1,1,0,-1,-1};
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int count = 0;
                int sum = 0;
                for(int l =0;l<9;l++){
                    int ni = i+dx[l];
                    int nj = j+dy[l];
                    if(ni>=0 && ni<n && nj>=0 && nj<m){
                        count++;
                        sum +=img[ni][nj];
                        ans = (sum/count);
                    }
                }
                 res[i][j] = ans;
            }
        }
        return res;
        
    }
}