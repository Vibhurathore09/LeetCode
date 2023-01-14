class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        combinations(list , new ArrayList<Integer>() , target , 0 , candidates );
        return list;
    }
    public static void combinations(List<List<Integer>> list , ArrayList<Integer> ans , int target, int i, int [] arr ){
        if(i == arr.length){
            if( target == 0){
                list.add(new ArrayList<>(ans));
            }
            return ;
        }
        
        if(arr[i] <= target){
            ans.add(arr[i]);
            combinations(list , ans , target-arr[i] , i,  arr );
            ans.remove(ans.size()-1);
        }
        combinations(list , ans , target , i+1  , arr);
    }
}