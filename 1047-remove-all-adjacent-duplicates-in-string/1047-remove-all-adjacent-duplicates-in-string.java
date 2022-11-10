class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        for(int i = 0 ;i < s.length() ;i++){
            char c = s.charAt(i);
            if(st.size() > 0 && st.peek() == c){
                st.pop();
            }  else{
                st.push(c);
            }
        }
        System.out.println(st);
        Stack<Character> sta = new Stack<>();
        while(!st.isEmpty()){
            char c = st.pop();
            sta.push(c);
        } 
        System.out.println(sta);
        while(!sta.isEmpty()){
            str += sta.pop()+"";
        }
        return str;
    }
}