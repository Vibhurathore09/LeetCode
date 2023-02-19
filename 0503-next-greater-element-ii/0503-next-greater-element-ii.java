class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] arr = new int[nums.length];
        Arrays.fill(arr , -1);
        // Stack<Integer> st = new Stack<>();
        // for( int i = 0 ; i < 2*n ;i++){
        //     while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
        //         arr[st.pop()] = nums[i%n];
        //     }
        //     st.push(i%n);
        // }
        // return arr;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < 2*n ; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i%n]){
                arr[st.pop()] = nums[i%n];
                
            }
            st.push(i%n);
        } 
        return arr;
    }
}