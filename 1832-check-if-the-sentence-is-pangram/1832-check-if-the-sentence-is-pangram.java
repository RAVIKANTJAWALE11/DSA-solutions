class Solution {
    public boolean checkIfPangram(String sentence) {
        int s = sentence.length();
        int[] arr = new int[26];
        if (s < 26)
            return false;
        else {
            for (int i = 0; i < s; i++) {
                int idx = sentence.charAt(i) - 'a';
                arr[idx]++;
            }
            for (int i = 0; i <26; i++) {
                if (arr[i] == 0) return false;
            }
        }
        return true;
    }
}