class Solution {
    public String reverseStr(String s, int k) {
        // String s1 = "";
        char [] ch = s.toCharArray();
        int n = s.length();
        int i = 0;
        while(i < n){
            int j = Math.min(i+k-1, n-1);
            swap(ch , i , j);
            i+=2*k;
        }
        String s1 = "";
        for(char c : ch){
            s1+=c;
        }
        return s1;
    }
    public static void swap (char ch [] , int i , int j){
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
    
}