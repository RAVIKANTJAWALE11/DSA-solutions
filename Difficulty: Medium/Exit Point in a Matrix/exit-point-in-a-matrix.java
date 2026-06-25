class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int resi = 0, resj=0;
        int dr = 0;
        int i = 0 , j = 0;
        while(i>=0 && i<n && j>=0 && j<m){
            if(mat[i][j]==1){
                mat[i][j] = 0;
                dr = (dr+1)%4;
            }
            resi = i;
            resj = j;
            
            if(dr == 0) j++;
            else if(dr == 1) i++;
            else if(dr == 2) j--;
            else if(dr == 3) i--;
        }
        res.add(resi);
        res.add(resj);
        return res;
    }
}