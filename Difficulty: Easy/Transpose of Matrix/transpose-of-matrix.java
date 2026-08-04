import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] arr) {
        int m = arr.length;        
        int n = arr[0].length;     
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                row.add(arr[i][j]);
            }
            res.add(row);
        }
        
        return res;
    }
}