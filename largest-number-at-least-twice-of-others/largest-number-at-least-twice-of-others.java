class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxI = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > max){
                maxI = i;
                max = nums[i];
            }
        } 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != max && max < 2*nums[i]){
                return -1;
            }
        }
        return maxI;
    }
}