class Solution {
    String merge(String word1, String word2) {
        // code here
        StringBuilder sb = new StringBuilder ();
        int i = 0;
        int j = 0;
        int n = word1.length();
        int m = word2.length();
        while(i<n && j<m){
            char ch = word1.charAt(i);
            sb.append(ch);
            i++;
            char op = word2.charAt(j);
            sb.append(op);
            j++;
        }
        if(i==n){
            while(j<m){
            char op = word2.charAt(j);
            sb.append(op);
            j++;
            }
        }if(j==m){
            while(i<n){
            char ch = word1.charAt(i);
            sb.append(ch);
            i++;
            }
        }
        return sb.toString();
    }
}