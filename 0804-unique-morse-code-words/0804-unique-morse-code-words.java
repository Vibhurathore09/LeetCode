class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] n = new String[words.length];
        for(int i = 0 ; i < words.length ; i++){
            String s = "";
            char ch[] = words[i].toCharArray();
            for(int j = 0 ; j < ch.length ; j++ ){
                s += d[ch[j]-'a'];
            }
            n[i] = s;
            s= "";
        }
        HashSet<String> hs = new HashSet<>();
        for(int i = 0 ; i < words.length ; i++){
            hs.add(n[i]);
        }
        return hs.size();
    }
}