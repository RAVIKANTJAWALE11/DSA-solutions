class Solution {
    public String restoreString(String s, int[] ind) {
        int n = s.length();
        char [] ans = new char [s.length()];
        for(int i = 0 ;i<n;i++){
            ans[ind[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}