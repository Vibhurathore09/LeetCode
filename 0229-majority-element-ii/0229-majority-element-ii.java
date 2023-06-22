class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int mini = (int)(n / 3) + 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ;i++){
            int value = map.getOrDefault(nums[i] , 0);
            map.put(nums[i] , value+1);
            
             //checking if v[i] is
            // the majority element:
            if (map.get(nums[i]) == mini) {
                list.add(nums[i]);
            }
            if (list.size() == 2) break;
        }
        return list;
    }
}