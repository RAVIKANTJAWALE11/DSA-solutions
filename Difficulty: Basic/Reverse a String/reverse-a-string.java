class Solution {
    public static String reverseString(String s) {
        char[] chars = new char[s.length()];
        for(int i = 0 ;i<s.length();i++){
            chars[i]=s.charAt(i);
        }
        int i = 0;
        int j = chars.length - 1;
        
        while (i < j) {
        
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            
            i++;
            j--;
        }
        
        return new String(chars);
    }
}