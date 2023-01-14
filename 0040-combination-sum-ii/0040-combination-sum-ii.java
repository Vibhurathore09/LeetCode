class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(list , new ArrayList<Integer>() , 0 , target , candidates );
        return list;
    }
    public void combination(List<List<Integer>> list , ArrayList<Integer> sol , int i , int target , int [] arr){
        if( target == 0){
            list.add(new ArrayList<Integer>(sol));
        }
        for(int idx = i ; idx < arr.length ; idx++){
            if(arr[idx] > target){
                break;
            }
            if(idx > i && arr[idx] == arr[idx-1]){
                continue;
            }
            sol.add(arr[idx]);
            combination( list , sol , idx+1 , target-arr[idx] , arr);
            sol.remove(sol.size()-1);
        }        
    }
}