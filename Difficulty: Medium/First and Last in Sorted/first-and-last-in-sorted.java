import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();
        int first = -1, last = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1) first = i;  
                last = i; 
            }
        }
        
        res.add(first);
        res.add(last);
        return res;
    }
}