class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        boolean[] res = new boolean[n + 1];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (res[arr[i]] == true) ans.add(arr[i]);
            else res[arr[i]]=true;
        }
        return ans;
    }
}