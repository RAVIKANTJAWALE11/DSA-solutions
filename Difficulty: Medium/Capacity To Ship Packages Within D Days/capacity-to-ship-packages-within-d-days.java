
class Solution {
    public int leastWeightCapacity(ArrayList<Integer> arr, int d) {
        int maxWeight = 0;
        int sumWeight = 0;

        for (int w : arr) {
            maxWeight = Math.max(maxWeight, w);
            sumWeight += w;
        }

        int low = maxWeight;
        int high = sumWeight;
        int ans = sumWeight;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (getDaysNeeded(mid, arr) <= d) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private int getDaysNeeded(int capacity, ArrayList<Integer> arr) {
        int daysNeeded = 1;
        int currentWeight = 0;

        for (int w : arr) {
            if (currentWeight + w > capacity) {
                daysNeeded++;
                currentWeight = 0;
            }
            currentWeight += w;
        }

        return daysNeeded;
    }
}