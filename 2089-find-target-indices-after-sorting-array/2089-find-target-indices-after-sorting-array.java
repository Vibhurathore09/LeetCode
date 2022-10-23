class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        int ub = lastOccurence(arr,target);
        int lb = firstOccurence(arr , target);
        if(ub == -1 || lb == -1){
            return new ArrayList();
        }
        for(int i = lb ; i <= ub ; i++){
            list.add(i);
        }
        return list;
        
    }
    public static int lastOccurence(int []a , int target){
        int ans = -1;
        int lo = 0;
        int hi = a.length-1;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(a[mid] == target){
                ans = mid;
                lo = mid+1;
            }
            else if(a[mid] > target){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static int firstOccurence(int [] a ,int find){
        int ans = -1;
        int lo = 0 ;
         int hi = a.length-1;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(a[mid] == find){
                ans = mid;
                hi = mid-1;
            }
            else if(a[mid] > find){
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return ans;
    }
}