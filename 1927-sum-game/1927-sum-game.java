class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        double sumDiff = 0;
        int qDiff = 0;

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);
            if (i < n / 2) {
                if (c == '?') {
                    qDiff++;
                } else {
                    sumDiff += c - '0';
                }
            } else {
                if (c == '?') {
                    qDiff--;
                } else {
                    sumDiff -= c - '0';
                }
            }
        }
        return sumDiff + (qDiff * 4.5) != 0;
    }
}