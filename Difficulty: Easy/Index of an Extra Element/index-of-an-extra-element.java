/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int n = a.length;
        int m = b.length;
        for(int i = 0 ;i<(m);i++){
            if(a[i]!=b[i]) return i;
        }
        return m;
    }
}