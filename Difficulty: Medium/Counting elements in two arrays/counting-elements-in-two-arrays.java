class Solution {
    public static ArrayList<Integer> countLessEq(int arr[], int b[]) {
        // code here
        ArrayList<Integer> res = new  ArrayList<>();
        Arrays.sort(b);
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int count = -1;
            int low = 0;
            int high = b.length-1;
            while(low<=high){
               int mid = low+(high-low)/2;
                if(b[mid]==arr[i]) {
                    count = mid+1;
                    low = mid+1;
                }else if(b[mid]>arr[i]) {
                    high = mid-1;
                }else low = mid+1;
            }
            if(count == -1) res.add(low);
            else res.add(count);
        }
        return res;
    }
}