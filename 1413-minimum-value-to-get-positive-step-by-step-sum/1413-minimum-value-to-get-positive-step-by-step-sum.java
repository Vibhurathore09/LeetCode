class Solution {
    public int minStartValue(int[] nums) {
        
        int minVal = 0;
        int sum = 0;
        for(int n : nums){
            sum += n;
            minVal = Math.min(sum , minVal);
        }
        return 1-minVal;
        
    }
}