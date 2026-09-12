
class Solution {

    static class State {
        long score;
        List<Integer> indices;

        State(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    int n;
    int[][] arr;
    State[][] memo;

    public int[] maximumWeight(List<List<Integer>> intervals) {

        n = intervals.size();
        arr = new int[n][4];

        for (int i = 0; i < n; i++) {
            arr[i][0] = intervals.get(i).get(0);
            arr[i][1] = intervals.get(i).get(1);
            arr[i][2] = intervals.get(i).get(2);
            arr[i][3] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);

            if (a[1] != b[1])
                return Integer.compare(a[1], b[1]);

            return Integer.compare(a[3], b[3]);
        });

        memo = new State[n][5];

        State ans = dp(0, 4);

        int[] result = new int[ans.indices.size()];

        for (int i = 0; i < ans.indices.size(); i++) {
            result[i] = ans.indices.get(i);
        }

        return result;
    }

    State dp(int i, int remaining) {

        if (i == n || remaining == 0) {
            return new State(0, new ArrayList<>());
        }

        if (memo[i][remaining] != null) {
            return memo[i][remaining];
        }

        State skip = dp(i + 1, remaining);

        int next = findNext(i);

        State nextState = dp(next, remaining - 1);

        List<Integer> takeIndices =
                new ArrayList<>(nextState.indices);

        takeIndices.add(arr[i][3]);

        Collections.sort(takeIndices);

        State take = new State(
                arr[i][2] + nextState.score,
                takeIndices
        );

        if (take.score > skip.score) {
            memo[i][remaining] = take;
        } 
        else if (take.score < skip.score) {
            memo[i][remaining] = skip;
        } 
        else {
            if (compare(take.indices, skip.indices) < 0) {
                memo[i][remaining] = take;
            } else {
                memo[i][remaining] = skip;
            }
        }

        return memo[i][remaining];
    }

    int findNext(int i) {

        int target = arr[i][1];

        int lo = i + 1;
        int hi = n;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid][0] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    int compare(List<Integer> a, List<Integer> b) {

        int size = Math.min(a.size(), b.size());

        for (int i = 0; i < size; i++) {

            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }

        return Integer.compare(a.size(), b.size());
    }
}