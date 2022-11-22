class Solution {
    public List<List<Integer>> groupThePeople(int[] a) {
        int n = a.length;
        HashMap<Integer , List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++){
            int curr = a[i];
            List<Integer> t = new ArrayList<>();
            if(map.containsKey(curr)){
                t = map.get(curr);
            }
            t.add(i);
            map.put(curr , t);
            if(t.size() == curr){
                list.add(t);
                map.remove(curr);
            }
            
        }
        return list;
    }
}