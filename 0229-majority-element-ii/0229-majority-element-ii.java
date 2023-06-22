class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0 , cnt2 = 0 , el1 = 0 , el2 =0;
        for(int i = 0 ; i < n ; i++){
            if(cnt1 == 0 && nums[i] != el2){
                cnt1++;
                el1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != el1){
                cnt2++;
                el2 = nums[i];
            }
            else if(el1 == nums[i]){
                cnt1++;
            }else if(el2 == nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        } 
        
        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) list.add(el1);
        if (cnt2 >= mini) list.add(el2);
        HashSet<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        
        return list;
    }
}