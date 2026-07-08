import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(findFirst(arr, x));
        res.add(findLast(arr, x));
        
        return res;
    }
    
    private int findFirst(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                first = mid;       
                high = mid - 1;  
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    private int findLast(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int last = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == x) {
                last = mid;        
                low = mid + 1;     
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
}