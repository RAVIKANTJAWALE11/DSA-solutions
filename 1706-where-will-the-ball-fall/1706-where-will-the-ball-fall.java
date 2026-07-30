class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[n];
        for(int ball=0;ball<n;ball++){
            boolean stuck = false;
            int row=0;
            int col=ball;
            while(col<n && row<m){
                if(grid[row][col]==1){
                    if(col==n-1 || grid[row][col+1]==-1){
                        stuck=true;
                        break;
                    }
                    col++;
                }else{
                    if(col==0 || grid[row][col-1]==1){
                        stuck=true;
                        break;
                    }
                    col--;
                }
                row++;
            }
            if(stuck==true) arr[ball]=-1;
            else arr[ball]=col;
        }
        return arr;
    }
}