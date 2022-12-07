class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
double d=0.0f;
long[]nums3=new long[nums1.length+nums2.length];
if(nums1.length>=nums2.length)
{ int i;
for(i=0;i<nums1.length;i++)
{
nums3[i]=nums1[i];
}
for(int j=0;j<nums2.length;j++)
{
nums3[i]=nums2[j];
i++;
}
}
else if(nums2.length>=nums1.length)
{
int i;
for(i=0;i<nums2.length;i++)
{
nums3[i]=nums2[i];
}
for(int j=0;j<nums1.length;j++)
{
nums3[i]=nums1[j];
i++;
}
}
Arrays.sort(nums3);
if(nums3.length%2==0)
{
int mid=nums3.length/2;
int mid1=(nums3.length/2)-1;
d = (nums3[mid]+nums3[mid1])/2.0;
}
else if(nums3.length%2!=0)
{
int mid=(nums3.length-1)/2;
d=nums3[mid];
}
return d;
}
}