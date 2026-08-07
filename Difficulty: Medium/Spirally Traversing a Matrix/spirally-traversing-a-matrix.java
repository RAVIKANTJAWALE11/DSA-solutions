class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int fr = 0, fc = 0, lr = m - 1, lc = n - 1;

        while (fr <= lr && fc <= lc) {
            //right
            for (int j = fc; j <= lc; j++) {
                ans.add(arr[fr][j]);
            }
            fr++;
            //down
            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--; 
            // Left 
            if (fr <= lr) {
                for (int j = lc; j >= fc; j--) {
                    ans.add(arr[lr][j]);
                }
                lr--; 
            }
            // Up
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) { 
                    ans.add(arr[i][fc]);
                }
                fc++; 
            }
        }
        
        return ans;
    }
}