class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> st = new Stack<>();
        // int i = 1;
        st.push(nums[0]);
        int c = 1;
        for(int i = 0 ; i < nums.length; i++){
            if(st.peek() != nums[i]){
                st.push(nums[i]);
                nums[c] = st.peek();
                c++;
            }
        } 
        return st.size();
    }
}