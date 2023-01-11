class Solution {
    public int minIncrementForUnique(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int count = 0;
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++ ){
            if(nums[i-1] >= nums[i]){
                count += nums[i-1]-nums[i]+1;
                nums[i] += nums[i-1]-nums[i]+1;
            }
        }
        return count;
    }
}