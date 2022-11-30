class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int num = 1;
        String str = "";
        String ans = "";
        for(int i = 0 ; i < pattern.length() ; i++){
            if(pattern.charAt(i) == 'D'){
                st.push(num);
                num++;
            }
            else
            {
                st.push(num);
                num++;
                while(st.size() > 0)
                {
                ans += st.pop();
                    
                // System.out.print(st.pop());
                }
            }
        
        
        }
        
        st.push(num);
        while(st.size() > 0){
            ans += st.pop();
                // System.out.print(st.pop());
        }
        
        return ans;
    }
    
}