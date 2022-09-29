class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        return ans(list , n , 0 , 0 , "");
    } 
    public static List<String> ans(List<String> l , int n , int open , int close , String str){
        if(open == n && close == n){
            if(str.length() == 2*n){
                l.add(str);
                str = "";
            }
        }
        
            if(open < n )
            {
                ans(l , n , open+1 , close , str+"(");
               
            }
            if(open > close)
                ans(l , n , open , close+1 , str+")");
        return l;
    }
}