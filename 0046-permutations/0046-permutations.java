class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutation(list , new ArrayList<Integer>() , nums , 0);
        return list;
    }
    public static void permutation(List<List<Integer>> list , ArrayList<Integer> sol , int [] nums , int idx){
        if(sol.size() == nums.length){
            list.add(new ArrayList<Integer>(sol));
        }    
        for(int i = 0; i < nums.length ; i++){
            if(sol.contains(nums[i])){
                continue;
            }
            sol.add(nums[i]);
            permutation(list , sol , nums , idx+1);
            sol.remove(sol.size()-1);
        }
    }
}