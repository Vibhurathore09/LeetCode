class Solution {
    public int maxProfit(int[] prices) {
       int lsf = Integer.MAX_VALUE;
        int prof = 0;
        int max = 0;
        int n = prices.length;
        
        int msf = Integer.MIN_VALUE;
        for(int i = 0 ;  i < n ; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            prof = prices[i]-lsf;
            if(max < prof)
            {
                max = prof;
            }
        }
        return max;
    }
}