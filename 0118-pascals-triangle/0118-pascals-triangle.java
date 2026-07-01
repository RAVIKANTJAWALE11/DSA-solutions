class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int n = numRows;
        int [][] mat = new int [n][n];
        for(int i = 0 ;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0;j<=i;j++){
                if(i==j)mat[i][j]=1;
                else if(j==0)mat[i][j]=1;
                else mat[i][j]=mat[i-1][j]+mat[i-1][j-1];
                row.add(mat[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}