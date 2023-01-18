class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int x = Kadanes(nums , n);
        int y = 0 ; // here we will store total of array
        for(int i = 0 ; i  <n ; i++){
            y += nums[i];
            nums[i] = -nums[i];
        }
        int z = Kadanes(nums , n); // here we have max sum of (min part , by converting them to -ve)
     
        if(y+z == 0){
            return x; // if 
        }
        return Math.max(x,  y+z);
    }
    public int Kadanes(int []arr , int n){
        int max = arr[0];
        int curr = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(curr < 0){
                curr = 0;
            }
            curr += arr[i];
            if(max < curr){
                max = curr;
            }
        }
        return max;
    }
}