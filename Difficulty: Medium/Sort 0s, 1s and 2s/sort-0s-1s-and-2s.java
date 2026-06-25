class Solution {
    public void sort012(int[] arr) {
        // code here
        int i;
        int z=0;
        int o = 0;
        for(i=0;i<arr.length;i++){
            if(arr[i]==0) z++;
            if(arr[i]==1) o++;
        }
        for(i=0;i<z;i++){
            arr[i]=0;
        }
        for(i=z;i<z+o;i++){
            arr[i]=1;
        }
        for(i=z+o;i<arr.length;i++){
            arr[i]=2;
        }
    }
}