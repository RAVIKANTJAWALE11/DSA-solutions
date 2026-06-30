class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        for(int i = 0 ;i<arr.length-1;i++){
            int n = i+1;
            int j = arr.length-1;
            while(n<j){
                int sum =arr[i]+arr[j]+arr[n];
                if(sum == target ) return true;
                else if(sum>target) j--;
                else n++;
            }
        }
        return false;
    }
}
