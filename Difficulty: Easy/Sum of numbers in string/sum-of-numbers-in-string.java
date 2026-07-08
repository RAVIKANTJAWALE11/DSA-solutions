class Solution {
	public int findSum(String s) {
		// code here
		int num = 0 ;
		int sum = 0 ;
		for (int i = 0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
			   num = (num*10) + (ch - '0');
			} else {
				sum+=num;
				num = 0;
			}
			
		}
		return sum+=num;
	}
}
