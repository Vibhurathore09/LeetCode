class Solution {
    public int findDuplicate(int[] nums) {
        
//         Time Complexity O( n logn )
        // Arrays.sort(nums);  
        // for(int i = 1 ; i < nums.length ; i++ ){
        //     if(nums[i-1] == nums[i]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        
        
//         Time Complexity O(n)    Space Complexity O(n)
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
}