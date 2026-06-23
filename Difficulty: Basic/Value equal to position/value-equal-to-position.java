class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =1;i<=arr.length;i++){
            if(arr[i-1] == i ) res.add(i);
        }
        return res;
    }
}
