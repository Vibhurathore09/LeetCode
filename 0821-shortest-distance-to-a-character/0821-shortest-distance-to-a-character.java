class Solution {
    public int[] shortestToChar(String s, char c) {
        char ch[] = s.toCharArray();
        int a[] = new int[ch.length];
        int pos = -ch.length;
        for(int i = 0 ; i < s.length() ; ++i){
            if(ch[i] == c){
                pos = i;
            }
            a[i] = Math.abs(i-pos);
        }
        for(int i = s.length() - 1; i >= 0; --i){
            if(ch[i] == c){
                pos = i;
            }
            a[i] = Math.min(a[i] , Math.abs(pos-i));
        }
        return a;
    }
}