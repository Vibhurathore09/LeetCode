class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0 ; 
        int e = nums.length-1 ;
        int ans = 0;
        while(s <= e){
            int mid = (s-e)/2 + e;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] <= target){
                
                s = mid+1;
                ans = s;
            }
            else if(nums[mid] > target){
                
                e = mid-1;
            }
        }
        return ans;
//         
//         int start = 0;
//         int end = nums.length - 1;
        
//         while(start <= end){
//             int mid = end + ( start - end) / 2;
//             if(nums[mid] == target)
//                 return mid;
            
//             if(target < nums[mid]){
//                 end = mid - 1;
//             }else{
//                 start = mid + 1;
//             }
//         }
//         return start;
    }
}