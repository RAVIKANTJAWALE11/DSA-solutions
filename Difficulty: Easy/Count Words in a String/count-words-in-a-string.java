class Solution {
    public int countWords(String s) {
        int count = 0;
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            while (i < n && (s.charAt(i) == ' ' || s.charAt(i) == '\t' || s.charAt(i) == '\n')) {
                i++;
            }
            
            if (i < n) {
                count++;
                while (i < n && s.charAt(i) != ' ' && s.charAt(i) != '\t' && s.charAt(i) != '\n') {
                    i++;
                }
            }
        }
        
        return count;
    }
}