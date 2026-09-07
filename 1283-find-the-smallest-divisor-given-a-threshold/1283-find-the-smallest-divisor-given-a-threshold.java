class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo = 1;
        int hi = 0;
        
        for (int num : nums) {
            hi = Math.max(hi, num);
        }
        
        int ans = hi;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (getSum(nums, mid) <= threshold) {
                ans = mid;    
                hi = mid - 1;
            } else {
                lo = mid + 1;  
            }
        }
        
        return ans;
    }
    
    private int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; 
        }
        return sum;
    }
}