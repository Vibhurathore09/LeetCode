class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        String a[] = s1.split("\s+");
        String ans = "";
        for(int i = a.length-1 ; i >= 0; i--){
         ans += a[i]+" ";   
        }
        return ans.trim();
    }
}