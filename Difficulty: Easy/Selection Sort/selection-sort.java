class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] > arr[j]) { 
                    // Swapping elements
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
            } 
        } 
    }
}