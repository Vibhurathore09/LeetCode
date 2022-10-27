class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        permutation(nums , list , new ArrayList<>() , new boolean[nums.length]);
        return list;
    }
    public static void permutation(int [] nums , List<List<Integer>> list , List<Integer> a , boolean [] safe){
        if(a.size() == nums.length){
            list.add(new ArrayList<>(a));
        }
        else{
            for(int i = 0 ;  i < nums.length ; i++){
                if(safe[i] || i>0 && nums[i]==nums[i-1] && !safe[i-1])
                {
                    continue;
                }
                safe[i]=true;
                a.add(nums[i]);
                permutation(nums,list,a,safe);
                safe[i]=false;
                a.remove(a.size()-1);
            }
        }
        
    }
}