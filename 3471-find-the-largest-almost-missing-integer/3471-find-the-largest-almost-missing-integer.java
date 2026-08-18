class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == 1) {
            int[] freq = new int[51]; 
            for (int num : nums) {
                freq[num]++;
            }
            int maxVal = -1;
            for (int i = 50; i >= 0; i--) {
                if (freq[i] == 1) {
                    return i; 
                }
            }
            return maxVal;
        }


        if (k == n) {
            int maxVal = -1;
            for (int num : nums) {
                maxVal = Math.max(maxVal, num);
            }
            return maxVal;
        }
        int countFirst = 0;
        int countLast = 0;
        for (int num : nums) {
            if (num == nums[0]) countFirst++;
            if (num == nums[n - 1]) countLast++;
        }

        int maxVal = -1;
        if (countFirst == 1) {
            maxVal = Math.max(maxVal, nums[0]);
        }
        if (countLast == 1) {
            maxVal = Math.max(maxVal, nums[n - 1]);
        }

        return maxVal;
    }
}