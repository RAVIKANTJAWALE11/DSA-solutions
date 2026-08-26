
class Solution {
    public int shipWithinDays(int[] wgt, int days) {
        int n = wgt.length;
        int sum = 0; 
        int max = 0;
        
        for (int weight : wgt) {
            max = Math.max(weight, max);
            sum += weight;
        }

        int lo = max, hi = sum, ans = sum;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (getDaysNeeded(mid, wgt) <= days) {
                ans = mid;
                hi = mid - 1; 
            } else {
                lo = mid + 1; 
            }
        }
        
        return ans;
    }

    private int getDaysNeeded(int capacity, int[] wgt) {
        int days = 1;
        int currentWeight = 0;
        
        for (int weight : wgt) {
            if (currentWeight + weight > capacity) {
                days++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        
        return days;
    }
}