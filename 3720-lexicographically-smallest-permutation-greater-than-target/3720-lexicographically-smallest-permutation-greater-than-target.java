import java.util.*;

class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        int matchLen = 0;
        while (matchLen < n) {
            char tChar = target.charAt(matchLen);
            if (count[tChar - 'a'] > 0) {
                count[tChar - 'a']--;
                matchLen++;
            } else {
                break;
            }
        }
        for (int i = matchLen; i >= 0; i--) {
            if (i < matchLen) {
                count[target.charAt(i) - 'a']++;
            }

            if (i < n) {
                char targetChar = target.charAt(i);

                for (int c = targetChar - 'a' + 1; c < 26; c++) {
                    if (count[c] > 0) {
                        StringBuilder sb = new StringBuilder();
      
                        sb.append(target.substring(0, i));
                        
                        sb.append((char) ('a' + c));
                        count[c]--;

                        for (int k = 0; k < 26; k++) {
                            while (count[k] > 0) {
                                sb.append((char) ('a' + k));
                                count[k]--;
                            }
                        }
                        return sb.toString();
                    }
                }
            }
        }

        return "";
    }
}