class Solution {
    public ArrayList<Integer> sumTriangles(int mat[][]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int sum1=0;
        int sum2=0;
        for(int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                sum1+=mat[i][j];
            }
        }
         for(int i =0;i<n;i++){
            for(int j=0 ;j<=i;j++){
                sum2+=mat[i][j];
            }
        }
        res.add(sum1);
        res.add(sum2);
        return res;
    }
}