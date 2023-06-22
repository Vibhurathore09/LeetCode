class Solution {
    public int majorityElement(int[] nums) {
        // Moore's voting algo
       int n = nums.length;
        
        int cnt = 0; // Count
        int el = 0; // element
        for(int i = 0 ;i  < n ; i++){
            if(cnt == 0){
                
                cnt = 1;
                el = nums[i];
               
            }
            else if(nums[i] == el){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0 ;i  < n ; i++){
            if(nums[i] == el){
                cnt1++;
            }
        }
        if(cnt1 > n/2){
            return el;
        }
        return -1;

    } 
}