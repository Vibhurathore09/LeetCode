class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
       int a[] = new int[26];
        for(int i = 0 ; i< magazine.length() ; i++){
            char c = magazine.charAt(i);
            a[c-'a']++;
        }
        int b[] = new int[26];
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            b[c-'a']++;
        }
        int cnt = 0;
        for(int i = 0 ; i < ransomNote.length() ; i++){
            char c = ransomNote.charAt(i);
            if(b[c-'a'] <= a[c-'a']){
                cnt++;
            }
        }
        if(cnt == ransomNote.length())
        return true;
        
        return false;
        
    }
}