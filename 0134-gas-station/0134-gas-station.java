class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t = 0;
        int c= 0;
        int idx = 0;
        for(int i = 0 ; i < cost.length ; i++){
            t += gas[i] - cost[i];
            c += gas[i] - cost[i];
            if(c < 0){
                c = 0;
                idx = i+1;
            }
        }
        if(t < 0){
            return -1;
        }
        return idx;
    }
}