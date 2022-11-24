class Solution {
    public boolean checkIfPangram(String sentence) {
        char ch[] = sentence.toCharArray();
        int n = ch.length;
        if(n < 26){
            return false;
        }
        int a[] = new int[26];
        for(int i = 0 ; i < n ; i++)
        {
            a[ch[i]-'a']++;
        }
        for(int i=0; i < 26 ; i++){
            if(a[i] <= 0){
                return false;
            }
        }
        return true;
    }
}