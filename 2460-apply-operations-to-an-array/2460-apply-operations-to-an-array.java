class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]){
                nums[i-1] = 2*nums[i-1];
                nums[i] = 0;
            }
        }
        // int c=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] >0){
                 list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        for(int i=list.size();i<nums.length;i++)
        {
            nums[i]=0;
        }
        return nums;
    }
}