class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        int i =0, j = 0 ;
        int n =word1.length() , m = word2.length();
        while( i < n || j < m){
            if(i < n){
                s.append(word1.charAt(i++));
            }
            if(j < m){
                s.append(word2.charAt(j++));
            }
        }
        return s.toString();
    }
}