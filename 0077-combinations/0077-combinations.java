class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combs = new ArrayList<List<Integer>>();
        recur(1 , n , k , combs , new ArrayList<Integer>());
        return combs;
    }
    public static void recur(int i , int n , int k , List<List<Integer>> ans , List<Integer> list){
        if(k == 0){
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int j = i ; j <= n ; j++){
            list.add(j);
            recur(j+1 , n , k-1 , ans , list);
            list.remove(list.size()-1);
        }
    }
}