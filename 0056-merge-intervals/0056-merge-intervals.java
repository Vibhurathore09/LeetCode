class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int []> arr = new ArrayList<>();
        for(int [] a: intervals ){
            if(arr.size() == 0){ // if empty add new interval
                arr.add(a);
            }else{
                int prevInterval [] = arr.get(arr.size()-1); // take last interval in arr 
                if(a[0] <= prevInterval[1]){ // compare with a[0] that is 3 in [1,3] with prevInterval[1] is 6 for first iteration
                    prevInterval[1] = Math.max(prevInterval[1],a[1]);  // take max of prevInterval[1] that is 6 or a[1] that is 3
                }else{// if [1,3] we have and we get [8,10] then directly add [8,10]
                    arr.add(a); //
                }
            }
        }
        return arr.toArray(new int[arr.size()][]);
    }
}