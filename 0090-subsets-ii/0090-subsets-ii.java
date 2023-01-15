class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        subset(list , new ArrayList<Integer>() , nums , 0 );
        return list;
    }
    public void subset(List<List<Integer>> list , ArrayList<Integer> sol , int [] arr , int idx){
        list.add(new ArrayList<Integer>(sol));
        for(int i = idx ; i < arr.length ; i++){
            if(i != idx && arr[i] == arr[i-1]){
                continue;
            }
            sol.add(arr[i]);
            subset(list , sol , arr , i+1);
            sol.remove(sol.size()-1);
        }
    }
}