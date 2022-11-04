class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int right = 0;
        int left = s.length()-1;
        char ch[] = s.toCharArray();
        while(right < left){
            if(!set.contains(ch[right])){
                right++;
            }
            else if(!set.contains(ch[left])){
                left--;
            }
            else{
                char temp = ch[right];
                ch[right] = ch[left];
                ch[left] = temp;
                left--;
                right++;
            }
        }
        return new String(ch);
    }
}