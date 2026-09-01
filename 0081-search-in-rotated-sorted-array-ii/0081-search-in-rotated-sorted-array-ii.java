class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 ; 
        int hi = n-1;
        if(n==1 && nums[0]==target) return true;
        while(lo<hi && nums[lo]==nums[hi]) {
            if(nums[lo]==target) return true;
            lo++;
            hi--;
        }
         while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]==target) return true;
            else if(nums[lo]<=nums[mid]){
                if(nums[lo]<=target && target<=nums[mid]) hi = mid-1;
                else lo = mid+1;
            }else{
                if(nums[mid]<=target && target<=nums[hi]) lo=mid+1;
                else hi = mid-1;
            }
        }
        return false;
    }
}