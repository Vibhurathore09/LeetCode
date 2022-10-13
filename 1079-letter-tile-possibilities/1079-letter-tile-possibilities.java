class Solution {
    public int numTilePossibilities(String str) {
        int arr [] = new int[26];
        for(int i = 0 ; i <str.length() ; i++){
            int idx = str.charAt(i)-'A';
            arr[idx]++; 
        }
        int cnt = Tile_Possibilites(arr, str);
        // System.out.println(cnt);
        return cnt;
    }
    public static int Tile_Possibilites(int [] freq , String ans){
        int count = 0;
        // System.out.println(ans);
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i] >= 1){
                char ch = (char) (i+'A');
                freq[i]--;
                count += Tile_Possibilites(freq , ans+ch) + 1;
                freq[i]++;
            }
        }
        return count;
    }
}