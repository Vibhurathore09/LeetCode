class Solution {
    public int[] sortArrayByParity(int[] a) {
        for(int i = 0 , j = 0 ; i < a.length;i++){
            if(a[i] % 2 ==0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        return a;
    }
}