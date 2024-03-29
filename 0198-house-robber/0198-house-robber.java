class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        return Robber(nums , 0 , dp);
     }
    public static int Robber(int[] arr, int i, int[] dp) {

        if (i >= arr.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = arr[i] + Robber(arr, i + 2, dp);
        int Dontrob = Robber(arr, i + 1, dp);
        return dp[i] = Math.max(rob, Dontrob);
    }
}