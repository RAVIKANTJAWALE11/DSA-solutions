class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char center = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                if (center != 0) return ""; // Invalid palindrome base
                center = (char) ('a' + i);
                freq[i]--;
            }
        }

        int n = s.length();
        int half = n / 2;

        // Step 1: Try exact prefix match of the first half
        int[] avail = freq.clone();
        boolean canFormFirstHalf = true;
        for (int i = 0; i < half; i++) {
            int idx = target.charAt(i) - 'a';
            if (avail[idx] < 2) {
                canFormFirstHalf = false;
                break;
            }
            avail[idx] -= 2;
        }

        if (canFormFirstHalf) {
            String head = target.substring(0, half);
            StringBuilder sb = new StringBuilder(head);
            if (center != 0) sb.append(center);
            for (int i = half - 1; i >= 0; i--) {
                sb.append(head.charAt(i));
            }
            String cand = sb.toString();
            if (cand.compareTo(target) > 0) {
                return cand;
            }
        }

        // Step 2: Find the longest common prefix of the first half, then pick a strictly larger char
        for (int i = half - 1; i >= 0; i--) {
            // Re-calculate available pairs for prefix target[0...i-1]
            avail = freq.clone();
            boolean validPrefix = true;
            for (int k = 0; k < i; k++) {
                int idx = target.charAt(k) - 'a';
                if (avail[idx] < 2) {
                    validPrefix = false;
                    break;
                }
                avail[idx] -= 2;
            }

            if (!validPrefix) continue;

            int currCharIdx = target.charAt(i) - 'a';
            // Try placing a character strictly larger than target[i] at position i
            for (int j = currCharIdx + 1; j < 26; j++) {
                if (avail[j] >= 2) {
                    avail[j] -= 2;

                    StringBuilder head = new StringBuilder();
                    head.append(target, 0, i);
                    head.append((char) ('a' + j));

                    // Fill remaining half with smallest available characters
                    for (int k = 0; k < 26; k++) {
                        int count = avail[k] / 2;
                        while (count-- > 0) {
                            head.append((char) ('a' + k));
                        }
                    }

                    // Build complete palindrome
                    StringBuilder result = new StringBuilder(head);
                    if (center != 0) result.append(center);
                    for (int k = half - 1; k >= 0; k--) {
                        result.append(head.charAt(k));
                    }

                    return result.toString();
                }
            }
        }

        return "";
    }
}