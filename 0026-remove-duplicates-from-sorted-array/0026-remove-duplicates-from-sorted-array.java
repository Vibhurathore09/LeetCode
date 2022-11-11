class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            hs.add(nums[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);
        Iterator<Integer> i = list.iterator();
        int j = 0;
         while(i.hasNext())  
           {  
           nums[j] = i.next(); 
             j++;
           }  
        return hs.size();
        
    }
}