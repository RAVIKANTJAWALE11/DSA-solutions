class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        int carry = 1;
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = n-1 ;i>=0;i--){
          sum  = arr[i] + carry;
          res.add(sum%10);
          sum/=10;
          carry = sum;
        }
        if(carry!=0){
            res.add(carry%10);
        }
        int [] ans = new int [res.size()];
        for(int i = res.size()-1;i>=0;i--) {
            ans[res.size()-1-i] = res.get(i);
        }
        return ans;
    }
}