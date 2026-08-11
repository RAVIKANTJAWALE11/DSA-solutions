class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] count = new int[51];
        int res = 0;
        
        for (int num : nums) {
            count[num]++;
            if (count[num] == 2) {
                res ^= num;
            }
        }
        
        return res;
    }
}