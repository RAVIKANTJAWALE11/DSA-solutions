class Solution {
	public ArrayList<String> palindromicSubstr(String s) {
		// code here
		ArrayList<String> ans = new ArrayList<>();
		for (int i = 0 ; i < s.length() ; i++) {
			int xy = i ;
			int yx = i ;
			String temp = "";
			while (xy >= 0 && yx<s.length()) {
				temp = s.substring(xy, yx + 1);
				if (s.charAt(xy) == s.charAt(yx)) {
				    if(ans.contains(temp)==false){
				        ans.add(temp);
				    }
					xy--;
					yx++;
				} else {
					break;
				}
			}
			xy = i;
			yx = i + 1;
			while (xy >= 0 && yx<s.length()) {
				temp = s.substring(xy, yx + 1);
				if (s.charAt(xy) == s.charAt(yx)) {
				 if(ans.contains(temp)==false){
				        ans.add(temp);
				    }
					xy--;
					yx++;
				} else {
					break;
				}
			}
		}
		return ans;
	}
}
