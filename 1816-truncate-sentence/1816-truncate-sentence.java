class Solution {
    public String truncateSentence(String s, int k) {
        int count = k;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count--;
                if (count == 0) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}
