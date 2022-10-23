class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i <= nums[n-1] ; i++){
            int len = firstOccurence(nums , i);
            // System.out.println()
            if(n - len == i){
                return i;
            }
            
        }
        return -1;
    }
    public static int firstOccurence(int []a , int target){
        // int ans = -1;
        int lo = 0;
        int hi = a.length-1;
        while(lo+1 < hi){
            int mid = (hi-lo)/2 + lo;
            if(a[mid] >= target){
                hi = mid;
                
            }else{
                lo = mid;
            }
        }
        if(a[lo] >= target){
            return lo;
        }
        return hi;
    }
}