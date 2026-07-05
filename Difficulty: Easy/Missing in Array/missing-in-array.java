class Solution {
	long missingNum(int arr[]) {
		// code here
		long n = arr.length + 1;
		long sum = n*(n + 1)/2;
		long arrsum = 0;
		
		for (int i = 0 ; i<arr.length ; i++) {
			arrsum += arr[i];
		}
		return  sum - arrsum;
	}
}
