class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i < s.length() ; i++){
            if(!st.isEmpty() &&Math.abs(st.peek() - s.charAt(i)) == 32){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        char res[] = new char[st.size()];
        int i = st.size() - 1;
        while(!st.isEmpty()){
            res[i--] =st.pop();
        }
        return new String (res);
    }
}