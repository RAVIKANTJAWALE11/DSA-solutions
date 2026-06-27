class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int row = 0, col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                    if (i == 0)
                        row = 1;
                    if (j == 0)
                        col = 1;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (col == 1) {
            for (int k = 0; k < n; k++) {
                mat[k][0] = 0;
            }
        }
        if (row == 1) {
            for (int k = 0; k < m; k++) {
                mat[0][k] = 0;
            }
        }
    }
}