class Solution {
    public int removePalindromeSub(String s) {
        if(s.length() == 0){
            return 0;
        }
        String str = reverse(s);
        System.out.println(str);
        if(s.equals(str)){
            return 1;
        }
        return 2;
    }
    public static String reverse(String s){
        char ch [] = s.toCharArray();
        int i = 0 ;
        int j = s.length()-1;
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        } 
        return new String(ch);
    }
    
}