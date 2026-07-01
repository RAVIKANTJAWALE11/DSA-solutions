class Solution {
	public int mostFreqEle(int[] arr) {
		// code here
		Arrays.sort(arr);
		int n = arr.length;
		int maxcount = 1;
		int count = 1;
		int res = arr[0];
		if (n == 1)
			return res;
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] == arr[i - 1])
				count++;
			else
				count = 1;
			
			if (maxcount <= count) {
				maxcount = count;
				res = arr[i];
			}
		}
		return res;
	}
}
