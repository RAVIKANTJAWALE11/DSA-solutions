class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                list1.add(nums[i]);
            }else if(nums[i]==1){
                list2.add(nums[i]);
            }else{
                list3.add(nums[i]);
            }
        }
        list1.addAll(list2);
        list1.addAll(list3);
        for(int i=0;i<n;i++){
            nums[i]=list1.get(i);
        }

    }
}