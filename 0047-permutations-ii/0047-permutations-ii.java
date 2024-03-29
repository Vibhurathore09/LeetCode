class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(list , sol , nums , used);
        return list;
        
    }
    public static void backtracking(List<List<Integer>> list , List<Integer> sol , int [] nums , boolean [] used){
        if (sol.size()== nums.length){
            list.add(new ArrayList<Integer>(sol));
            return;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            if(used[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            used[i] = true;
            sol.add(nums[i]);
            backtracking(list , sol , nums , used);
            
            used[i] = false;
            sol.remove(sol.size()-1);
        }
    }
}