class Solution {
    public int majorityElement(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int cnt = 0;
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
            if(cnt > nums.length/2){
                return nums[i];
            }
        }
        return nums[0];
    }
}