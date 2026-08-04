class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int start = Integer.MAX_VALUE;
        int end = 0;
        for(int i : nums){
            start = Math.min(start,i);
            end = Math.max(end,i);
        }
        int [] arr = new int [end+1];
        for(int i : nums){
            arr[i]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=start ;i<=end ; i++){
            if(arr[i]==0) res.add(i);
        }
        return res;
    }
}