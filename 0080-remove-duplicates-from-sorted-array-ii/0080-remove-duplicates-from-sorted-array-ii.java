class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2;
        if(nums.length < 3){
            return nums.length;
        }
        for(int j = i ; j < nums.length ; j++){
            if(nums[j] != nums[i-2]){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}