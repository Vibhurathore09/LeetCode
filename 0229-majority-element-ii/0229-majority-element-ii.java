class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(!(list.contains(nums[i])) || list.size() == 0 ){
                int cnt = 0;
                for(int j = 0 ; j < n ; j++){
                    if(nums[i] == nums[j]){
                        cnt++;
                    }
                }
                if(cnt > n/3){
                    list.add(nums[i]);
                }
            }
        }
        return list;
    }
}