class Solution {
    public int[] applyOperations(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }

        }
        int n =0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
            
                n++;
            }
        }
        return arr;
    }
}