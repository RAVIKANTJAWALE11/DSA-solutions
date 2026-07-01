class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex;
        List<Integer> res = new ArrayList<>();
        int [][] mat = new int [n+1][n+1];
        for(int i = 0 ;i<n+1;i++){
            for(int j = 0 ;j<=i;j++){
                if(i==j)mat[i][j]=1;
                else if(j==0)mat[i][j]=1;
                else mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
                if(i==n)res.add(mat[i][j]);
            }
        }
        return res;
    }
}