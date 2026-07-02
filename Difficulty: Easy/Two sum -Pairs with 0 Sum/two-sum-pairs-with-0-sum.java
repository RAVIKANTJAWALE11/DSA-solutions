import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                res.add(pair);
                i++;
                j--;
                while (i < j && arr[i] == arr[i - 1]) {
                    i++;
                }
                while (i < j && arr[j] == arr[j + 1]) {
                    j--;
                }
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }

        return res;
    }
}
