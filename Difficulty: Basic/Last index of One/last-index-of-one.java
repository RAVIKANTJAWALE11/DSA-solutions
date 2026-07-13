class Solution {
    public int lastIndex(String s) {
        int n = s.length();
        int pos = -1;
        for(int i = 0 ;i<n;i++){
            if(s.charAt(i)=='1') pos = i;
        }
        return pos;
    }
}