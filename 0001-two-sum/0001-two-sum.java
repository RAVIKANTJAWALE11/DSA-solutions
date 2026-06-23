class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length - 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = i+1; j <= n; j++) {
                sum = arr[i] + arr[j];

                if (sum == target) {
                  return new int [] {i ,j};
                }
            }
        }
        return new int[] {};
    }
}