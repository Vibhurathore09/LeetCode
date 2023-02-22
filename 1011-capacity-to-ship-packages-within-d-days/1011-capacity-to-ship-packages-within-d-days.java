class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        int n = weights.length;
        int sum = 0;
        for(int i = 0 ; i < n; i++){
            sum += weights[i];
        }
        int ans = 0;
        int e = sum;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(isPossible(weights , n , days , mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
    public static boolean isPossible(int [] arr , int n, int days , int mid){
        int currSum = 0;
        int day = 1;
        for(int i = 0 ; i < n ; i++){
            if(currSum + arr[i] <= mid){
                currSum += arr[i];
            }else{
                day++;
                if(day > days || arr[i]>mid){
                    return false;
                }
                currSum = arr[i];
            }
        }
        return true;
    }
}