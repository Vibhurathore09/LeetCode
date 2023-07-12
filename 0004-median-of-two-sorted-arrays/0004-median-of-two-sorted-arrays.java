class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // int[] arr=new int[nums1.length+nums2.length];
        // System.arraycopy(nums1,0,arr,0,nums1.length);
        // System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        // Arrays.sort(arr);
        // int n=arr.length;

        // int index=0;
        // if(arr.length%2!=0){
        //      index=n/2;
        //     return (double)arr[index];
        // }
        // else{
        //     index=n/2;
        //     return (double)(arr[index-1]+arr[index])/2;
        // }



        if(nums1.length<nums2.length){
            return findMedian(nums1,nums2);
        }

        else{
            return findMedian(nums2,nums1);
        }
    }


    private static double findMedian(int[]nums1,int[]nums2){
        int low=0;
        int high=nums1.length;

        int n=nums1.length;
        int m=nums2.length;

        while(low<=high){
            int  cut1=(low+high)/2;
            int cut2=(m+n+1)/2-cut1;
            int l1=cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
            int r1=cut1==n?Integer.MAX_VALUE:nums1[cut1];
            int l2=cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
            int r2=cut2==m?Integer.MAX_VALUE:nums2[cut2];

            if(l1<=r2 && l2<=r1){
                if((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                else {  
                    return Math.max(l1,l2);
                }
            }
            else if(l1>r2){
                high=cut1-1;
            }
            else{
                low=cut1+1;
            }
        }

        return 0.0;

    }
}