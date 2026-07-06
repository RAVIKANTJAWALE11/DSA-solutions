class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        // A pangram must have at least 26 characters
        if (n < 26)
            return false;
        
        boolean[] seen = new boolean[26];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int index = sentence.charAt(i) - 'a'; 
            
            if (!seen[index]) {
                seen[index] = true;
                count++;
                
                // Optimization: If we've found all 26 letters, we can exit early
                if (count == 26) {
                    return true;
                }
            }
        }
        
        return count == 26;
    }
}