class Solution {
    static ArrayList<Integer> snakePattern(int mat[][]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i<mat.length;i++){
            if(i%2==0){
                for(int j = 0 ; j<mat[0].length;j++){
                    res.add(mat[i][j]);
                }
            }else{
                for(int j = mat[0].length-1;j>=0;j--){
                    res.add(mat[i][j]);
                }
            }
        }
        return res;
    }
}