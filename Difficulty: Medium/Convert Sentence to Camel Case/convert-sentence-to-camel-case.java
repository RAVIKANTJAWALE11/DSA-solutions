class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                flag = true;
            } else {
                if (flag) {
                    ans.append(Character.toUpperCase(ch));
                    flag = false; 
                } else {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}